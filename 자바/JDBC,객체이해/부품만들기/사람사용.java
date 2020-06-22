package 부품만들기;

public class 사람사용 {

	public static void main(String[] args) {
		person p1 = new person();
		person p2 = new person();
		person p3 = new person();
		p1.eat();
		p2.talk();
		p3.tool();
		p1.name = "홍길동";
		p1.age = 100;
		p1.gender = '남';
		
		System.out.println(p1.name);
		
		
	}

}
