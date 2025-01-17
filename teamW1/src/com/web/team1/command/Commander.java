package com.web.team1.command;

import javax.servlet.http.HttpServletRequest;

import com.web.team1.enums.Action;

public class Commander {

	public static Command direct(HttpServletRequest request) {
		Command cmd = null;
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		case CREATE : cmd = new CreateCommand(request); break;
		case SEARCH : cmd = new SearchCommand(request); break;
		case MOVE : cmd = new MoveCommand(request); break;
		case LOGIN : cmd = new LoginCommand(request); break;
		default : break; 
		}
		return cmd;
	}
}
