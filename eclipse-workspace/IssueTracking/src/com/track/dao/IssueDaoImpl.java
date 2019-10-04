package com.track.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.track.connect.DbConnection;
import com.track.model.Issue;

public class IssueDaoImpl implements IssueDao {
	private static final Logger log = Logger.getRootLogger();

	DbConnection sc = new DbConnection();
	PreparedStatement ps = null;

	ResultSet rs = null;

	@Override
	public Issue checkStatus(Issue i) {

		return null;
	}

	public List<Issue> viewRaisedTickets() {
		String sql = "select empid,issueid,issuetype,issuedesc,priority,status,postedon,solvedon,techid from Issue where status=?";
		List<Issue> raisedIssueList = new ArrayList<>();
		try {
			ps = DbConnection.getConnection().prepareStatement(sql);

			String status = "At Admin";
			ps.setString(1, status);
			rs = ps.executeQuery();
			while (rs.next()) {
				log.debug(rs);
				raisedIssueList.add(getRaisedTicketResultSet(rs));

			}
			rs.close();
			ps.close();

		} catch (SQLException e) {
			log.error(e);
		}

		return raisedIssueList;
	}

	private Issue getRaisedTicketResultSet(ResultSet rs) {
		try {
			int empId = rs.getInt(1);
			int issueId = rs.getInt(2);
			String issueType = rs.getString(3);
			String issueDesc = rs.getString(4);
			int priority = rs.getInt(5);
			String status = rs.getString(6);
			String postedOn = rs.getString(7);
			String solvedOn = rs.getString(8);
			int solvedBy = rs.getInt(9);

			Issue issueListRaisedObj = new Issue(empId, issueId, issueType, issueDesc, priority, status, postedOn,
					solvedOn, solvedBy);
			log.debug(issueListRaisedObj);
			log.trace(issueListRaisedObj);
			return issueListRaisedObj;
		} catch (Exception e) {
			log.error(e);
		}
		return null;
	}

	@Override
	public Issue assignIssueToEngineer(Issue issueObj) {
		String sql = "update issue set techid=? , status=?,priority=? where issueid=?";
		try {
			ps = DbConnection.getConnection().prepareStatement(sql);

			ps.setInt(1, issueObj.getTechId());
			ps.setString(2, "At TechTeam");
			ps.setInt(3, issueObj.getPriority());
			System.out.println("priority in method" + issueObj.getPriority());
			ps.setInt(4, issueObj.getIssId());
			log.debug("issueid going to assign is :" + issueObj.getIssId());
			ps.executeUpdate();
			
			
			ps.close();

		} catch (SQLException e) {
			log.error(e);
		}
		return null;
	}

	@Override
	public List<Issue> viewOfAssignIssue() {
		String sql = "select empid,issueid,issuetype,issuedesc,priority,status,postedon,techid from Issue where status=?";

		List<Issue> viewOfAssignIssueListObj = new ArrayList<>();
		try {
			ps = DbConnection.getConnection().prepareStatement(sql);

			String status = "At TechTeam";
			ps.setString(1, status);
			rs = ps.executeQuery();
			while (rs.next()) {
				log.debug(rs);
				viewOfAssignIssueListObj.add(getAssignIssueResultSet(rs));

			}
			rs.close();
			ps.close();

		} catch (SQLException e) {
			log.error(e);
		}
		return viewOfAssignIssueListObj;
	}

	private Issue getAssignIssueResultSet(ResultSet rs) {
		try {
			int empId = rs.getInt(1);
			int issueId = rs.getInt(2);
			String issueType = rs.getString(3);
			String issueDesc = rs.getString(4);
			int priority = rs.getInt(5);
			String status = rs.getString(6);
			String postedOn = rs.getString(7);
			int solvedBy = rs.getInt(8);
			log.debug("techid is......................" + rs.getInt(8));

			Issue issueListOfAssignedObj = new Issue(empId, issueId, issueType, issueDesc, priority, status, postedOn,
					solvedBy);
			log.debug(issueListOfAssignedObj);
			log.trace(issueListOfAssignedObj);
			return issueListOfAssignedObj;
		} catch (Exception e) {
			log.error(e);
		}

		return null;
	}

	@Override
	public List<Issue> viewOfTechTeamAssignedIssue(Issue issueObj) {
		String sql = "select empid,issueid,issuetype,issuedesc,priority,status,postedon,techid from Issue where status=? and techid=(select techid from techteam where mail=?)";

		List<Issue> viewOfTechTeamAssignedIssueListObj = new ArrayList<>();
		try {
			ps = DbConnection.getConnection().prepareStatement(sql);

			String mailId = issueObj.getMailId();
			log.debug("mailId to get techId:" + mailId);
			ps.setString(1, "At TechTeam");
			ps.setString(2, mailId);
			rs = ps.executeQuery();
			while (rs.next()) {
				log.debug(rs);
				viewOfTechTeamAssignedIssueListObj.add(getTechTeamAssignedIssueResultSet(rs));
			}
			rs.close();
			ps.close();

		} catch (SQLException e) {
			log.error(e);
		}
		return viewOfTechTeamAssignedIssueListObj;
	}

	private Issue getTechTeamAssignedIssueResultSet(ResultSet rs) {
		try {
			int empId = rs.getInt(1);
			int issueId = rs.getInt(2);
			String issueType = rs.getString(3);
			String issueDesc = rs.getString(4);
			int priority = rs.getInt(5);
			String status = rs.getString(6);
			String postedOn = rs.getString(7);
			int solvedBy = rs.getInt(8);
			log.debug("techid is......................" + rs.getInt(8));

			Issue issueListOfAssignedToTechTeamObj = new Issue(empId, issueId, issueType, issueDesc, priority, status,
					postedOn, solvedBy);
			log.debug(issueListOfAssignedToTechTeamObj);
			log.trace(issueListOfAssignedToTechTeamObj);
			return issueListOfAssignedToTechTeamObj;
		} catch (Exception e) {
			log.error(e);
		}

		return null;
	}

	@Override
	public Issue resolveTicketByTechTeam(Issue issueObj) {
		String sql = "update issue set  status=?,solvedon=? where issueid=? and techid=? ";
		try {
			ps = DbConnection.getConnection().prepareStatement(sql);
			ps.setString(1, "Resolved");
			long millis = System.currentTimeMillis();
			Date dateObj = new Date(millis);
			log.debug(dateObj);
			String date = "" + dateObj;
			ps.setString(2, date);
			ps.setInt(3, issueObj.getIssId());
			ps.setInt(4, issueObj.getTechId());

			log.debug("issueid going to resolved :" + issueObj.getIssId());
			ps.executeUpdate();
			rs = ps.executeQuery();
			DbConnection.conn.commit();
			rs.close();
			ps.close();

		} catch (SQLException e) {
			log.error(e);
		}

		return null;
	}

	@Override
	public List<Issue> adminViewOfResolvedTicket() {
		String sql = "select empid,issueid,issuetype,issuedesc,priority,status,postedon,techid from Issue where status=?";

		List<Issue> adminViewOfResolvedTicketListObj = new ArrayList<>();
		try {
			ps = DbConnection.getConnection().prepareStatement(sql);

			ps.setString(1, "Resolved");
			rs = ps.executeQuery();
			while (rs.next()) {
				log.debug(rs);
				adminViewOfResolvedTicketListObj.add(getResolvedTicketsResultSet(rs));
			}
			rs.close();
			ps.close();

		} catch (SQLException e) {
			log.error(e);
		}
		return adminViewOfResolvedTicketListObj;
	}

	private Issue getResolvedTicketsResultSet(ResultSet rs) {
		try {
			int empId = rs.getInt(1);
			int issueId = rs.getInt(2);
			String issueType = rs.getString(3);
			String issueDesc = rs.getString(4);
			int priority = rs.getInt(5);
			String status = rs.getString(6);
			String postedOn = rs.getString(7);
			int solvedBy = rs.getInt(8);
			log.debug("techid is......................" + rs.getInt(8));

			Issue resolvedTicketListToAdminObj = new Issue(empId, issueId, issueType, issueDesc, priority, status,
					postedOn, solvedBy);
			log.debug(resolvedTicketListToAdminObj);
			log.trace(resolvedTicketListToAdminObj);
			return resolvedTicketListToAdminObj;
		} catch (Exception e) {
			log.error(e);
		}

		return null;
	}

	@Override
	public List<Issue> viewOfTechTeamResolvedIssue(Issue issueObj) {
		System.out.println("view resolved tech team");
		String sql = "select empid,issueid,issuetype,issuedesc,priority,status,postedon,techid,solvedon from Issue where status=? and techid=(select techid from techteam where mail=?)";

		List<Issue> viewOfTechTeamResolvedIssueListObj = new ArrayList<>();
		try {
			ps = DbConnection.getConnection().prepareStatement(sql);

			ps.setString(1, "Resolved");
			ps.setString(2, issueObj.getMailId());
			System.out.println(issueObj.getMailId());
			rs = ps.executeQuery();
			while (rs.next()) {
				log.debug(rs);
				viewOfTechTeamResolvedIssueListObj.add(getTechTeamResolvedTicketsResultSet(rs));
			}
			rs.close();
			ps.close();

		} catch (SQLException e) {
			log.error(e);
		}

		return viewOfTechTeamResolvedIssueListObj;
	}

	private Issue getTechTeamResolvedTicketsResultSet(ResultSet rs) {
		try {
			int empId = rs.getInt(1);
			int issueId = rs.getInt(2);
			String issueType = rs.getString(3);
			String issueDesc = rs.getString(4);
			int priority = rs.getInt(5);
			String status = rs.getString(6);
			String postedOn = rs.getString(7);
			int solvedBy = rs.getInt(8);
			log.debug("techid is......................" + rs.getInt(8));
			String solvedOn = rs.getString(9);

			Issue resolvedTicketListToTechTeamObj = new Issue(empId, issueId, issueType, issueDesc, priority, status,
					postedOn, solvedBy, solvedOn);
			log.debug(resolvedTicketListToTechTeamObj);
			log.trace(resolvedTicketListToTechTeamObj);
			return resolvedTicketListToTechTeamObj;
		} catch (Exception e) {
			log.error(e);
		}
		return null;
	}
}
