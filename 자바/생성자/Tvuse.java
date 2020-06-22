package 생성자;

import java.lang.reflect.Parameter;

import javax.swing.JOptionPane;

public class Tvuse {
	public static void main(String[] args) {
		Tv tv = new Tv("빨강" , 50);
		//객체 생성시 각 객체에 맞는 인스턴스를 넣기위해 
		//힙 영역에 객체 별로 따로 복사되는 멤버 변수
		//인스턴스 변수 (<-> static, 정적변수)
		System.out.println(tv.toString());
		
		
		Tv yourtv = new Tv();
		//파라메터 있는 생성자와 없는 생성자를 두개 다 사용하고 싶으면 
		// tv 메소드에 파라메터 없는 생성자를 만들어주면된당.
		String color = JOptionPane.showInputDialog("티비색깔은?");
		String size = JOptionPane.showInputDialog("크기는?");
		int size2 = Integer.parseInt(size);
		yourtv.color = color;
		yourtv.size = size2;
		System.out.println(yourtv.toString());
	}

}
