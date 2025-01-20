package day17;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import day16.DBClass;

public class UserUpdate {

	public static void main(String[] args) {
		try {
			DBClass db = new DBClass();
			Statement stmt = db.stmt;
			Scanner scan = new Scanner(System.in);
			
			while(true) {
				System.out.print("아이디 : ");
				String inputID = scan.next();
				String selectSQL = "SELECT * FROM TBL_USER WHERE USERID = '"
						+ inputID + "'";
				ResultSet rs = stmt.executeQuery(selectSQL);
				
				if(rs.next()) {
					System.out.print("나이를 입력하세요 : ");
					int inputAge = scan.nextInt();
					String updateSQL = "UPDATE TBL_USER SET AGE = " 
							+inputAge + "WHERE USERID = '" + inputID + "'";
					int result = stmt.executeUpdate(updateSQL);
					
					if(result > 0) {
						System.out.println("수정 완료");
						break;
					} else {
						System.out.println("수정 실패");
					}
					
				} else {
					System.out.println("없는 아이디입니다. 다시 입력하세요.");
				}
			}
			
			scan.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
