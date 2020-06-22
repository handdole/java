package 부품만들기;

public class dog {
	String name;
	int age;
	char gender;
	
	public void eat(String food) {
		System.out.println(food + "먹다");
	}
	public void bark(int min , String at , String how) {
		System.out.println(min+"분동안"+at+"에서"+how+"짖다");
	}
	public void wave(String power,int min) {     // () 안에다가 임시변수를 만들수있다. 
		// 매개변수 parameter , wave 라는 매서드 안에서만 사용가능 즉 , 지역변수이다~
		System.out.println(min+"분동안 "+ power+"꼬리를 흔들다.");
	}
	@Override
	public String toString() {
		return "갱얼쥐 [이름=" + name + ", 나이=" + age + ", 성별=" + gender + "]";
	}
	
	
	
}
