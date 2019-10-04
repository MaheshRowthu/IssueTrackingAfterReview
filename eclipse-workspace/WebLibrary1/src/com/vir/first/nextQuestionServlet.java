package com.vir.first;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class nextQuestionServlet
 */
@WebServlet("/nextQuestionServlet")
public class nextQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String[] questions = { "who is pm of india", "who is fin min", "which company owns jdk",
			"hibernate is framework for" };
	String[][] optionsForQ = { { "manmohan singh", "apj", "patel", "Modi" }, { "arun", "amit", "ambani", "None" },
			{ "MIT", "google", "microsoft", "oracle" }, { "orm", "ui", "testing", "none" } };
	String[] answersForQ= {"d","d","d","a"};
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public nextQuestionServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		int currentQno = -1;
		for (Cookie ck : cookies) {
			System.out.println(ck.getName() + ":" + ck.getValue());
			if (ck.getName().equals("questionNumber")) {
				currentQno = Integer.parseInt(ck.getValue());
			}
		}
		currentQno++;
		if (currentQno >= questions.length)
			currentQno = 0;
		if (currentQno == 0) {
			request.setAttribute("answers", "");
		}
		Cookie ckq = new Cookie("questionNumber", "" + currentQno);
		response.addCookie(ckq);
		request.setAttribute("question", questions[currentQno]);
		request.setAttribute("optionsForQ", optionsForQ[currentQno]);
	}

}
