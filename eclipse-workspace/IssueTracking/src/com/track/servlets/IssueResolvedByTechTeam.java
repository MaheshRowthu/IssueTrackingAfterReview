package com.track.servlets;

import java.io.IOException;

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
 * Servlet implementation class IssueResolvedByTechTeam
 */
@WebServlet("/IssueResolvedByTechTeam")
public class IssueResolvedByTechTeam extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getRootLogger();
	   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IssueResolvedByTechTeam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int issueId=Integer.parseInt(request.getParameter("currentIssueId"));
		int techId=Integer.parseInt(request.getParameter("techId"));
		IssueDao issueDao=new IssueDaoImpl();
		Issue issueObj=new Issue(issueId,techId);
		issueDao.resolveTicketByTechTeam(issueObj);
		request.setAttribute("issueId", issueId);
		request.setAttribute("techId", techId);
		log.trace(issueObj);
		request.getRequestDispatcher("StatusResolvedByTechTeam.jsp").forward(request, response);
	}

}
