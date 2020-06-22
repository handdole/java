package 연산자;

public class 연산자종료 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연산자 종류
		//1. 대입 : =
		//2. 결합 : + ( 자바 특징 타입이 달라도 결합가능)
		//3. 산술 : 사칙연산자 ( +,-,*(에스테리크),/,%(나머지)
		//4. 비교: == , != , >= , >  ( 부등호 먼저 온다.)
		//5. 논리 : 조건이 여러개인 경우  , (&& - 엔퍼센트 / and 연산자 , || - 버티컬바 / or 연산자  , ! - not 연산자) 
		
		//x = y + z *(a+b) - b   = >  모든 연산의 끝은 대입이다.
		double sum = 44;   //   ram에 있는 값
		int count = 3;   //  ram에 있는 값
		// int 와  int의 계산은 무조건 int
		double avg = sum / count;    // 뒷 연산은 cpu에서 x는 ram에 저장됨 
		System.out.println(avg);
		//계산되는 데이터 중 하나라도 실수가 있으면 무조건 실수!
		
		int sum2 = 44;
		int count2 = 3;
				
		int sum3 = 44;
		int count3 = 3;
		double avg3 = sum3 / (double) count3;
		System.out.println(avg3);
		
		
	}

}
