package 변수복습;

import javax.swing.JOptionPane;

public class 기본입출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//당신이 좋아하는 음식은?
		//입력을 받을 때는 무조건 String 으로 인식한다.
		String food = JOptionPane.showInputDialog("당신이 좋아하는 음식은?");
		
		//당신이 좋아하는 음식은 짜장면이군요!
		System.out.println("당신이 좋아하는 음식은 "+food+"이군요!");
		
		String age = JOptionPane.showInputDialog("나이를 입력?");
		
		//String을 -> int처리
		//100 (변환 가능 ) aaa (변환 불가능 할필요가 없음) => 그래서 분석한다라는 표현을 하는것
		int age2 = Integer.parseInt(age); // "100" -> 100
		System.out.println("내년의 내 나이는 "+(age2+1)+"세");
		
	}

}
