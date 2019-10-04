package com.virt.first;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServletName
 */
@WebServlet({ "/FirstServletName", "/first" })
public class FirstServletName extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int cnt = 1;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FirstServletName() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() {
		System.out.println("initializing first servlet");
		try {                       
			  
			Scanner sc = new Scanner(new File("C:\\Users\\admin\\eclipse-workspace\\WebLibrary\\src\\count.txt"));
			cnt = sc.nextInt() + 1;

			System.out.println("initially :" + cnt + 1);
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void destroy() {
		System.out.println("destroying servlet");
		try {
			FileWriter f1 = new FileWriter("C:\\Users\\admin\\eclipse-workspace\\WebLibrary\\src\\count.txt");
			f1.write(String.valueOf(cnt - 1));
			f1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer = response.getWriter();
		writer.append(request.getContentType());
		System.out.println("content type : " + request.getContentType());
		System.out.println("local address: " + request.getLocalAddr());
		System.out.println("local port" + request.getLocalPort());
		System.out.println("remote address: " + request.getRemoteAddr());
		System.out.println("remote port :" + request.getRemotePort());
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = headerNames.nextElement();
			System.out.println("header name :" + headerName);
			System.out.println("header value: " + request.getHeader(headerName));
		}
		response.setContentType("text/html");
		writer.append("<html><head><title>First Servlet</title></head></html>");
		writer.append("<body><h1>");
		writer.append("you are visitor number: " + cnt++ + "<br>");
		writer.append("Served at: ").append(request.getContextPath());
		writer.append("</h1>");
		writer.append("time on the server is : " + new Date() + "<br>");
		writer.append("click here to go to home page <a href=\"/WebLibray\">home</a></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
