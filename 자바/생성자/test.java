package 생성자;

import javax.swing.JOptionPane;

public class test {
	
	static String logid;
	
		
	public static void main(String[] args) {
		String saveId = "root";
		String savePw = "1234";
		
		String id = JOptionPane.showInputDialog("아이디 치셈.");
		String pw = JOptionPane.showInputDialog("비밀번호 치셈.");
		
		if (saveId.equals(id) && savePw.equals(pw)) {
			JOptionPane.showMessageDialog(null, "로그인 되었습니다.");
			logid = id;
			news newss = new news();
			newss.news();
			mail m = new mail();
			m.mail();
		} else {
			JOptionPane.showMessageDialog(null, "아이디 혹은 비밀번호를 확인해주세요.");
		}
		
	}
}
