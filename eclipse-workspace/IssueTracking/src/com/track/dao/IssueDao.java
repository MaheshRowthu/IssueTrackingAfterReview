package com.track.dao;

import java.util.List;

import com.track.model.Issue;

public interface IssueDao {
	Issue checkStatus(Issue i);
	List<Issue> viewRaisedTickets();
	
	Issue assignIssueToEngineer(Issue issueObj);
	List<Issue> viewOfAssignIssue();
	List<Issue> viewOfTechTeamAssignedIssue(Issue issueObj);
	Issue resolveTicketByTechTeam(Issue issueDao);
	List<Issue> adminViewOfResolvedTicket();
	List<Issue> viewOfTechTeamResolvedIssue(Issue issueObj);

}
