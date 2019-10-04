package com.track.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * Servlet implementation class RaiseTicketServlet
 */
@WebServlet({ "/RaiseTicketServlet", "/raise" })
public class RaiseTicketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getRootLogger();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RaiseTicketServlet() {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("mailId",request.getParameter("mailId"));
		log.debug("mailId is"+request.getParameter("mailId"));
		RequestDispatcher rd = request.getRequestDispatcher("raiseTicket.jsp");
		rd.forward(request, response);
	}

}
