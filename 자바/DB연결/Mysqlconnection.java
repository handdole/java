package DB����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Mysqlconnection {

	public static void main(String[] args) {
//		DB ���α׷��� ���� 
//		-----------------------------------
//		1. connector( class ) ����
		try {
			Class.forName("com.mysql.jdbc.Driver"); // �ҹ��ڴ� ��Ű���� �빮�ڷ� �����ϴ°� Ŭ����
			System.out.println("1. connector ���� ����!");
			
			String url = "jdbc:mysql://localhost:3708/virus";
			String user = "root";
			String password = "1234" ;
			Connection con = DriverManager.getConnection(url, user, password);   //�츮�� sql ���� �˾Ƶ�� ����� ���� �޼ҵ� 
			System.out.println("2. DB ���� ����!");
			
		//		3. sql �� ���� ( insert )
			
			String sql = "insert into member values ('kim','kim','kim','kim')";
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL�� ���� ����!");
//		4. sql �� ���� 
			ps.executeUpdate();
			System.out.println("4. SQL�� ���� ����!");
			
			
			
			
		} catch (Exception e) {
			System.out.println("�����߻�");
		}
		
		
	}

}
