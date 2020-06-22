package bean;

public class MemberDTO2 {
	// public 하고 변수 지정은 다른 패키지에서도 사용될때 사용하는 변수 지정 
	// 패키지 안에서만 사용하면 public 사용하지 않아도 댐
	
	String name;
	String age;
	String company;
	String tel;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", age=" + age + ", company=" + company + ", tel=" + tel + "]";
	}
	
	
	
}
