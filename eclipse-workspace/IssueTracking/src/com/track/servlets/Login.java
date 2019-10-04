package com.track.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.track.dao.EmployeeDao;
import com.track.dao.EmployeeDaoImpl;
import com.track.model.Employee;

/**
 * Servlet implementation class Login
 */
@WebServlet({ "/Login", "/logi" })
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getRootLogger();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String emptype = request.getParameter("type");
		String name = request.getParameter("user");
		String pass = request.getParameter("pass");
		Employee emp = new Employee(name, pass, emptype);
		EmployeeDao empDao = new EmployeeDaoImpl();
		System.out.println(emptype);
		if (emptype.equals("normal") && empDao.validateLogin(emp)) {
			Employee employee = new Employee();
			employee.setMail(emp.getMail());

			request.setAttribute("Employee", employee);
			request.getRequestDispatcher("homepageOfEmployee.jsp").forward(request, response);
			log.debug("Succeed");
			return;
		} else if (emptype.equals("admin") && empDao.validateLogin(emp)) {

			Employee employee = new Employee();
			employee.setMail(emp.getMail());

			request.setAttribute("Admin", employee);

			RequestDispatcher rd1 = request.getRequestDispatcher("homepageOfAdmin.jsp");
			rd1.include(request, response);
			log.debug("Succeed");
			return;
		} else if (emptype.equals("tech") && empDao.validateLogin(emp)) {
			Employee employee = new Employee();
			employee.setMail(emp.getMail());

			request.setAttribute("techTeam", employee);
			RequestDispatcher rd1 = request.getRequestDispatcher("homepageOfTech.jsp");
			rd1.include(request, response);
			log.debug("Succeed");
			return;
		}

		else {
			RequestDispatcher rd3 = request.getRequestDispatcher("errr.jsp");
			rd3.forward(request, response);
			log.debug("Fail");
		}

	}

}
