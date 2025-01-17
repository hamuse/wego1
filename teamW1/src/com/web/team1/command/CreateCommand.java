package com.web.team1.command;

import javax.servlet.http.HttpServletRequest;

import com.web.team1.domains.DepartmentBean;
import com.web.team1.domains.EmployeeBean;
import com.web.team1.pool.Constants;
import com.web.team1.serviceimpl.EmployeeServiceImpl;

public class CreateCommand extends Command {

	public CreateCommand(HttpServletRequest request) {
		setRequest(request);
		setAction(action);
		setDomain("facade");
		
		this.execute();
	}
	@Override
	public void execute() {
		System.out.println("크리에잇커맨더진입");
		EmployeeBean param = new EmployeeBean();
		param.setEmpNo(request.getParameter("empNo"));
		param.setEName(request.getParameter("eName"));
		param.setComm(request.getParameter("comm"));
		param.setDeptNo(request.getParameter("deptNo"));
		param.setJob(request.getParameter("job"));
		param.setMgr(request.getParameter("mgr"));
		param.setSal(request.getParameter("sal"));
		EmployeeServiceImpl.getInstance().join(param);
		request.setAttribute("page", request.getParameter("page"));
		System.out.println("크리에이트!!!!!!"+param.toString());
		this.view = String.format(Constants.DOUBLE_PATH,"facade", "main");
		
	}
	
}
