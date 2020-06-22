package 변수;

public class 기본형 {
	static String name;
//	int age = 200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		기본형 데이터 - 해당 타입의 값이 들어가는 데이터
//		숫자
//			정수 : int
//			실수 : double
//		문자(한글자) : char   # 자바에서는 스트링이 기본형이 아니다. 스트링은 자바에서 참조형
//		논리(bool) : boolean (true/false)
		
		//선언!!! => 타입을 쓰고 변수명을 써주는 행위.
		//램에 공간이 만들어진다.(공간을 할당한다.)
		int age = 100;  // 정수 (-21억 ~ 21억) 4바이트 
		double eye = 0.7; // 실수 (소수점 16자리) 8바이트
		char gender = '남';  // 문자는 한글자 2바이트
		boolean food = true; // 트루 같은것은 예약어 => 현재 팥죽색인 것들 (★예약어는 변수나 이름으로 사용할 수 없다) 1바이트
		System.out.println("나의 나이는 "+age+"세");
		System.out.println("나의 시력은 "+eye);
		System.out.println("나의 성별은 "+gender+"자");
		System.out.println("나는 점심을 먹었을까요? "+food);
		name = "홍길동";
		System.out.println(name);
	}

}
