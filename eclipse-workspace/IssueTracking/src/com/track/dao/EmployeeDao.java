package com.track.dao;

import java.util.List;

import com.track.model.Employee;
import com.track.model.Issue;

public interface EmployeeDao {
	
	Employee raiseTicket(Issue i);

	Issue checkStatus(Issue i);

	Employee viewTicketsAssigned(Issue i);

	Employee viewResolvedTickets(Issue i);

	List<Issue> findTicketStatus(Issue i);

	boolean validateLogin(Employee emp);


}
