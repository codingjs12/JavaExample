package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBinsertEx {

	public static void printData(ResultSet rs) {
		try {
			while (rs.next()) {
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
		Scanner scan = new Scanner(System.in);

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String db_id = "SYSTEM";
			String db_pw = "test1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement();

			System.out.print("학번을 입력하세요 : ");
			String stu_no = scan.next();
			System.out.print("이름을 입력하세요 : ");
			String stu_name = scan.next();
			System.out.print("학과를 입력하세요 : ");
			String stu_dept = scan.next();

			System.out.println("INSERT INTO STUDENT(STU_NO, STU_NAME, STU_DEPT) VALUES ('" + stu_no + "', '"
					+ stu_name + "', '" + stu_dept + "')");
			int num = stmt.executeUpdate("INSERT INTO STUDENT(STU_NO, STU_NAME, STU_DEPT) VALUES ('" + stu_no + 
					"', '" + stu_name + "', '" + stu_dept + "')");

			if (num > 0) {
				System.out.println("추가되었습니다.");
			} else {
				System.out.println("오류 발생!");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
		scan.close();
	}
}