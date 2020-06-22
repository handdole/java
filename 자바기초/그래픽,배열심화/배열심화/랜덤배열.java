package 배열심화;

import java.util.Random;

public class 랜덤배열 {

	public static void main(String[] args) {
		// 1. 랜덤하게 값을 1000개 시켜서 ,
		Random r = new Random(10); // 데이터의 고정을 위해 시드값 넣어줌. // 참조형 변수 , 지역 변수 // () => 안에 있는 값은 시드값
		// 1000개이ㅡ 데이터를 저장 할 수 있는 공간 필요
		// => 배열(array)

		int[] nums = new int[1000]; // 1000개의 공간을 만들어줌

		// nums에 0~999까지의 랜덤한 수를 0-999까지의 인덱스에 넣음
		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(1000); // 0~999
		}

		// 0부터 끝까지 프린트 인덱스 + 1 한 값과 각 인덱스에 맞는 값 출력
		for (int i = 0; i < nums.length; i++) {
			System.out.println((i + 1) + ":" + nums[i]);
		}

		// 2. 최대값이 무엇인지 찾아보고 ,
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		System.out.println(max);
		
		System.out.println("----------------------------");
		// 3. 위치가 어디인지 찾아보고 ,
		for (int i = 0; i < nums.length; i++) {
			if (max == nums[i]) {
				System.out.println(i);
			}
		}
		
		// 4. 몇 개나 있는지 찾아봅시다.
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (max == nums[i]) {
				count++;
			}
		}
		System.out.println("-----------------------------------");
		System.out.println(count);

	}

}
