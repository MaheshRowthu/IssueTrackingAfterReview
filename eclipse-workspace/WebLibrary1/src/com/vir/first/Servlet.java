package com.vir.first;

import java.io.File;
import java.io.FileNotFoundException;
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
 * Servlet implementation class Servlet
 */
@WebServlet({ "/Servlet", "/firstservlet" })
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int count=1;  
    /**
     * @see HttpServlet#HttpServlet()
     */
	public Servlet() {
    	super();
        // TODO Auto-generated constructor stub
    }
    
    public void init()
    {
    	System.out.println("initialising first servlet");
    	try
    	{
    		Scanner sc=new Scanner(new File("D:/WebLibrary/src/count.txt"));
    		count=sc.nextInt()+1;
    		System.out.println(count);
    		sc.close();
    	}
    	catch(FileNotFoundException e)
    	{
    		e.printStackTrace();
    	}
    }
    
    public void destroy()
    {
    	System.out.println("destroying the first servlet");
    	try
    	{
    		FileWriter f1=new FileWriter("D:/WebLibrary/src/count.txt");
    		f1.write(String.valueOf(count-1));
    		f1.close();
    		//System.out.println("after destroying count is:"+count);
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter writer=response.getWriter();
		writer.append(request.getContentType());
		System.out.println("content type:"+request.getContentType());
		System.out.println("local address:"+request.getLocalAddr());
		System.out.println("local port:"+request.getLocalPort());
		System.out.println("remote address:"+request.getRemoteAddr());
		System.out.println("remote port:"+request.getRemotePort());
		Enumeration<String> headerNames=request.getHeaderNames();
		while(headerNames.hasMoreElements())
		{
			String headerName=headerNames.nextElement();
			System.out.println("header name:"+headerName);
			System.out.println("header value:"+request.getHeader(headerName));
		}
		response.setContentType("text/html");
		writer.append("<html><title>First Servlet</title></head.");
		writer.append("<body><h1>");
		writer.append("Served at: ").append(request.getContextPath());
		writer.append("</h1>");
		writer.append("you are visitor number"+ count++ + "<br/>");
		writer.append("time on the server is :"+new Date() + "<br/>");
		writer.append("click here to go to home page <a href=\"/webLibrary\">HOME");
		writer.append("</body></html>");
	}

	private Object getLocalAddr()
	{
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
