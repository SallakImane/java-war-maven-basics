package com.imane;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


public class App  extends HttpServlet {
	 public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
	     String employeeJsonString = "{ name: 'Imane Sallak', role: 'Developpeur' }";
	     PrintWriter out = response.getWriter();
		 response.setCharacterEncoding("UTF-8");
	     out.print(employeeJsonString);
	     out.flush();
	  
    }
}