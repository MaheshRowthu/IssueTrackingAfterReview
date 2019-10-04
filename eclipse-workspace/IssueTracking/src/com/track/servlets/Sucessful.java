package com.track.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.track.dao.EmployeeDao;
import com.track.dao.EmployeeDaoImpl;
import com.track.model.Employee;
import com.track.model.Issue;
import com.track.service.EmployeeService;
import com.track.service.EmployeeServiceImpl;

/**
 * Servlet implementation class Sucessful
 */
@WebServlet({ "/Sucessful", "/done" })
public class Sucessful extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getRootLogger();

	public Sucessful() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int empId = Integer.parseInt(request.getParameter("empId"));
		String issueType = request.getParameter("Category");
		String issueDesc = request.getParameter("IssueDesc");
		int priority = Integer.parseInt(request.getParameter("Priority"));
		Issue issue = new Issue(issueType, issueDesc, priority, empId);
		EmployeeService empser = new EmployeeServiceImpl();
		empser.raiseTicket(issue);
		request.setAttribute("mailId", request.getParameter("mailId"));
		log.debug("mailId" + request.getParameter("mailId"));
		RequestDispatcher rd = request.getRequestDispatcher("Sucess.jsp");
		rd.forward(request, response);

	}

}
