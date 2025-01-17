package com.web.team1.command;

import javax.servlet.http.HttpServletRequest;

import com.web.team1.domains.DepartmentBean;
import com.web.team1.domains.EmployeeBean;
import com.web.team1.pool.Constants;
import com.web.team1.serviceimpl.EmployeeServiceImpl;

public class LoginCommand extends Command {
	public LoginCommand(HttpServletRequest request) {
	
		request.getParameter("empNo");
		request.getParameter("eName");
		request.getParameter("deptNo");
		setRequest(request);
		setDomain(request.getServletPath().substring(1,request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();
	}
	
	@Override
	public void execute() {
		
		String empNo = request.getParameter("empNo");
		String eName = request.getParameter("eName");
		String dName = request.getParameter("dName");
		EmployeeBean employee = new EmployeeBean();
		DepartmentBean db = new DepartmentBean();
		employee.setEmpNo(empNo);
		employee.setEName(eName);
		request.setAttribute("page", request.getParameter("page"));
		db.setDName(dName);
		request.setAttribute("user", EmployeeServiceImpl.getInstance().login(employee, db));
		this.view = String.format(Constants.DOUBLE_PATH,"facade", "mypage");
	}
}
