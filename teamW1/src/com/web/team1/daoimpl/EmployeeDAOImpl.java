package com.web.team1.daoimpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.web.team1.dao.EmployeeDAO;
import com.web.team1.domains.DepartmentBean;
import com.web.team1.domains.EmployeeBean;
import com.web.team1.factory.DatabaseFactory;
import com.web.team1.pool.Constants;

public class EmployeeDAOImpl implements EmployeeDAO{
	private static EmployeeDAOImpl instance = new EmployeeDAOImpl();
	public static EmployeeDAOImpl getInstance() {
		return instance;
	}
	private EmployeeDAOImpl() {}
	@Override
	public void insertEmployee(EmployeeBean param) {
			try {
			String sql = "INSERT INTO EMP(EMPNO,ENAME,JOB,MGR,SAL,COMM,DEPTNO)\r\n" + 
					" VALUES(?,?,?,?,?,?,?)";
			System.out.println("다오 sql1"+param.getEmpNo());

			PreparedStatement stmt = DatabaseFactory
					.createDatabase(Constants.VENDOR)
					.getConnection().prepareStatement(sql);
			System.out.println("다오 sql2"+param.getEmpNo());
			stmt.setString(1, param.getEmpNo());
			stmt.setString(2, param.getEName());
			stmt.setString(3, param.getJob());
			stmt.setString(4, param.getMgr());
			stmt.setString(5, param.getSal());
			stmt.setString(6, param.getComm());
			stmt.setString(7, param.getDeptNo());
			System.out.println("다오 sql3"+param.getEmpNo());
			int rss = stmt.executeUpdate();
			if(rss==1) {
				System.out.println("회원가입성공");
			}else {
				System.out.println("회원가입실패");
			}
			System.out.println("=== 4 ===");
	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public EmployeeBean selectByempNoeName(EmployeeBean param, DepartmentBean db) {
		EmployeeBean employee = null;
		
		try {
			String sql = "SELECT * FROM EMP\r\n" + 
					"WHERE EMPNO LIKE ?\r\n" + 
					"AND ENAME LIKE ?\r\n" + 
					"AND DEPTNO LIKE (SELECT DEPTNO FROM DEPT WHERE DNAME LIKE ?)";
			PreparedStatement stmt = DatabaseFactory
					.createDatabase(Constants.VENDOR)
					.getConnection().prepareStatement(sql);
			stmt.setString(1, param.getEmpNo());
			stmt.setString(2, param.getEName());
			stmt.setString(3, db.getDName());
			System.out.println("마ㅣㅓㄹ니마뢰"+sql);
			ResultSet rs = stmt.executeQuery();
			System.out.println("로그인 !! ");
			while(rs.next()) {
				employee = new EmployeeBean();
				employee.setComm(rs.getString("COMM"));
				employee.setDeptNo(rs.getString("DEPTNO"));
				employee.setEmpNo(rs.getString("EMPNO"));
				employee.setEName(rs.getString("ENAME"));
				employee.setHireDate(rs.getString("HIREDATE"));
				employee.setJob(rs.getString("JOB"));
				employee.setMgr(rs.getString("MGR"));
				employee.setSal(rs.getString("SAL"));
			System.out.println("다오안에"+employee.toString());
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return employee; 
	}

}
