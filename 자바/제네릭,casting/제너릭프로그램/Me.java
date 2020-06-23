//v1.1 20200623 주석 추가

package 제너릭프로그램;

import java.util.ArrayList;

public class Me {
	public static void main(String[] args) {
		//arraylist를 만들 때 형을 선언하지 않으면 어떤 형이 들어가도 상관없다.
		//default로 object 형으로 들어감
		ArrayList list = new ArrayList();
		list.add("박한솔");
		list.add(26);
		list.add(0.4);
		list.add(false);
		list.add('남');
		
		System.out.println(list);
		
		//arraylist에서는 object형이고 따로 어떤 변수에 넣을 때는 
		//downcasting해서 변수에 넣어줘야 한다.
		String name = (String)list.get(0);
		int age = (Integer)list.get(1) + 1;
		double eye = (Double)list.get(2) + 0.2;
		boolean food = (Boolean)list.get(3);
		char gender = (Character)list.get(4);
		
		
		
		System.out.println("나의 이름은" + list.get(0) + "입니다.");
		System.out.println("나의 내년 나이는 "+ age + "입니다.");
		System.out.println("나의 시력이 조금 더 좋아지면 " + eye + "가 됩니다.");
		if (food == true) {
			
			System.out.println("나는 아침을 먹었습니다.");
		} else {
			System.out.println("나는 아침을 먹지않았습니다.");
		}
		System.out.println("나는 "+gender+"입니다.");
		
		
		
		
		
	}
}
