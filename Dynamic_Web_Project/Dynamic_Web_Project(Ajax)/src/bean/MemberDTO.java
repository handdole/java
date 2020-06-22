package bean;

public class MemberDTO {
	// public 하고 변수 지정은 다른 패키지에서도 사용될때 사용하는 변수 지정 
	// 패키지 안에서만 사용하면 public 사용하지 않아도 댐
	
	String id;
	String pw;
	String name;
	String tel;
	
	
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "memberDTO [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + "]";
	}
	
	
}
