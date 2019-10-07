package com.web.team1.dao;

import com.web.team1.domains.DepartmentBean;
import com.web.team1.domains.EmployeeBean;

public interface EmployeeDAO {
	public void insertEmployee(EmployeeBean param);
	public EmployeeBean selectByempNoeName(EmployeeBean param,DepartmentBean db);
}
