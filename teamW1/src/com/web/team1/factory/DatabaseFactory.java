package com.web.team1.factory;

import com.web.team1.enums.DB;
import com.web.team1.pool.Constants;
public class DatabaseFactory {
	
	public static Database createDatabase(String vendor) {
		Database db = null;
		switch (DB.valueOf(vendor)) {
		case ORACLE: db = new Oracle();
			
		  break;

		default:
			break;
		}
		
		return db;	
	}
	

}
