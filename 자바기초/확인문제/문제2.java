package 확인문제;

import javax.swing.JOptionPane;

public class 문제2 {

	public static void main(String[] args) {
		/*
		 * 당신이 좋아하는 영화 제목은 ? 기생충
		 * 영화의 출연자는 ? 송강호 , 조여정
		 * 영화의 등급은? 15세 
		 * 영화 평점은 ? 8.49
		 * 영화의 발표년도는 ? 2019
		 * 당신은 이 영화를 보셨나요? true
		 * 당신의 나이는 ? 
		 * ------------------------------------
		 */
		String name = JOptionPane.showInputDialog("당신이 좋아하는 영화 제목은?");
		String performer = JOptionPane.showInputDialog("영화의 출연자는?");
		String rating = JOptionPane.showInputDialog("영화의 등급은?");
		String point = JOptionPane.showInputDialog("영화의 평점은?");
		String year = JOptionPane.showInputDialog("영화의 발표 년도는?");
		String see = JOptionPane.showInputDialog("당신은 이영화를 보셨나요?");
		String age = JOptionPane.showInputDialog("당신의 나이는?");
		double Point = Double.parseDouble(point); // 영화 평점은 실수이기 때문에 Double을 사용
		int Year = Integer.parseInt(year);        // year은 정수이기 때문에 int 사용
		int Rating = Integer.parseInt(rating);    // 영화를 본 여부는 true or false 이기 때문에 Boolean 사용
		boolean See = Boolean.parseBoolean(see);  // 나이는 int
		int Age = Integer.parseInt(age);
		
		System.out.println("영화 제목: "+name);    
		System.out.println("출연자: "+performer);  
		System.out.println("등급 : "+Rating+"세");  
		System.out.println("평점 : "+Point+"(고)" );  
		if (Rating > 5.5) {
			System.out.println("다른 영화의 평균 평점은 5.5점입니다. 이 영화는 높은 편입니다.");
		}
		else {
			System.out.println("다른 영화보다 평점이 낮군요...");
		}
		System.out.println("상영기간 : "+(2020 - Year + 1)+"년째 상영중");
		System.out.println("영화를 본 후");
		if (See == true) {    // 만약에 영화를 봤으면
			System.out.println("후기를 작성하러 갑니다.");   
		}
		else { //영화를 안봤으면
			System.out.println("예매를 하러감.");
		}
		if (Age >= 15) {  // 15살 보다 높으면 
			System.out.println("영화를 볼 수 있습니다.");
		}
		else {   // 15살보다 낮으면
			System.out.println("영화를 볼 수 없습니다.");
		}

	}

}
