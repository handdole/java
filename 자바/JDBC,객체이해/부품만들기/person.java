package 부품만들기;

public class person {
//	사람을 만들어 봅시다!
//	=================
//	-특징을 알아야 한다.
//	-모델링 :  설계하는 과정 (디자인)
//	- 동작, 동적인 특징 : 음식을 먹다. 말을 한다. 도구를 사용한다. 
//	  => 메소드 
//	- 성질, 정적인 특징 : 이름 , 나이 , 성별     => 변수 
	
	//멤버 변수 => 전역 변수  , 자동 초기화
	String name;  // null 로 초기화
	int age;  // 0으로 초기화
	char gender;   // 사람에 대한 특징임 (특정한 사람에 대한 특징이 아니기 때문에 변수만 선언)
	
	//멤버 메소드
	
	//먹는 메소드 
	public void eat() {
		System.out.println("음식을 먹다.");
	}
	
	public void talk() {
		System.out.println("말을 한다.");
	}
	public void tool() {
		System.out.println("도구를 사용한다.");
	}
	
	
	
	
}
