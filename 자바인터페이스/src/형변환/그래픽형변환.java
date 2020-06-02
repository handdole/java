package 형변환;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 그래픽형변환 implements ActionListener{
	static JButton b1 , b2 , b3;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500 , 500);
		
		b1 = new JButton("버튼1");
		b2 = new JButton("버튼2");
		b3 = new JButton("버튼3");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		//자바에서는 이벤트 처리에 대해 
		//인터페이스를 제공
		//인터페이스를 구현해서 사용하면 됨.
		b1.addActionListener(new 그래픽형변환());
		b2.addActionListener(new 그래픽형변환());
		b3.addActionListener(new 그래픽형변환());
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent who) {
		// TODO Auto-generated method stub
		System.out.println("버튼을 클릭하면 내가 호출됨");
		if (who.getSource()==b1) {
			System.out.println("b1버튼 눌림");
		}else if (who.getSource()==b2) {
			System.out.println("b2버튼 눌림");
		} else {
			System.out.println("b3버튼 눌림");
		}
	}
}
