package day17;

import java.sql.Statement;
import java.util.Scanner;

import day16.DBClass;

public class UserManager {

	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(System.in);
			DBClass db = new DBClass();
			Statement stmt = db.stmt;
			
			System.out.print("아이디 : ");
			String id = scan.next();
			System.err.print("비밀번호 : ");
			String pwd = scan.next();
			System.out.print("이름 : ");
			String name = scan.next();
			
			String sql = "INSERT INTO TBL_USER (USERID, PASSWORD, USERNAME) VALUES('"
					+ id + "' ,'" + pwd +"', '" + name +"')";
			
			int result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("가입되었습니다!");
			}
			scan.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}