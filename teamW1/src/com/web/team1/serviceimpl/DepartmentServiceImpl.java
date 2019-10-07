package com.web.team1.serviceimpl;

import java.util.List;

import com.web.team1.daoimpl.DepartmentDAOImpl;
import com.web.team1.services.DepartmentService;



public class DepartmentServiceImpl implements DepartmentService{
	private static DepartmentServiceImpl instance = new DepartmentServiceImpl();
	public static DepartmentServiceImpl getInstance() {
		return instance;
	}
	private DepartmentServiceImpl() {}
	
	
	@Override
	public List<String> findDName() {
		
		return DepartmentDAOImpl.getInstance().selectDName();
	}

}