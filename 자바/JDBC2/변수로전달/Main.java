package 변수로전달;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import 배열로전달.배열;
import 클래스로전달.CLASS;
import 클래스로전달.클레스;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(600, 600);
		f.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton btnNewButton = new JButton("변수로전달");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = "홍길동";   // name 에 홍길동을 넣음
				//메소드 이름은 똑같은 이름으로 여러개 만들 수 있다. 
				// 구분은 입력값으로 한다. 
				//메소드 호출할 때는 입력되는 데이터의 타입, 순서 , 개수를 체크한다. 동일할 경우에만 호출 
				// = > 메소드 오버로딩 ( 하나의 이름으로 한개 이상의 메소드를 사용한다.) 
				// = > 다형성 (하나의 이름으로 입력값이 다양한 형태를 쓰고 있다.)
				int age = 100;
				변수 var = new 변수();     // 변수라는 클래스 생성 
				var.call(name , age);        //  변수 클래스 안에있는 call 메소드 호출 안에 name안에 저장된 스트링값 넣어줌 
				
				String good = var.call2();  //call2 에는  스트링반환 값이 스트링 값으로 저장됨. 
				System.out.println(good);   //콜2 메소드에 의해 반환되는 스트링값 
				
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("배열로전달");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//자동 import 
				// crl + shift + o
				배열 ar = new 배열();
				String[] result = ar.call();
				JOptionPane.showMessageDialog(null, "취미는"+result[0]);
				JOptionPane.showMessageDialog(null, "회사는"+result[1]);
				
				
				String[] list = {"달리기","자전거타기"};
				ar.call(list);
				
			}
		});
		btnNewButton_1.setBackground(Color.CYAN);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("클래스로전달");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				클레스 c = new 클레스();
				c.setId("hong");
				c.setPw("hong");
				c.setName("hong");
				c.setAge(100);
				
				
				CLASS cc = new CLASS();
				cc.call(c);
			}
		});
		btnNewButton_2.setBackground(Color.CYAN);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("콜렉션으로전달");
		btnNewButton_3.setBackground(Color.CYAN);
		f.getContentPane().add(btnNewButton_3);
		
		
		
		
		
		
		
		
		f.setVisible(true);
		
		
	}

}
