package DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Mysqlconnection {

	public static void main(String[] args) {
//		DB 프로그래밍 절차 
//		-----------------------------------
//		1. connector( class ) 설정
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 소문자는 패키지고 대문자로 시작하는게 클래스
			System.out.println("1. connector 연결 성공!");
			
			String url = "jdbc:mysql://localhost:3708/virus";
			String user = "root";
			String password = "1234" ;
			Connection con = DriverManager.getConnection(url, user, password);   //우리의 sql 문을 알아듣는 기능을 갖은 메소드 
			System.out.println("2. DB 연결 성공!");
			
		//		3. sql 문 결정 ( insert )
			
			String sql = "insert into member values ('kim','kim','kim','kim')";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL문 결정 성공!");
//		4. sql 문 전송 
			ps.executeUpdate();
			System.out.println("4. SQL문 전송 성공!");
			
			
			
			
		} catch (Exception e) {
			System.out.println("문제발생");
		}
		
		
	}

}
