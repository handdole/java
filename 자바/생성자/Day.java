package 생성자;

public class Day {
	
	String doing;
	int time;
	String location;
	static int day; // 일누적
	static int sum; //시간누적
	
	
	public Day(String doing, int time, String location) {
		this.doing = doing;
		this.time = time;
		this.location = location;
		day++;
		sum = sum + time;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	

}
