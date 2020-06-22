package 제너릭프로그램;

import java.util.ArrayList;

public class FrontClass {
	public static void main(String[] args) {
		Our708 our = new Our708();
		ArrayList<MemberDTO> list = our.call();
		System.out.println(list.size());
	}
}
