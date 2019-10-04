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

import com.track.dao.IssueDao;
import com.track.dao.IssueDaoImpl;
import com.track.model.Issue;

/**
 * Servlet implementation class AdminViewAssignIssue
 */
@WebServlet("/AdminViewAssignIssue")
public class AdminViewAssignIssue extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getRootLogger();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminViewAssignIssue() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//  Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IssueDao issueDao=new IssueDaoImpl();
		List<Issue> viewOfAssignIssueListObj = issueDao.viewOfAssignIssue();
		request.setAttribute("viewOfAssignIssueListObj", viewOfAssignIssueListObj);
		log.trace(viewOfAssignIssueListObj);
		request.getRequestDispatcher("AdminViewAssignIssue.jsp").forward(request, response);
	}

}
