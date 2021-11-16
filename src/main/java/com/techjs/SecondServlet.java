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
 * Servlet implementation class SecondServlet
 */

public class SecondServlet extends HttpServlet 
{

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		PrintWriter out = resp.getWriter();
		Cookie cookies[] = req.getCookies();
		for (Cookie cookie : cookies) 
		{
			if(cookie.getName().equals("cname"))
			{
				out.println(cookie.getValue());
			}
			
		}
		out.close();
	}

}
