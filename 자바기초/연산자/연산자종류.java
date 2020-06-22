package 연산자;

import javax.swing.JOptionPane;

public class 연산자종류 {

	public static void main(String[] args) {
		// 총 가격을 입력받으세요.
		String a = JOptionPane.showInputDialog("총 가격을 입력하세요.");
		int money = Integer.parseInt(a);
		// 총 인원수를 입력받으세요.
		String b =  JOptionPane.showInputDialog("총 인원수를 입력하세요.");
		double people = Double.parseDouble(b);
		// 한명당 얼마씩 내야하는가?(소수점)
		System.out.println(money / people);
		
		// 반복문 : 초기값 , 조건식, 증감식 
		// 0~9
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("여기가 끝");
	}

}
