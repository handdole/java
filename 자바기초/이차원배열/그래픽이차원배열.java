package 이차원배열;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 그래픽이차원배열 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(300, 300);

		Object[] title = { "이름", "나이", "전공" };     // 타이틀은 1차원 배열이지 행이 추가가 안되니까
		Object[][] content = { 
				{ "홍길동", 100, "수학" }, 
				{ "박길동", 200, "영어" }, 
				{ "송길동", 150, "컴퓨터" }, 
				{ "송길동", 150, "컴퓨터" }, 
				{ "송길동", 150, "컴퓨터" }, 
				{ "송길동", 150, "컴퓨터" }, 
				{ "송길동", 150, "컴퓨터" }, 
				{ "송길동", 150, "컴퓨터" }, 
				{ "송길동", 150, "컴퓨터" }, 
				{ "송길동", 150, "컴퓨터" }, 
				{ "송길동", 150, "컴퓨터" }, 
				{ "송길동", 150, "컴퓨터" }, 
				{ "송길동", 150, "컴퓨터" }, 
				{ "송길동", 150, "컴퓨터" }, 
				{ "송길동", 150, "컴퓨터" }, 
				{ "송길동", 150, "컴퓨터" }, 
				{ "송길동", 150, "컴퓨터" }, 
				{ "송길동", 150, "컴퓨터" }, 
				{ "송길동", 150, "컴퓨터" }, 
				{ "송길동", 150, "컴퓨터" }, 
				}; 
		// 컨텐츠는 2차원배열 행이 추가가 되니까
		

		JTable table = new JTable(content, title);
		JScrollPane scroll = new JScrollPane(table);   // 배보다 배꼽이 큼 
		f.add(scroll);    // 스크롤 에다가 테이블을 끼는거임.
		
		
		f.setVisible(true);
	}

}
