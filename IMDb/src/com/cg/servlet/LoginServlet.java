package com.cg.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	    String name=request.getParameter("Uname");  
	    String pwd=request.getParameter("pwd");  
	    if(LoginDAO.login(name, pwd)){  
	        RequestDispatcher rd=request.getRequestDispatcher("index.html");  
	        rd.forward(request,response);  
	    }  
	    else{  
	        
	        RequestDispatcher rd=request.getRequestDispatcher("Registration.html");  
	        rd.include(request,response);  
	    }  
	          
	    out.close();  
	}

}