package 부품만들기;

public class Phone {
//	phone
//	------------
//	멤버 변수   => 번호 , 기종 , 색상
//	멤버 메소드   => 전화하다 , 문자하다 , 영상을 보다
//	(3개이상씩 정의)
//
//
//
//	MyRoom
//	------------
//	Fphone
//	Mphone
//	메모리 구조를 그려보시오.
		String number ;
		String model;
		String color;
		
		public void call() {
			System.out.println("휴대폰 번호 >> "+number+" 기종 >> "+model+" 색상 >> "+color+" 인 폰입니다.");
			System.out.println("전화를 겁니다.");
		}
		public void text() {
			System.out.println("휴대폰 번호 >> "+number+" 기종 >> "+model+" 색상 >> "+color+" 인 폰입니다.");
			System.out.println("문자를 보냅니다.");
		}
		public void watch() {
			System.out.println("휴대폰 번호 >> "+number+" 기종 >> "+model+" 색상 >> "+color+" 인 폰입니다.");
			System.out.println("영상을 봅니다.");
		}

}
