package com.web.team1.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web.team1.enums.Action;
import com.web.team1.command.*;
@WebServlet("/login.do")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(String.format("★★★ 1. 서블릿 들어옴 ★★★ %s,%s,%s",request.getParameter("page")
				,request.getParameter("action"),request.getParameter("eName")));
		
		Receiver.init(request);
		/*
		 * switch (Action.valueOf(request.getParameter("action").toUpperCase())) { case
		 * CREATE : request.setAttribute("page", "join"); break; case LOGIN :
		 * request.setAttribute("page", "main"); break; case MOVE :
		 * request.setAttribute("page", "main"); break; default : break; }
		 */
		
		
		System.out.println(String.format("★★★ 1. 서블릿 들어옴 ★★★ %s,%s",request.getParameter("page")
				,request.getParameter("action")));
		//request.setAttribute("page", );
		Sender.forward(request, response);
	}
}