package sub02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2022/09/14 
 * 이름 : 이민혁
 * 내용 : JDBC Insert 실습하기 
 * 
 */

public class InsertTest {
		public static void main(String[] args) {
			
			// DB정보
			String host = "jdbc:mysql://127.0.0.1:3306/java1db";
			String user = "root";
			String pass = "1234";
			
			
			try {
			//1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//3단계 - SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			
			//4단계
			String sql = "Insert into `user1` Values ('a101','김유신','010-1234-1111', 25); ";
			stmt.executeUpdate(sql);
			
			//5단계 - 결과처리 (Select 경우)
			
			//6단계 - 데이터베이스 종료
			stmt.close();
			conn.close();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("Insert 완료...");
		}
}
