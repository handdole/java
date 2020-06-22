package DB연결;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class 구현 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);

//		f.getContentPane().setLayout(null);
		f.getContentPane().setLayout(new BorderLayout());
		JPanel panel2 = new JPanel();
		
		JButton btnNewButton = new JButton("전체목록가지고오기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = new MemberDAO();
				ArrayList<MemberDTO> list = dao.all();
				for (int i = 0; i < 10; i++) {
					JPanel panel = new JPanel();
					panel.setBackground(Color.CYAN);
					panel.setPreferredSize(new Dimension(10, 10));
					panel2.add(panel);
				}

				System.out.println("list개수는 " + list.size());

				f.setVisible(true);

			}
		});

		btnNewButton.setBounds(12, 10, 416, 35);
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
//
		f.getContentPane().add(panel2);

		f.setVisible(true);
	}
}
