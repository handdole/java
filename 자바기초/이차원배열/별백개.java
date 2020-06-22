package 이차원배열;

public class 별백개 {

	public static void main(String[] args) {
		//for문 하나당 별 10개씩 한줄
		for (int i = 0; i < 10; i++) {		 // 별10개 만드는 구문 반복 10번
			for (int j = 0; j < 10; j++) {    //별 10개 
				System.out.print("★ ");
			}
			System.out.println("");   // 밑으로 내려
		}
		
	}

}
