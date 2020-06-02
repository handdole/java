package 형변환;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action처리 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent who) {
		// TODO Auto-generated method stub
		System.out.println("버튼을 클릭하면 내가 호출됨");
		System.out.println(who.getSource());
	}

}
