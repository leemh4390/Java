package sub02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2022/09/14
 * 이름 : 이민혁
 * 내용 : JDBC 업데이트 테스트 
 * 
 */

public class UpdateTest {
		public static void main(String[] args) {
			
			// DB정보
			String host = "jdbc:mysql://127.0.0.1:3306/java1db";
			String user = "root";
			String pass = "1234";
			
			try {
			//1단계
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2단계
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//3단계
			Statement stmt = conn.createStatement();
			
			//4단계
			String sql = "Update `User1` set `name`='홍길동',`hp`='010-1111-1111' ";
				   sql += "where `uid`='a101' ";
				   stmt.executeUpdate(sql);
			//5단계
		    
		    
			//6단계
			stmt.close();
			conn.close();
		    
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("Update 완료...");
			
		}
}
