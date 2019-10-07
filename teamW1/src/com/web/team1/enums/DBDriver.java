package com.web.team1.enums;

public enum DBDriver {
	ORACLE_DRIVER;
	
	@Override
	public String toString() {
		String driver = "";
		switch(this){
		case ORACLE_DRIVER :
			driver = "oracle.jdbc.OracleDriver";
			break;
		}
		return driver;
	}
}
