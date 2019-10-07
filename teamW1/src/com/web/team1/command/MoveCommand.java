package com.web.team1.command;

import javax.servlet.http.HttpServletRequest;


public class MoveCommand extends Command {
	
	public MoveCommand(HttpServletRequest request) {
		System.out.println(request.getParameter("empNo"));
		super.setRequest(request);
		setAction(request.getParameter("action"));
		setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		setPage(request.getParameter("page"));
		//super.execute();
	}
}
