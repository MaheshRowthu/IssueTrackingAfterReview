package com.track.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.track.dao.TechEngineerDao;
import com.track.dao.TechEngineerDaoImpl;
import com.track.model.Issue;
import com.track.model.TechEngineer;

/**
 * Servlet implementation class AdminAssignToEngineer
 */
@WebServlet("/AdminAssignToEngineer")
public class AdminAssignToEngineer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getRootLogger();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminAssignToEngineer() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		log.debug("Servlet Called");
		System.out.println("servletOfAssign");
		int issueId = Integer.parseInt(request.getParameter("issueId"));
		int priority = Integer.parseInt(request.getParameter("priority"));
		log.debug("priority is" + priority);
		request.setAttribute("priority", priority);
		log.debug("issue id is" + issueId);
		Issue issueObj = new Issue(issueId, priority);
		TechEngineerDao techDao = new TechEngineerDaoImpl();
		List<TechEngineer> techTeamList = techDao.assignToTechEngineer();
		log.trace(techTeamList);
		log.debug(techTeamList);
		request.setAttribute("techTeamList", techTeamList);
		request.setAttribute("currentIssueId", issueObj.getIssId());
		request.getRequestDispatcher("AdminAssignToEngineer.jsp").forward(request, response);

	}

}
