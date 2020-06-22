package 형변환casting;

public class 포장클레스1 {
	public static void main(String[] args) {
		//wrapper class(포장 클레스) 
		//기본형을 포장해서 만든 클레스 : 포장클레스  //기본형을 기준으로 만들어서 Object에 상속됨.
		//기능을 추가하여 포장해서 만든 클레스
		String data = "100";
		int data2 = Integer.parseInt(data);
		//인티저는 포장 클레스 이고 모든 기본형기준으로 만들어짐. 
		System.out.println(data2 + 1);
		
		String data3 = "11.11";
		double data4 = Double.parseDouble(data3);
		System.out.println(data4 + 0.1);
		
	}
}
