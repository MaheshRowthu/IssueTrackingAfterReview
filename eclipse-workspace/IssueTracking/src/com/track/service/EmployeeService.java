package com.track.service;

import com.track.model.Employee;
import com.track.model.Issue;

public interface EmployeeService {
	Employee raiseTicket(Issue i);
	Employee checkStatus(Issue i);
	
}
