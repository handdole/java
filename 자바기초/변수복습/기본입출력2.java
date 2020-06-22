package 변수복습;

import javax.swing.JOptionPane;

public class 기본입출력2 {

	public static void main(String[] args) {
		//나이를 입력해서 , 내년 나이를 구해보세요.
		//Integer,parseInt()를 이용
		
		//키를 입력해서 , 내년 키를 구해보세요.
		//Double.parseDouble()
		
		String age = JOptionPane.showInputDialog("올해 나이는?");
		int realAge = Integer.parseInt(age);
		System.out.println("내년 나이는 "+ (realAge + 1)+"입니다.");
		String height = JOptionPane.showInputDialog("키입력");
		double realHeight = Double.parseDouble(height);
		System.out.println("내년 키는 "+(realHeight + 5)+"입니다.");
		
		//아침을 먹었나요? true
		String food = JOptionPane.showInputDialog("아침을 먹었나요?");
		boolean realFood = Boolean.parseBoolean(food);
		System.out.println("아침을 먹었는지 여부 ");
		
		if(realFood == true) {
			System.out.println("배가 부르시곘군요");
			
		}
		else {
			System.out.println("배가 고프시겠군요");
		}
	}

}
