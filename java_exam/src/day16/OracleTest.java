package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleTest {
	
	public static void printData(ResultSet rs) {
		try {
			while(rs.next()) {
				String name = rs.getString("STU_NAME");
				int height = rs.getInt("STU_HEIGHT");
				
				System.out.print(name + "\t");
				System.out.println(height);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Connection conn;
		Statement stmt = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String db_id = "SYSTEM";
			String db_pw = "test1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENT");
			
			printData(rs);
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}
}