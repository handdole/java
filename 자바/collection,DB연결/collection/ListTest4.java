package collection;

import java.util.ArrayList;

public class ListTest4 {

	public static void main(String[] args) {
		//부모 object / 자식 string , int , boolean .... 
		// 부모(object)에 스트링 인트 불렌 등 다 상속되어 있기 때문에 <> 안에 오브젝트가 들어 올 수 있는데
		// 만약 <>에 타입을 정해준다면 그 타입만 써야한다.
		ArrayList<String> name = new ArrayList<String>();
		name.add("홍길동");
		name.add("박길동");
		name.add("송길동");
		String a = name.get(0);
		System.out.println(a);
		
	}

}
