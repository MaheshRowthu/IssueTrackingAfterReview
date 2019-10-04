package com.track.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.track.dao.IssueDao;
import com.track.dao.IssueDaoImpl;
import com.track.model.Issue;

/**
 * Servlet implementation class TechViewResolvedTicket
 */
@WebServlet("/TechViewResolvedTicket")
public class TechViewResolvedTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getRootLogger();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TechViewResolvedTicket() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mailId=request.getParameter("mailId");
		log.debug(" Tech mail Id is:"+mailId);
		System.out.println("At tech resolved"+mailId);
		IssueDao issueDao=new IssueDaoImpl();
		Issue issueObj=new Issue(mailId);
		List<Issue> viewOfTechTeamResolvedIssueListObj = issueDao.viewOfTechTeamResolvedIssue(issueObj);
		request.setAttribute("viewOfTechTeamResolvedIssueListObj", viewOfTechTeamResolvedIssueListObj);
		
		request.getRequestDispatcher("TechViewResolvedTicket.jsp").forward(request, response);
	}

}
