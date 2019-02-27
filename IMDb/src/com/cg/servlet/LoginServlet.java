package com.cg.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.DAO.LoginDAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet( "/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UserName=request.getParameter("uname");
		String password=request.getParameter("pwd");
		boolean status=false;
		PrintWriter pw=response.getWriter();
		pw.println(UserName);
		pw.println(password);
		LoginDAO login=new LoginDAO();
		
		try {
			status=login.Login(UserName, password);
			
			if(LoginDAO.Login(UserName,password))
			{
				RequestDispatcher dispacther=request.getRequestDispatcher("index.html");
				dispacther.forward(request, response);
			}
			else
			{
				RequestDispatcher dispacther=request.getRequestDispatcher("Registration.html");
				pw.print("username in valid");
				dispacther.forward(request, response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
		
	}

}
