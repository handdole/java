package 제어문;

public class whiletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//초기값 , 조건식 , 증감식 
		int start = 1;
		int sum = 0;
		while (start <+ 10) {
			start ++;
			sum = sum + start;
			System.out.print("★");
		}
		System.out.println("총합은"+sum);
	}

}
