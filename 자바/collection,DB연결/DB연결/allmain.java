package DB연결;

import java.util.ArrayList;

import com.mysql.fabric.xmlrpc.base.Member;

public class allmain {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO>  list = dao.all();
		for (int j = 0; j < list.size(); j++) {
			System.out.println(list.get(j));
			
		}
		System.out.println(list.get(0));
		System.out.println("======================");
		for (int i = 0; i < list.size(); i++) {
			MemberDTO dto = list.get(i);
			System.out.print(dto.getId()+" ");
			System.out.print(dto.getPw()+" ");
			System.out.print(dto.getName()+" ");
			System.out.println(dto.getTel());
			
		}
		
		
	}

}
