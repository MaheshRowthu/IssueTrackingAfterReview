package com.nit.virt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("./Login")

public class Login extends HttpServlet {
	String user;
	String password;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	user=request.getParameter("username");
	password=request.getParameter("password");
	if(user=="mahesh" && password=="sound") {

		RequestDispatcher rd=request.getRequestDispatcher("output.jsp"); 
		rd.forward(request, response);
	}
	else {

		RequestDispatcher rd=request.getRequestDispatcher("output1.jsp"); 
		rd.forward(request, response);	
	}
	
	}
@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
