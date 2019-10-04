package com.vir.first;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.virt.library.Book;
import com.virt.model.Student;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet({ "/AdminServlet", "/admin/book" })
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("this is admin servlet");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Book book=new Book(101, "java", "mahesh", 100);
		request.setAttribute("book", book);
		request.setAttribute("name","virtusa" );
		List<Student> list=new ArrayList<>();
		list.add(new Student(120,"rajesh","cse"));
		list.add(new Student(121,"mahesh","ece"));
		list.add(new Student(122,"manu","cse"));
		list.add(new Student(123,"abc","eee"));
		request.setAttribute("students", list);
		request.getRequestDispatcher("/admindata.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
