package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class MemberDAO {
	String url = "jdbc:mysql://localhost:3709/virus";
	String user = "root";
	String password = "1234";

//	1. 회원가입
	/**
	 * @wbp.parser.entryPoint
	 */


	
	public void update(MemberDTO member) {
		// 매개변수 (파라메터 , parameter ) , 지역변수
		System.out.println("회원가입 처리하다.");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 ok...");
//		2) 디비 연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 ok...");

//			3)sql문 결정

			String sql = "update member set  name = ? , tel = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, member.getName());
			ps.setString(2, member.getTel());
			ps.setString(3, member.getId());
			System.out.println("3. sql 문 결정 ok...");

//			4)sql문 전송
			ps.executeUpdate();
			System.out.println("4.sql문 전송 ok...");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int delete(MemberDTO2 dto) {
		// 매개변수 (파라메터 , parameter ) , 지역변수
		System.out.println("회원가입 처리하다.");
		int result = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 ok...");
//		2) 디비 연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 ok...");

//			3)sql문 결정

			String sql = "delete from member1 where name =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getName());
			System.out.println("3. sql 문 결정 ok...");

//			4)sql문 전송
			result = ps.executeUpdate();
			System.out.println("4.sql문 전송 ok...");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	

	public MemberDTO select(MemberDTO Dto) {
		// 매개변수 (파라메터 , parameter ) , 지역변수
		
		MemberDTO dto = new MemberDTO();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 ok...");
//		2) 디비 연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 ok...");

//			3)sql문 결정

			String sql = "select * from member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, Dto.getId());

			System.out.println("3. sql 문 결정 ok...");

//			4)sql문 전송
			ResultSet rs = ps.executeQuery();
			System.out.println("4.sql문 전송 ok...");
			
			
			while (rs.next()) {  
				// rs.next() 는 커서를 아래로 내리면서 
//				row의 위치를 나타내는 커서를 아래로 옮기면서 
//				그 해당 로우가 있는지 처크해주는 메소드 
//				있으면 트루 없으면 폴스
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);
				dto.setId(id);
				dto.setPw(pw);
				dto.setName(name);
				dto.setTel(tel);

			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
		
	}
	
	
	
	
	public MemberDTO2 list(MemberDTO2 Dto) {
		// 매개변수 (파라메터 , parameter ) , 지역변수
		
		MemberDTO2 dto = new MemberDTO2();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 ok...");
//		2) 디비 연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 ok...");

//			3)sql문 결정

			String sql = "select * from member1 where name =? limit 1";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, Dto.getName());

			System.out.println("3. sql 문 결정 ok...");

//			4)sql문 전송
			ResultSet rs = ps.executeQuery();
			System.out.println("4.sql문 전송 ok...");
			
			
			while (rs.next()) {  
				// rs.next() 는 커서를 아래로 내리면서 
//				row의 위치를 나타내는 커서를 아래로 옮기면서 
//				그 해당 로우가 있는지 처크해주는 메소드 
//				있으면 트루 없으면 폴스
				String name = rs.getString(1);
				String age = rs.getString(2);
				String company = rs.getString(3);
				String tel = rs.getString(4);
				dto.setName(name);;
				dto.setAge(age);
				dto.setCompany(company);;
				dto.setTel(tel);

			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return dto;
		
	}
	
	public ArrayList<MemberDTO2> list1() {
		// 매개변수 (파라메터 , parameter ) , 지역변수
		ArrayList<MemberDTO2> list = new ArrayList<>();
		MemberDTO2 dto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 ok...");
//		2) 디비 연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 ok...");

//			3)sql문 결정

			String sql = "select * from member1";
			PreparedStatement ps = con.prepareStatement(sql);

			System.out.println("3. sql 문 결정 ok...");

//			4)sql문 전송
			ResultSet rs = ps.executeQuery();
			System.out.println("4.sql문 전송 ok...");
			
			
			while (rs.next()) {  
				// rs.next() 는 커서를 아래로 내리면서 
//				row의 위치를 나타내는 커서를 아래로 옮기면서 
//				그 해당 로우가 있는지 처크해주는 메소드 
//				있으면 트루 없으면 폴스
				dto = new MemberDTO2();
				String name = rs.getString(1);
				String age = rs.getString(2);
				String company = rs.getString(3);
				String tel = rs.getString(4);
				dto.setName(name);
				dto.setAge(age);
				dto.setCompany(company);
				dto.setTel(tel);
				list.add(dto);

			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	public ArrayList<bbsDTO> bbslist() {
		// 매개변수 (파라메터 , parameter ) , 지역변수
		ArrayList<bbsDTO> list = new ArrayList<>();
		bbsDTO dto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 ok...");
//		2) 디비 연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 ok...");

//			3)sql문 결정

			String sql = "select * from bbs";
			PreparedStatement ps = con.prepareStatement(sql);
			
			
			System.out.println("3. sql 문 결정 ok...");

//			4)sql문 전송
			ResultSet rs = ps.executeQuery();
			System.out.println("4.sql문 전송 ok...");
			
			
			while (rs.next()) {  
				// rs.next() 는 커서를 아래로 내리면서 
//				row의 위치를 나타내는 커서를 아래로 옮기면서 
//				그 해당 로우가 있는지 처크해주는 메소드 
//				있으면 트루 없으면 폴스
				dto = new bbsDTO();
				String no = rs.getString(1);
				String title = rs.getString(2);
				String id = rs.getString(3);
				String content = rs.getString(4);
				dto.setNo(no);
				dto.setTitle(title);
				dto.setId(id);
				dto.setContent(content);
				list.add(dto);

			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	public ArrayList<bbsDTO> bbscontent(bbsDTO dto) {
		// 매개변수 (파라메터 , parameter ) , 지역변수
		ArrayList<bbsDTO> list = new ArrayList<>();
		bbsDTO dto2 = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 ok...");
//		2) 디비 연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 ok...");

//			3)sql문 결정

			String sql = "select * from bbs where no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getNo());
			
			System.out.println("3. sql 문 결정 ok...");

//			4)sql문 전송
			ResultSet rs = ps.executeQuery();
			System.out.println("4.sql문 전송 ok...");
			
			
			while (rs.next()) {  
				// rs.next() 는 커서를 아래로 내리면서 
//				row의 위치를 나타내는 커서를 아래로 옮기면서 
//				그 해당 로우가 있는지 처크해주는 메소드 
//				있으면 트루 없으면 폴스
				dto2 = new bbsDTO();
				String no = rs.getString(1);
				String title = rs.getString(2);
				String id = rs.getString(3);
				String content = rs.getString(4);
				dto2.setNo(no);
				dto2.setTitle(title);
				dto2.setId(id);
				dto2.setContent(content);
				list.add(dto2);

			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
}
