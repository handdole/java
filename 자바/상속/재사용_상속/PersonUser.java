package 재사용_상속;


//모든 클래스는 object을 상속받은 것!!
public class PersonUser {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "은정";
		p.age = 20;
		
		p.talk();
		p.think();
		System.out.println(p);
		
		}

}
