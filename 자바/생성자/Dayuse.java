package 생성자;

public class Dayuse {
	public static void main(String[] args) {
		Day day = new Day("자바공부",10,"강남");
		Day day2 = new Day("여행",15,"강원도");
		Day day3 = new Day("운동",11,"피트이스");
		
		
		System.out.println("전체하는 일의 시간은 >> "+day.sum);
		System.out.println("평균하는 일의 시간은 >> "+(day.sum/3));
		System.out.println("몇일 간 했는지 ? >> "+day.day+"일");
		System.out.println(day.day+"일   "+ day.toString());
		System.out.println(day.day+"일   "+ day2.toString());
		System.out.println(day.day+"일   "+ day3.toString());
		
	}
}
