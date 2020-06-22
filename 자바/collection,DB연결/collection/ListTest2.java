package collection;

import java.util.ArrayList;

public class ListTest2 {
	public static void main(String[] args) {
		//arraylist 를 사용해보자.
		//배열보다 좋은 점 : 1) 크기 조정 가능 , 2) 아무타입이나 넣을 수 있음.
		// 배열과 동일 한점.
		// 1)인덱스가 있다. 2) 많은 데이터를 묶을 때 사용한다. 
		
		
		
		ArrayList list = new ArrayList();
		
		list.add("김연아"); 
		list.add("송연아");
		list.add("정연아");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1+"등은  "+list.get(i));
		}
		 
		list.remove(1);
		System.out.println(list);
		
		list.set(1, "정연우");
		System.out.println(list);
		
		list.add(1, "박연아");
		System.out.println(list);
	}
}
