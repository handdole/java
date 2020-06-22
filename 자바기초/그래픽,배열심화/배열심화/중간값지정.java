package 배열심화;

import java.util.ArrayList;

public class 중간값지정 {

	public static void main(String[] args) {
		// 1~100 까지의 수 중에서 짝수를 구해서 배열에 넣어봅시다.
//		int [] even = new int[50];      얘가 0~49 까지 이기 때문에 밑에 i를 변수로 사용할 수 없음.
//		int index = 0; // 짝수 배열에 해당하는 인덱스
//		for (int i = 0; i < 100; i++) {
//			if ((i % 2 == 0) && (i != 0)) {    // %는 나머지 연산자.
//				even[i] = i+1;
//			}
//		}
//		for (int i = 0; i < even.length; i++) {
//			System.out.println(even[i]);
//		}
		// 무언가 넣고싶으면 해당 기능을 갖고 있는 클라스를 찾아야함.
		
		
		
		ArrayList even = new ArrayList();
		
		             // 인덱스를 지정하기위한 변수 지정
		for (int i = 1; i <= 100; i++) {  // 1~100까지의 수중에 짝수인수를 구하기 위한 반복문  (숫자 비교)
			if (i % 2 == 0) { 					// i가 2로 나눴을 때 나머지가 0이면 
				even.add(i);				// even이라는 리스트에 i를 넣어줌.
			}
		}

		System.out.println(even);
		System.out.println(even.size());
		
		

	}

}
