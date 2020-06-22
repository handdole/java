package 부품만들기;

public class 붕어빵먹자 {

	public static void main(String[] args) {
		BongABbang pop = new BongABbang(); // 팥 붕어빵 객체 생성
		pop.inside = "팥";   // 팥 붕어빵의 속 변수 지정
		pop.price = 500;     // 팥 붕어빵의 가격 변수 지정
		
		pop.eat();     // 팥 붕어빵 먹는 메소드 호출
		
		BongABbang cream = new BongABbang();   // 크림 붕어빵 객체 생성
		cream.inside = "크림";   // 크림 붕어빵의 속 변수 지정
		cream.price = 1500;		// 크림 붕어빵 가격 변수 지정
	
		cream.takeout();   // 크림 붕어빵 포장 메소드 호출
	
	
	}

}
