package 형변환casting;

import java.util.ArrayList;

public class 클레스간형변환 {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("수요일입니다");
		//Object <- String , 업캐스팅 
		
		DTO dto = new DTO();
		dto.setId("park");
		dto.setPw("park");
		list.add(dto);
		//Object <- DTO, 업캐스팅 
		
		list.add(100);  //int 
		//Object <- (업캐스팅) - Integer <-(오토박싱) - int
		
		list.add(true); // boolean
		//Object <- (업캐스팅) - Boolean <-(오토박싱) - boolean
		
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));    // dto 같은 경우에는 toString 찍어놔서 dto 속에있는 값나
		}
		for (Object x : list) {
			System.out.println(x);
		}
		
		//리스트의 들어있는 타입이 모두다 Object이다.
		//첫 번째 index 요소(element)를 꺼내오자.
		
		String hi = (String) list.get(0); //string <- object  
		// 작은것 <- 큰것 : 강제 형변환 (다운캐스팅)
		
		DTO dto2 = (DTO) list.get(1); // DTO <- object 
		//꺼내올때 오브젝트로 꺼내오면 이건 그냥 주소값일뿐 그 속에있는 값들사용 xxx
		System.out.println(dto.getId());
		System.out.println(dto.getPw());
		
		int i = (int)list.get(2); // int <- Object
		//int <- (오토언박싱) - integer < - (다운캐스팅) - Object
		
		boolean b = (Boolean)list.get(3); // boolean < object 
		//boolean <- (오토언박싱) - Boolean <- (다운캐스팅) -Object
		
		
		
		
		
	}
}
