package 재사용_상속;

public class ManUser {

	public static void main(String[] args) {
		
		Man p = new Man();
		
		p.power = 1000;
		p.name = "신";
		p.age = 32;
		
		p.talk();
		p.think();
		p.wild();
		System.out.println(p);
		
	}

}
