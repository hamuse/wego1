package com.web.team1.services;

import com.web.team1.domains.DepartmentBean;
import com.web.team1.domains.EmployeeBean;

public interface EmployeeService {
	
	public void join(EmployeeBean param);
	public EmployeeBean login(EmployeeBean param,DepartmentBean db);

}
