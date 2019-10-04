package com.virt.first;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**RequestReaderServlet
 * Servlet implementation class RequestReadServlet
 */
@WebServlet("/RequestReadServlet")
public class RequestReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestReadServlet() {
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
		String user=request.getParameter("userid");
		String pwd=request.getParameter("password");
		String sex=request.getParameter("sex");
		String sessionId=request.getParameter("sessionid");
		String lang1=request.getParameter("lang1");
		String lang2=request.getParameter("lang2");
		String lang3=request.getParameter("lang3");
		String difficulty=request.getParameter("difficulty");
		
		System.out.println(user);
		System.out.println(pwd);
		System.out.println(sex);
		System.out.println(sessionId);
		System.out.println(lang1);
		System.out.println(lang2);
		System.out.println(lang3);
		System.out.println(difficulty);
		
		
	}

}
