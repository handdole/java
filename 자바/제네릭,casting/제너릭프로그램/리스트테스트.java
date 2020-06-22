package 제너릭프로그램;

import java.util.ArrayList;

public class 리스트테스트 {
	public static void main(String[] args) {
		
		//제너릭 프로그램 
		//arraylist 를 만들때는 제너릭하게 만들어둔다.
		//arraylist 에 타입은 객체 생성시 결정!
		ArrayList<String> list = new ArrayList<String>();
		list.add("하이");
		list.add("헬로우");
		System.out.println(list);
		
		ArrayList<Integer> int3 = new ArrayList<Integer>();
		int3.add(100);
		int3.add(2);
		int3.add(40);
				
		
		
	}
}
