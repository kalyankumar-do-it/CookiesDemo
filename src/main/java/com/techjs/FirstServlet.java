package com.techjs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */


public class FirstServlet extends HttpServlet 
{
	int num;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
    	// Creating cookie and set to response object
		Cookie ck = new Cookie("cname",req.getParameter("eName"));
		resp.addCookie(ck);
		
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		
		out.println("<form action='second' method='post'> <input type='submit'> </form>");
		out.close();
		
	}

}
