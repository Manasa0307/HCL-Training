package com.src.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			List<Emp> emps=service.getEmployees();
			System.out.println(emps);
			request.setAttribute("employees", emps);
			RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
			rd.forward(request, response);
			
		}
}
