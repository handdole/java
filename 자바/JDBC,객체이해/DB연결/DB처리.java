package DB����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;


public class DBó�� {
	String url = "jdbc:mysql://localhost:3708/virus";
	String user = "root";
	String password = "1234";


//	1. ȸ������
	public void insert(String id , String pw , String name , String tel) {    
		//�Ű����� (�Ķ���� , parameter ) , ��������
		System.out.println("ȸ������ ó���ϴ�.");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. Ŀ���� ���� ok...");
//		2) ��� ����
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db���� ok...");
			
			
//			3)sql�� ����
			
			String sql = "insert into member values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,id);
			ps.setString(2,pw);
			ps.setString(3,name);
			ps.setString(4,tel);
			System.out.println("3. sql �� ���� ok...");
			
//			4)sql�� ����
			ps.executeLargeUpdate();
			System.out.println("4.sql�� ���� ok...");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	2.��� ����
	public void connect() {
		System.out.println("��� ���� ó���ϴ�.");
		// 1)Ŀ���� ����
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. Ŀ���� ���� ok...");
//		2) ��� ����
			DriverManager.getConnection(url, user, password);
			System.out.println("2. db���� ok...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	3.ȸ��Ż��
	public void delete() {
		System.out.println("ȸ��Ż�� ó���ϴ�.");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. Ŀ���� ���� ok...");
//		2) ��� ����
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. db���� ok...");
//			3)sql�� ����
			String id = JOptionPane.showInputDialog("�����ϰ� ���� ���̵�");
			String sql = "delete from member where id = ? "; // ����ǥ �� ������ �𸣰ڴ� (��ݽ����� ������)
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);  // (���° ����ǥ�� , ��� ��������) ?
			System.out.println("3. sql �� ���� ok...");
			
//			4)sql�� ����
			ps.executeLargeUpdate();
			System.out.println("4.sql�� ���� ok...");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
