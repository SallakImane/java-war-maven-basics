package com.imane;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class App  extends HttpServlet {
	 public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{

        response.setContentType("text/plain");
	    response.getWriter().write("Hello world plain text response.");
		response.getWriter().close();
    }
}