package com.web.team1.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.web.team1.dao.DepartmentDAO;
import com.web.team1.factory.DatabaseFactory;
import com.web.team1.pool.Constants;

public class DepartmentDAOImpl implements DepartmentDAO{
	private static DepartmentDAOImpl instance = new DepartmentDAOImpl();
	public static DepartmentDAOImpl getInstance() {
		return instance;
	}
	private DepartmentDAOImpl() {}
	
	@Override
	public List<String> selectDName() {
		List<String> dNames = new ArrayList<String>();
		try {
			String sql = "SELECT DNAME \r\n" + 
					"FROM DEPT";
			PreparedStatement stmt = DatabaseFactory
					.createDatabase(Constants.VENDOR)
					.getConnection().prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				dNames.add(rs.getString("DNAME"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dNames;
	}

}
