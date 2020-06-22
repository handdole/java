package collection;

import java.util.ArrayList;

import DB연결.MemberDTO;

public class ListTest5 {

	public static void main(String[] args) {
		ArrayList<MemberDTO> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) { //검색의 결과가 10개의 레코드가됨.
			MemberDTO dto = new MemberDTO(); 
			dto.setId(i+"");
			dto.setPw(i+"");
			dto.setName(i+"");
			dto.setTel(i+"");
			list.add(dto);
		}
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}
	

}
