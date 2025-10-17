package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//https://www.mockaroo.com - 샘플데이터
public class JDBCTest2 {
//	private static String DB_URL = "jdbc:oracle:thin:@localhost:1521/xe";
	private static String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String URL = "jdbc:oracle:thin:C##ADMIN/123456@localhost:1521:xe";
	public static void main(String[] args) {
		
		String sql = "select * from car where price >= ?";
		try(Connection conn = DriverManager.getConnection(URL);
				PreparedStatement pstmt = conn.prepareStatement(sql);
				Test test = new Test();
				) {
			pstmt.setInt(1, 80000);
			//4. SQL 실행
			try(ResultSet rs = pstmt.executeQuery();){
				//5. 결과 확인
				while(rs.next()) {
					System.out.println(rs.getString("id") + " / " 
							+ rs.getString("cname") + " / " + rs.getInt("price"));
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
	}

}
