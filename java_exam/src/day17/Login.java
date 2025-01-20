package day17;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day16.DBClass;

public class Login {

	public static void main(String[] args) {

		try {
			DBClass db = new DBClass();
			Statement stmt = db.stmt;

			Scanner scan = new Scanner(System.in);

			while (true) {
				System.out.print("아이디 : ");
				String inputID = scan.next();

				System.out.print("비밀번호 : ");
				String inputPWD = scan.next();

				String selectSQL = "SELECT * FROM TBL_USER WHERE USERID = '" + inputID + "' AND PASSWORD = '" + inputPWD
						+ "'";

				ResultSet rs = stmt.executeQuery(selectSQL);
				if (rs.next()) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("로그인 실패");
				}

			}

			scan.close();
		} catch (Exception e) {

		}

	}
}