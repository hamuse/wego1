package com.web.team1.domains;

import java.io.Serializable;

import lombok.Data;
@Data
public class EmployeeBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String empNo,eName,job,mgr,hireDate,sal,comm,deptNo;

}
