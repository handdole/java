package 생성자;

public class Tv {
	String color;
	int size;
	// default 
	// 파라메터 있는 생성자가 없는 경우는 자동으로 만들어줌.
	// 파라메터 있는 생성자가 있는 경우는 자동으로 만들어주지 않음.
	public Tv() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자 : 객체 생성시 자동 호출되는 메소드 
	//       멤버 변수 초기화.
	public Tv(String color , int size) {  //반환값이 없으니까 무조건 void 고 void 만쓰니까 생략.
		
		System.out.println("클래스 이름과 동일한 내가 호출됨.");
		
		this.color = color;
		this.size = size;
	}
	
	
	@Override
	public String toString() {
		return "Tv [color=" + color + ", size=" + size + "]";
	}
	
	//Tv로 생성된 객체의 멤버 변수 값 프린트 
	
}
