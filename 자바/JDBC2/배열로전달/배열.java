package 배열로전달;

public class 배열 {
	public String[] call() {
		String hobby = "달리기";
		String company = "mega";

		String[] array = { hobby, company };

//		return hobby , company ;
		// 리턴을 할 때는 한번에 여러 변수를 넘길 수 없다.
		// 무조건 하나로 묶어주어야 한다.

		return array;
	}

	public void call(String[] list) {
		System.out.println("첫번째 값은 >> " + list[0]);
		System.out.println("두번째 값은 >> " + list[1]);
		
	}
}
