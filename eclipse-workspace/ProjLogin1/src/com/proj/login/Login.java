package com.proj.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Login
 */
@WebServlet({ "/Login", "/login1" })
public class Login extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("user");
		String pass=request.getParameter("pass");
	//	boolean status;
		LoginDao logindao=new LoginDao();
		if(logindao.validate(name,pass)) {
			RequestDispatcher rd = request.getRequestDispatcher("raise.jsp");
			rd.forward(request, response);
	
			System.out.println("Succeed");
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("errr.jsp");
			rd.forward(request, response);
			System.out.println("Fail");
		}
	}

}
