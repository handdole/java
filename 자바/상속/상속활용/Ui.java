package 상속활용;

import javax.swing.JFrame;

public class Ui extends JFrame {
	//기본 생성자, new 할 때 자동을 호출되는 메소드 
	//지금 이 클레스는 jframe 의 모든 메소드를 갖고 있슴다.
	public Ui() {
		setTitle("나는 상속받은 프레임");
		setSize(500,500);
		setVisible(true);
		
	}
	
	//만약에 내가 더 확장하고 싶으면 밑에다가 새로운 메소드 만들어서 확장 
	// 밑에 메인 메소드에서 다시 실시 .
	
	
	public static void main(String[] args) {
		Ui baaam = new Ui();
	}
	
}
