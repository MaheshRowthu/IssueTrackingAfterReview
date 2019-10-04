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

import com.track.dao.IssueDao;
import com.track.dao.IssueDaoImpl;
import com.track.model.Issue;

/**
 * Servlet implementation class AdminViewRaisedTickets
 */
@WebServlet("/AdminViewRaisedTickets")
public class AdminViewRaisedTickets extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getRootLogger();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminViewRaisedTickets() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IssueDao issueDao=new IssueDaoImpl();
		List<Issue> raisedIssueList=issueDao.viewRaisedTickets();
		 
		request.setAttribute("raisedIssueList",raisedIssueList);
		log.debug(raisedIssueList);
		RequestDispatcher rd=request.getRequestDispatcher("AdminViewRaisedTicket.jsp");
		rd.forward(request, response);
		return;

	}

}
