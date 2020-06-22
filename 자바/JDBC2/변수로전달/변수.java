package 변수로전달;

public class 변수 {
	public void call(String name , int age) {

		System.out.println("나이는 " + age + "세 이름은 " + name + " 전달받음.");

	}
	
	public void call() {
		String hobby = "달리기";
		String company = "mega";
//		return hobby , company ;
		// 리턴을 할 때는 한번에 여러 변수를 넘길 수 없다.
		// 무조건 하나로 묶어주어야 한다.
		
		
		
		
	}
	public String call2() {
		return "ok";
	}
}
