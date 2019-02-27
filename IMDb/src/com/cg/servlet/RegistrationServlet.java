package com.cg.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.DAO.RegistrationDAO;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

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
		// TODO Auto-generated method stub
		doGet(request, response);
		boolean val=false;
		String firstName=request.getParameter("firstname");
		String lastName=request.getParameter("lastname");
		String email=request.getParameter("emailid");
		String mobileNo=request.getParameter("num");
		String userName=request.getParameter("username");
	    String pwd=request.getParameter("password");
		RegistrationDAO registration=new RegistrationDAO();
		try {
			val=registration.Registration(firstName, lastName, email, mobileNo, userName, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(val=true)
		{
		response.sendRedirect("index.html");
		
	}

	}}
