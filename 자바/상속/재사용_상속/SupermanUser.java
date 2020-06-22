package 재사용_상속;

public final class SupermanUser {

	public static void main(String[] args) {
		
		Superman s = new Superman();
		s.cloth = "빨강";       //superman
		s.power = 100;		// man
		s.name = "클라크";     // person
		s.age = 300;       //person
		
		s.fly();
		s.talk();
		s.wild();
		s.think();
		
		System.out.println(s);
		
	}

}
