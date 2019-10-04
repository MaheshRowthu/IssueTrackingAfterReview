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
 * Servlet implementation class AdminViewResolvedTicket
 */
@WebServlet("/AdminViewResolvedTicket")
public class AdminViewResolvedTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getRootLogger(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminViewResolvedTicket() {
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
	 * @see HttpServlet#doPsost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IssueDao issueDao=new IssueDaoImpl();
		List<Issue> adminViewOfResolvedTicketListObj=issueDao.adminViewOfResolvedTicket();
		request.setAttribute("adminViewOfResolvedTicketListObj", adminViewOfResolvedTicketListObj);
		log.trace(adminViewOfResolvedTicketListObj);
		request.getRequestDispatcher("AdminViewResolvedTicket.jsp").forward(request, response);
	}

}
