package 제너릭프로그램;

public class MemberDTO {
	String name;
	int age;
	double eye;
	boolean food;
	char gender;
	
	
	
	public MemberDTO(String name, int age, double eye, boolean food, char gender) {
		this.name = name;
		this.age = age;
		this.eye = eye;
		this.food = food;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getEye() {
		return eye;
	}
	public void setEye(double eye) {
		this.eye = eye;
	}
	public boolean isFood() {
		return food;
	}
	public void setFood(boolean food) {
		this.food = food;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", age=" + age + ", eye=" + eye + ", food=" + food + ", gender=" + gender
				+ "]";
	}
	
	
}
