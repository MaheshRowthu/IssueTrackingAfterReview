package com.track.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.track.connect.DbConnection;
import com.track.dao.EmployeeDao;
import com.track.dao.EmployeeDaoImpl;
import com.track.model.Employee;
import com.track.model.Issue;

public class EmployeeServiceImpl implements EmployeeService {
	
	DbConnection sc = new DbConnection();
	PreparedStatement stmt = null;
	ResultSet rs = null;

	@Override
	public Employee raiseTicket(Issue i) {
		EmployeeDao empdao=new EmployeeDaoImpl();
		empdao.raiseTicket(i);
		return null;
	}

	@Override
	public Employee checkStatus(Issue i) {
		return null;
	}

}
