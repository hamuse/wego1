package com.web.team1.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import com.web.team1.pool.Constants;
import com.web.team1.enums.DBDriver;
import com.web.team1.enums.DBUrl;

public class Oracle implements Database{

	@Override
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName(DBDriver.ORACLE_DRIVER.toString());
			conn = DriverManager.getConnection(DBUrl.ORACLE_URL.toString()
					,Constants.USERNAME,Constants.PASSWORD);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		return conn;
	}

}
