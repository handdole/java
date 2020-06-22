package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Member2DAO {
	String url = "jdbc:mysql://localhost:3709/virus";
	String user = "root";
	String password = "1234";

//	1. 회원가입
	/**
	 * @wbp.parser.entryPoint
	 */
	public void insert(Member2DTO dto) {
		// 매개변수 (파라메터 , parameter ) , 지역변수
		System.out.println("회원가입 처리하다.");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 ok...");
//		2) 디비 연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 ok...");

//			3)sql문 결정

			String sql = "insert into member2 values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setString(2, dto.getAge());
			ps.setString(3, dto.getCompany());
			ps.setString(4, dto.getTel());
			ps.setString(5, dto.getLoc());
			ps.setString(6, dto.getAppname());
			System.out.println("3. sql 문 결정 ok...");

//			4)sql문 전송
			ps.executeUpdate();
			System.out.println("4.sql문 전송 ok...");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	
	
}
