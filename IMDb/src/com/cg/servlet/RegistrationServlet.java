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
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean val=false;
		String firstName=request.getParameter("firstname");
		String lastName=request.getParameter("lastname");
		String email=request.getParameter("emailid");
		String mobileNo=request.getParameter("num");
		String userName=request.getParameter("username");
	    String pwd=request.getParameter("password");
		RegistrationDAO reg=new RegistrationDAO();
		System.out.println(reg);
		try {
			val=reg.registration(firstName, lastName, email, mobileNo, userName, pwd);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if(val==true)
		{
		response.sendRedirect("index.html");
		}
		else
		{
			response.sendRedirect("Registration.html");
		}

	}}
