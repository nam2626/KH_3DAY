package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCTest1 {
//	private static String DB_URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private static String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String URL = "jdbc:oracle:thin:C##ADMIN/123456@localhost:1521:xe";
	public static void main(String[] args) {
		try {
			//1. JDBC 드라이버 로딩
//			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 완료");
			//2. DB 접속
//			Connection conn = DriverManager.getConnection(DB_URL, "C##ADMIN", "123456");
			Connection conn = DriverManager.getConnection(URL);
			System.out.println("DB 접속 완료");
			//3. SQL 작성
			//	PreparedStatement 
			String sql = "select * from car";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//4. SQL 실행
			
			//5. 결과 확인

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
