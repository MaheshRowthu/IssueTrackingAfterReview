package com.track.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.track.dao.EmployeeDao;
import com.track.dao.EmployeeDaoImpl;
import com.track.model.Issue;

/**
 * Servlet implementation class TicketStatusServlet
 */

@WebServlet({ "/TicketStatusServlet", "/ticketstatus" })
public class EmpTicketStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getRootLogger();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmpTicketStatusServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
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
		String mail = request.getParameter("mailId");
		log.debug("mail from jsp is" + mail);
		if (mail != null && !mail.isEmpty()) {
			Issue issueObj = new Issue(mail);

			EmployeeDao empDao = new EmployeeDaoImpl();
			List<Issue> issueList = empDao.findTicketStatus(issueObj);
			log.debug(issueList + "With Size Of" + issueList.size());
			request.setAttribute("raisedIssueStatus", issueList);
		}

		RequestDispatcher rd = request.getRequestDispatcher("EmpCheckStatus.jsp");
		rd.forward(request, response);
	}

}
