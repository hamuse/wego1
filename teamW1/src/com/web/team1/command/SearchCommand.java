package com.web.team1.command;

import javax.servlet.http.HttpServletRequest;

import com.web.team1.domains.EmployeeBean;
import com.web.team1.pool.Constants;
import com.web.team1.serviceimpl.EmployeeServiceImpl;

public class SearchCommand extends Command {

	public SearchCommand(HttpServletRequest request) {

		request.getParameter("deptNo");
		request.getParameter("dName");
		request.getParameter("empNo");
		request.getParameter("eName");
		request.getParameter("job");
		request.getParameter("mgr");
		request.getParameter("hireDate");
		request.getParameter("sal");
		request.getParameter("comm");

	}

	@Override
	public void execute() {
		super.execute();
	}
}
