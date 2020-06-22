package 부품만들기;

public class 강아지사용 {

	public static void main(String[] args) {
		dog d1 = new dog();
		d1.age = 13;
		d1.name = "퍼피";
		d1.gender = '남'	;
		
		System.out.println("강아지 이름은 >>" + d1.name);
		d1.bark(10,"마당","왈왈");
		d1.eat("한솔");
		d1.wave("심하게",30);
		
	}

}
