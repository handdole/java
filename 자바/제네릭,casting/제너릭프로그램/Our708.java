package 제너릭프로그램;

import java.util.ArrayList;

// 이부품은 리스트를 묶어서 보내주는 용도입니다.
public class Our708 {     // 멤버를 묶는 용이기떄문에 출력은 하지 않는게 좋다. 
	public ArrayList<MemberDTO> call() {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		MemberDTO m1 = new MemberDTO("박상도", 27 , 0.1 , true , '남'); // () -> 안에 있는건 parameter 값이고 이값들은 instence 이다.
		MemberDTO m2 = new MemberDTO("박현정",30,1.0,true,'여');
		MemberDTO m3 = new MemberDTO("박한솔",26,0.5,false,'남');
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		
		return list;
	}
}
