package collection;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		//MAP은 키 : 값 의 쌍으로 저장해야 하는 경우!
		HashMap dic = new HashMap();
		dic.put("apple", "사과");
		dic.put("banana", "바나나");
		dic.put("melon", "메론");
		System.out.println(dic);
		System.out.println(dic.get("melon"));
		dic.replace("apple", "사과짱");
		System.out.println(dic);
		
	}

}
