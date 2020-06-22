package 변수복습;

public class 기본형변수 {

	public static void main(String[] args) {
		// 주석 , comment , 설명
//		컨트롤 + / (자동주석 설정, 해제)
		/*
		 * 하위 바위 홀롤로롤 => 여러줄 주석.
		 */
		System.out.println("모니터에 출력");
		System.out.println("잘 된건가?");
//		기본형 4가지 
//		정수 , 실수 , 문자 , 논리
//		자바는 변수를 할당할 때 데이터가 들어가는 타입과 크기를 결정
//		변수 앞에 타입에 해당하는 키워드를 써준다.
//		ex) int num;
//		int , double , char , boolean
//		byte(1바이트 -128~127) / int (4바이트 +-21억) ->long (8바이트)
		int num; // 선언 ! => 공간을 할당
		num = 0; // 쓰레기 값이 들어있는 상태
		long money = 22L;

		double height = 180.5;
//		float wight = 445.5; => 에러나는 이유가 컴퓨터는 445.500000000000000000000 
//								이런식으로 인식하는데 float은 8자리만 인식해서

		char level = 'A'; // 2바이트 문자 한글자
		// 자동완성 ( 컨트롤 + 스페이스바 )
		boolean coffee = false;

		// 기본형은 아닌데 너무 많이 쓰므로, 기본형처럼 간단히 쓸 수 있게 만들어 놓음.
		// 문자열 (String) => 쌍다옴표(") 사용
		String name = "홍길동길동이길동이";
		System.out.println("-----------------------");
		System.out.println("내가 좋아하는 숫자" + num);
		System.out.println("내 키" + height);
		System.out.println("내 등급은" + level);
		System.out.println("커피 마신 여부" + coffee);
		System.out.println("내 이름은" + name);

	}

}
