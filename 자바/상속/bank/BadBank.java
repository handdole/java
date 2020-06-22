package bank;

public class BadBank extends Bank {

	 // solo0501@naver.com    // at (~에 ) a를 쓸 수 없으니까 @를 씀 // 네이버에 있는 저 (solo0501) 아이디야.
	@Override   // 표시(Annotation, 어노테이션) , 생략가능 . 코드 읽을 때 오버라이드 한거 알려줄려고
	public double getInterestRate() {
		return 10;
	}
	
		
	
}
