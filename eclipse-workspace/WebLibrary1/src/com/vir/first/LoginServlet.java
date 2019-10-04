package com.vir.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns={"/LoginServlet","/login"},
initParams= {
@WebInitParam(name="db",value="oracle"),
@WebInitParam(name="staticChecker",value="SonarLint")

})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		String password = request.getParameter("password");
		PrintWriter writer = response.getWriter();
		if(userid.equals("admin") && password.equals("admin"))
		{
			//writer.append("Successful login dear admin");
			request.getRequestDispatcher("/data.jsp").include(request, response);
		}
		else
		{
			//writer.append("Sorry you have failed to login. <a href = \"index1.jsp\" >GO BACK");
			request.setAttribute("errorMessage", "wrong userid or password");
			request.getRequestDispatcher("/index1.jsp").forward(request, response);
		}
		String database=getInitParameter("db");
		String staticChecker=getInitParameter("staticChecker");
		writer.append(database);
		writer.append("");
		writer.append(staticChecker);
		System.out.println(database);
		System.out.println(staticChecker);
		
	}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}