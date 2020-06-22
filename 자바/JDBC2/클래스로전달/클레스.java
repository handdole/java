package 클래스로전달;


//여러개의 데이터를 한번에 묶어서 전송하려고!
// Data Transger Object ( DTO , VO : value Object)
// 넣을때는 셋 메소드 빼올대는 겟 메소드 



public class 클레스 {
	public String id;
	public String pw;
	public String name;
	public int age;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
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

	
	
	

}
