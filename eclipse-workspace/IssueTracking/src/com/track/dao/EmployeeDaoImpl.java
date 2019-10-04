package com.track.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.track.connect.DbConnection;
import com.track.model.Employee;
import com.track.model.Issue;

public class EmployeeDaoImpl implements EmployeeDao {
	private static final Logger log = Logger.getRootLogger();

	DbConnection sc = new DbConnection();
	PreparedStatement st = null;
	ResultSet rs = null;

	/* 
	 * 
	 */

	@Override
	public boolean validateLogin(Employee emp) {

		boolean status = false;

		try {
			String empType = emp.getEmptype();
			if (empType.equals("normal")) {
				st = DbConnection.conn
						.prepareStatement("select * from employee where mail=? and password=? and type=?");
				st.setString(1, emp.getMail());
				st.setString(2, emp.getPassword());
				st.setString(3, emp.getEmptype());
				log.debug("Succed emp query");
			}
			if (empType.equals("admin")) {
				st = DbConnection.getConnection()
						.prepareStatement("select * from employee where mail=? and password=? and type=?");
				st.setString(1, emp.getMail());
				st.setString(2, emp.getPassword());
				st.setString(3, emp.getEmptype());

				log.debug("Succed admin query");
			}
			if (empType.equals("tech")) {
				st = DbConnection.conn.prepareStatement("select * from techteam where mail=? and password=?");
				st.setString(1, emp.getMail());
				st.setString(2, emp.getPassword());

				log.debug("Succed tech query");
			}

			rs = st.executeQuery();

			if (rs.next()) {
				status = true;
				rs.close();
				st.close();
				DbConnection.conn.close();

			}

		} catch (NullPointerException e) {
			log.debug(e);
		} catch (SQLException e2) {
			log.debug(e2);
		}
		return status;
	}

	public Employee raiseTicket(Issue issue) {
		String sql = "insert into issue(issuetype,issuedesc,priority,status,postedon,empid) values(?,?,?,?,?,?)";
		try {
			st = DbConnection.conn.prepareStatement(sql);
			st.setString(1, issue.getIssType());
			st.setString(2, issue.getIssDesc());
			st.setInt(3, issue.getPriority());
			String status = "At Admin";
			st.setString(4, status);
			long millis = System.currentTimeMillis();
			Date dateObj = new Date(millis);
			log.debug(dateObj);
			String date = "" + dateObj;
			st.setString(5, date);
			st.setInt(6, issue.getEmpId());			
			st.executeUpdate();
			

			
			DbConnection.conn.close();
			
			st.close();

			

		} catch (SQLException e) {
			log.warn(e);
		} catch (NullPointerException e1) {
			log.warn(e1);
		}catch (Exception e2) {
			log.warn(e2);
		}
		return null;
	}

	@Override
	public List<Issue> findTicketStatus(Issue issueObj) {
		String sql = "select empid,issueid,issuetype,issuedesc,priority,status,postedon,solvedon,techid from Issue where empid=(select empid from employee where mail=?)";

		List<Issue> issueList = new ArrayList<>();
		try {
			st = DbConnection.getConnection().prepareStatement(sql);
			String mail = issueObj.getMailId();
			log.debug(mail);
			st.setString(1, mail);

			rs = st.executeQuery();
			while (rs.next()) {
				issueList.add(getTicketStatusResultSet(rs));
			}
			rs.close();
			st.close();

		} catch (Exception e) {
			log.error(e);
		}
		return issueList;
	}

	private Issue getTicketStatusResultSet(ResultSet rs) {

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

			Issue issueObj2 = new Issue(empId, issueId, issueType, issueDesc, priority, status, postedOn, solvedOn,
					solvedBy);
			log.trace(issueObj2);
			return issueObj2;
		} catch (Exception e) {
			log.error(e);
		}
		return null;
	}

	public Issue checkStatus(Issue issueObj) {
		int empId = 0;
		int issueId = 0;
		String issueType = "";
		String issueDesc = "";
		int priority = 0;
		String status = "";
		String postedOn = "";
		String solvedOn = "";
		int solvedBy = 0;
		String sql = "select empid,issueid,issuetype,issuedesc,priority,status,postedon,solvedon from Issue where empid=(select empid from employee where mail=?)";

		try {
			st = DbConnection.getConnection().prepareStatement(sql);
			String mail = issueObj.getMailId();
			log.debug(mail);
			st.setString(1, mail);

			rs = st.executeQuery();
			while (rs.next()) {
				empId = rs.getInt(1);
				issueId = rs.getInt(2);
				issueType = rs.getString(3);
				issueDesc = rs.getString(4);
				priority = rs.getInt(5);
				status = rs.getString(6);
				postedOn = rs.getString(7);
				solvedOn = rs.getString(8);
				solvedBy = rs.getInt(9);
				log.debug("" + empId + "," + issueId + "," + issueType + "," + issueDesc + "," + priority + "," + status
						+ "," + postedOn + "," + solvedOn);
				Issue issueObj2 = new Issue(empId, issueId, issueType, issueDesc, priority, status, postedOn, solvedOn,
						solvedBy);
				return issueObj2;
			}

		} catch (Exception e) {

			log.debug(e);
		}
		return null;
	}

	@Override
	public Employee viewTicketsAssigned(Issue i) {
		String sql = "select * from Issue where status='assigned'";

		try {
			st = DbConnection.getConnection().prepareStatement(sql);
			st.setInt(1, i.getIssId());
			st.setString(2, i.getIssType());
			st.setString(3, i.getIssDesc());
			st.setInt(4, i.getPriority());
			st.setString(5, i.getStatus());
			st.setString(6, i.getPostedOn());
			st.setInt(7, i.getEmpId());
			st.setInt(8, i.getTechId());
			st.setString(9, "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee viewResolvedTickets(Issue i) {
		String sql = "select * from Issue where status='resolved'";

		try {
			st = DbConnection.getConnection().prepareStatement(sql);
			st.setInt(1, i.getIssId());
			st.setString(2, i.getIssType());
			st.setString(3, i.getIssDesc());
			st.setInt(4, i.getPriority());
			st.setString(5, i.getStatus());
			st.setString(6, i.getPostedOn());
			st.setInt(7, i.getEmpId());
			st.setInt(8, i.getTechId());
			st.setString(9, "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}