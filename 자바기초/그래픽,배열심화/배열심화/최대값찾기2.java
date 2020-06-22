package 배열심화;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 최대값찾기2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 스캐너 함수 임포트
		int[] nums = new int[5]; // nums 라는 리스트 공간 5개 생성
		for (int i = 0; i < nums.length; i++) { // 숫자 5개 입력받기 위한 for 문
			System.out.print("숫자 5개 입력 >> "); // 숫자 입력 메세지 출력
			int num = sc.nextInt(); // 받은 숫자를 num이라는 변수로 저장
			nums[i] = num; // 입력받은 num 을 num[i]에 맞는 인덱스로 각 공간에 저장
			System.out.println(""); // 줄 구분
		}

		sc.close(); // 스캐너 함수 종료

		// 1. 최대값을 찾으려면 배열을 다 돌아야한다.
		// 2. 해당 index를 돌았을 때 까지의 최대값을 저장하기위한 임시변수를 하나 만듬
		// 3. 배열을 다 돌았으면 임시변수에는 최대값이 남을 것이다.

		int min = nums[0];
		// 왜 첫번째 값을 넣어놓았나?
		// 1) 습관적으로 0을 넣긴 하지만 , 찾고자 하는 리스트 이외의 값을 넣어두면 생각하지 못했던 변수가 발생하게 됨.
		// => 0 이하의 값이 나오면 문제가 생김
		// 2) 임시변수에는 리스트에 있는 값중 하나를 넣으면 된다.
		// => index 가 증가하면서 순회하기 때문에 첫번째 값을 넣는다.

		for (int i = 0; i < nums.length; i++) {
			// 해당 인덱스에 들어있는 값이 max 변수보다 작은지 조건 체크
			// true 이면 , 해당 인덱스에 들어있는 값을 min 변수에 대입
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.println("최대값은 " + min);

	}

}
