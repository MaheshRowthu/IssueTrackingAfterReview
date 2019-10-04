package com.run.sound;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sound")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#HttpServlet()
	 */

	String user;
	String password;
	boolean status;
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		user = request.getParameter("username");
		password = request.getParameter("password");
		
		LoginCheck obj = new LoginCheck();
		status = obj.validate(user, password);

		if (status) {
			RequestDispatcher rd = request.getRequestDispatcher("raise.jsp");
			rd.forward(request, response);
		} else {
			//request.setAttribute("errorMessage","Wrong Credentials");
			RequestDispatcher rd = request.getRequestDispatcher("errr.jsp");
			rd.include(request, response);
			/*
			 *			request.getRequestDispatcher("errr.jsp").forward(request, response); 
			 * */
      
		}
		/*
		 * if(user.equals("mahesh") && password.equals("mahesh")) {
		 * 
		 * RequestDispatcher rd=request.getRequestDispatcher("output1.jsp");
		 * rd.forward(request, response); } else {
		 * 
		 * RequestDispatcher rd=request.getRequestDispatcher("output2.jsp");
		 * rd.forward(request, response); }
		 */
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
