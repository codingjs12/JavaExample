package day16;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {

		try {
			DBClass db = new DBClass();
			Statement stmt = db.stmt;
			Scanner scan = new Scanner(System.in);

			while (true) {
				System.out.print("[(1)학생 추가 (2) 수정 (3) 삭제 (4) 조회 (5) 종료] ");
				int menu = scan.nextInt();

				if (menu == 1) {
					String stu_no;

					while (true) {
						System.out.print("학번을 입력하세요 : ");
						String input = scan.next();
						if (input.length() == 8) {
							stu_no = input;
							break;
						} else {
							System.out.println("8글자의 학번을 입력하세요.");
						}
					}

					System.out.print("이름을 입력하세요 : ");
					String stu_name = scan.next();
					System.out.print("학과를 입력하세요 : ");
					String stu_dept = scan.next();

					String sql = "INSERT INTO STUDENT(STU_NO, STU_NAME, STU_DEPT) VALUES ('" + stu_no + "', '"
							+ stu_name + "', '" + stu_dept + "')";

					int num = stmt.executeUpdate(sql);

					if (num > 0) {
						System.out.println("추가되었습니다.");
					} else {
						System.out.println("오류 발생!");
					}

				} else if (menu == 2) {
					System.out.print("학번 : ");
					String stuNo = scan.next();
					String sql = "SELECT * FROM STUDENT WHERE STU_NO = '" + stuNo + "'";
					ResultSet rs = stmt.executeQuery(sql);
					if (rs.next()) {

						while (true) {
							System.out.println("수정할 데이터 선택");
							System.out.print("(1) 이름 (2) 학과 (3) 키 => ");

							int column = scan.nextInt();

							if (column == 1) {
								System.out.print("수정할 이름 입력 : ");
								String name = scan.next();

								String updateName = "UPDATE STUDENT SET STU_NAME = '" + name + "' WHERE STU_NO = '"
										+ stuNo + "'";
								int num = stmt.executeUpdate(updateName);
								if (num > 0) {
									System.out.println("이름이 " + name + "(으)로 수정되었습니다.");
									break;
								} else {
									System.out.println("수정 실패");
								}

							} else if (column == 2) {
								System.out.print("수정할 학과 입력 : ");
								String dept = scan.next();

								String updateDept = "UPDATE STUDENT SET STU_DEPT = '" + dept + "' WHERE STU_NO = '"
										+ stuNo + "'";
								int num = stmt.executeUpdate(updateDept);
								if (num > 0) {
									System.out.println("학과가 " + dept + "(으)로 수정되었습니다.");
									break;
								} else {
									System.out.println("수정 실패");
								}
							} else if (column == 3) {
								System.out.print("수정할 키 입력 : ");
								String height = scan.next();

								String updateHeight = "UPDATE STUDENT SET STU_HEIGHT = '" + height
										+ "' WHERE STU_NO = '" + stuNo + "'";
								int num = stmt.executeUpdate(updateHeight);
								if (num > 0) {
									System.out.println("키가 " + height + "(으)로 수정되었습니다.");
									break;
								} else {
									System.out.println("수정 실패");
								}
							} else {
								System.out.println("잘못된 메뉴");
							}
						}

					} else {
						System.out.println("해당 학번을 가진 학생 없음");
					}

				} else if (menu == 3) {

				} else if (menu == 4) {

				} else if (menu == 5) {
					System.out.println("종료 되었습니다.");
					break;

				} else {
					System.out.println("없는 메뉴 입니다.");
				}
			}
			scan.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}