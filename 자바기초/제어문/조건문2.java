package 제어문;

import java.sql.Date;

import javax.swing.JOptionPane;

public class 조건문2 {

	public static void main(String[] args) {
		/*
		 * id = 1111
		 * pw = 2222
		 * 
		 * id와 pw가 동일하면 로그인 ok 
		 * 입력받아서 
		 */
		
		// 1번
		int id = 1111;
		int pw = 2222;
		if (id == 1111 && pw == 2222) {
			System.out.println("로그인 ok");
		}
		else {
			System.out.println("로그인 not");
		}
		
		//2번
		String id1 = JOptionPane.showInputDialog("아이디를 입력하세요");
		int id2 = Integer.parseInt(id1);
		String pw1 = JOptionPane.showInputDialog("비밀번호를 입력하세요.");
		int pw2 = Integer.parseInt(pw1);
		
		if (id2 == 1111 && pw2 == 2222) {
			System.out.println("로그인 ok");
		}
		else {
			System.out.println("로그인 not");
		}
		//3번
		String day = JOptionPane.showInputDialog("요일을 선택해주세여 1. 주중 /  2.주말");
		int day1 = Integer.parseInt(day);
		if (day1 == 1) {
			System.out.println("열심히 공부합시다.");
		}
		else {
			System.out.println("열심히 놀아봅시다.");
		}
		//4번
		String W = JOptionPane.showInputDialog("오늘의 날씨는 1)비 2)흐림 3)눈 4)화창");
		int w = Integer.parseInt(W);
		if (w==1 || w==3) {
			System.out.println("지하철을 차고 간다.");
		}
		else {
			System.out.println("버스를 타고간다.");
		}
		
		//5번
		String Day = JOptionPane.showInputDialog("오늘은 무슨요일인가요? 1)월 2)화 3)수 4)목 5)금 6)토 7)일");
		int our = Integer.parseInt(Day);
		if (our == 1){
			System.out.println("월월월");
		}
		else if (our == 2){
			System.out.println("화화화");
		}
		else if (our == 3) {
			System.out.println("수수수");
		}
		else if (our == 4 ) {
			System.out.println("목목목");
			
		}
		else if(our == 5) {
			System.out.println("금금금");
		}
		else if (our == 6) {
			System.out.println("토토토");
		}
		else if (our == 7){
			System.out.println("일일일");
		}
		else {
			System.out.println("이상하게 함여");
		}
		
		//6번
		String hour = JOptionPane.showInputDialog("지금은 몇시입니까?");
		int Hour = Integer.parseInt(hour);
		if (Hour < 11) {
			System.out.println("굿모닝");
		}
		else if (Hour < 16) {
			System.out.println("굿이브닝");
		}
		else if (Hour < 20) {
			System.out.println("굿이브닝");
		}
		else if (Hour <= 24) {
			System.out.println("굿나잇");
		}
		else {
			System.out.println("잘못입력했는데;");
		}
		
		//7번
		String ga = JOptionPane.showInputDialog("가로를 적어주세요");
		int g = Integer.parseInt(ga);
		String se = JOptionPane.showInputDialog("세로를 적어주세요.");
		int s = Integer.parseInt(se);
		
		if (g*s >50) {
			System.out.println("너무 넓군요");
		}
		else if (g*s <= 50){
			System.out.println("너무 좁군요");
		}
		else {
			System.out.println("잘못입력");
		}
	}

}
