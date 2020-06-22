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
	public void insert(MemberDTO member) {
		// 매개변수 (파라메터 , parameter ) , 지역변수
		System.out.println("회원가입 처리하다.");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 ok...");
//		2) 디비 연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 ok...");

//			3)sql문 결정

			String sql = "insert into member values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, member.getId());
			ps.setString(2, member.getPw());
			ps.setString(3, member.getName());
			ps.setString(4, member.getTel());
			System.out.println("3. sql 문 결정 ok...");

//			4)sql문 전송
			ps.executeLargeUpdate();
			System.out.println("4.sql문 전송 ok...");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int idover(MemberDTO member) {
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

			String sql = "select id from member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, member.getId());

			System.out.println("3. sql 문 결정 ok...");

//			4)sql문 전송
			ResultSet rs = ps.executeQuery();
			System.out.println("4.sql문 전송 ok...");
			
			if (rs.next()) { // 검색결과가 있는지 보여주는 클래스
				result = 1;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
	
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
	
	public void delete(MemberDTO dto) {
		// 매개변수 (파라메터 , parameter ) , 지역변수
		System.out.println("회원가입 처리하다.");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 ok...");
//		2) 디비 연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 ok...");

//			3)sql문 결정

			String sql = "delete from member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			
			System.out.println("3. sql 문 결정 ok...");

//			4)sql문 전송
			ps.executeUpdate();
			System.out.println("4.sql문 전송 ok...");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public MemberDTO deletepassword(MemberDTO dto) {
		// 매개변수 (파라메터 , parameter ) , 지역변수
		System.out.println("회원가입 처리하다.");
		MemberDTO mdto = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 ok...");
//		2) 디비 연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 ok...");

//			3)sql문 결정

			String sql = "select pw from member where id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());

			System.out.println("3. sql 문 결정 ok...");

//			4)sql문 전송
			ResultSet rs = ps.executeQuery();
			System.out.println("4.sql문 전송 ok...");
			
			if (rs.next()) { // 검색결과가 있는지 보여주는 클래스
				System.out.println("검색결과있음.");
				mdto = new MemberDTO();
				String pw = rs.getString(1);
				mdto.setPw(pw);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mdto;
		
	}
	
	public ArrayList<MemberDTO> all() {
		// 매개변수 (파라메터 , parameter ) , 지역변수
		
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 ok...");
//		2) 디비 연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 ok...");

//			3)sql문 결정

			String sql = "select * from member";
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
				MemberDTO dto = new MemberDTO();
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String tel = rs.getString(4);
				dto.setId(id);
				dto.setPw(pw);
				dto.setName(name);
				dto.setTel(tel);
				list.add(dto);
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
	public String login(MemberDTO dto) {
		String id ="";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넥터 설정 ok...");
//		2) 디비 연결
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db연결 ok...");

//			3)sql문 결정

			String sql = "select id from member where id=? and pw=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());

			System.out.println("3. sql 문 결정 ok...");

//			4)sql문 전송
			ResultSet rs = ps.executeQuery();
			System.out.println("4.sql문 전송 ok...");
			
			if (rs.next()) {  
				// rs.next() 는 커서를 아래로 내리면서 
//				row의 위치를 나타내는 커서를 아래로 옮기면서 
//				그 해당 로우가 있는지 처크해주는 메소드 
//				있으면 트루 없으면 폴스
				id = rs.getString(1);
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return id;
	}
	
	
}
