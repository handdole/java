package 변수;

import javax.swing.JOptionPane;

public class 윈도우 {

	public static void main(String[] args) {
//		입력 받을때는 모든 타입이 String으로 처리!!
		String name = JOptionPane.showInputDialog("이름을 입력");
		String age = JOptionPane.showInputDialog("나이를 입력");
//		당신의 주요 프로그래머 언어는 무엇인가요?
//		당신의 다음 언어는 무엇인가요?
		String program = JOptionPane.showInputDialog("당신의 주요프로그래머 언어는 무엇인가요?");
		String language = JOptionPane.showInputDialog("당신의 다음 언어는 무엇인가요?");
		
		System.out.println("당신의 나이는 " + age + "세 입니다.");
		System.out.println("당신의 이름은 "+name+" 입니다.");
		System.out.println("당신의 주요 프로그램 언어는"+program+"입니다.");
		System.out.println("당신의 다 프로그램 언어는"+language+"입니다.");
		
	}
}
