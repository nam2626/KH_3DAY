package com.kh.config;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.jdbc.pool.OracleDataSource;


public class DBManager {
	private OracleDataSource ods; 

	public DBManager() {
		try {
			ods = new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:c##scott/123456@localhost:1521:xe");
			System.out.println("DB 접속 셋팅 완료");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public Connection getConnection() throws SQLException {
		return ods.getConnection();
	}
	
}
