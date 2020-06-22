package collection;

import java.util.LinkedList;

public class QueueTest {

	public static void main(String[] args) {
		LinkedList milk = new LinkedList();
		milk.add("그저께우유");
		milk.add("어제우유");
		milk.add("오늘우유");
		milk.remove();  // FILO 임으로 제거 하면 
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
	}

}
