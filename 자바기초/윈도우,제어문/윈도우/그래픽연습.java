package À©µµ¿ì;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ±×·¡ÇÈ¿¬½À  {
	static int count = 0;
	static int my_win = 0;
	static int com_win = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(857,519);
		JLabel result = new JLabel("\uAC8C\uC784\uACB0\uACFC\uB098\uD0C0\uB0A0 \uC790\uB9AC");
		f.setTitle("°¡À§ ¹ÙÀ§ º¸ °ÔÀÓ");
		Random r = new Random();
		
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
//				result.setText("°¡À§¸¦ ´­·¶À½");
				//³ª¿Í ÄÄÇ»ÅÍ ºñ±³ÇØ¼­ ½ÂÆÐ È®ÀÎ
				
				int c = r.nextInt(3);
				if (c == 0) {
					result.setText("ºñ±è¿©!");
				} else if (c == 1) {
					result.setText("Áü¿©!");
					com_win++;
				} else {
					result.setText("ÀÌ±è¿©!");
					my_win++;
				}
				f.setTitle("°¡À§ ¹ÙÀ§ º¸ °ÔÀÓ// ÃÑ°ÔÀÓ È½¼ö >> " + count+"//³»°¡ ÀÌ±ä È½¼ö >> "+my_win+"ÄÄÇ»ÅÍ°¡ ÀÌ±ä È½¼ö >> "+com_win+"½Â·ü >> "+(my_win/(double)count)*100+"%");
			}
		});
		btnNewButton.setBackground(Color.BLUE);
		btnNewButton.setName("\uAC00\uC704");
		btnNewButton.setIcon(new ImageIcon("E:\\hansol\\java\\data03\\11.png"));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
//				result.setText("¹ÙÀ§¸¦ ´­·¶À½");
				
				int c = r.nextInt(3);
				if (c == 0) {
					result.setText("ÀÌ±è¿©!");
					my_win++;
				} else if (c == 1) {
					result.setText("ºñ±è¿©!");
				} else {
					result.setText("Áü¿©!");
					com_win++;
				}
				f.setTitle("°¡À§ ¹ÙÀ§ º¸ °ÔÀÓ// ÃÑ°ÔÀÓ È½¼ö >> " + count+"//³»°¡ ÀÌ±ä È½¼ö >> "+my_win+"ÄÄÇ»ÅÍ°¡ ÀÌ±ä È½¼ö >> "+com_win+"½Â·ü >> "+(my_win/(double)count)*100+"%");
			}
		});
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.setName("\uBC14\uC704");
		btnNewButton_1.setIcon(new ImageIcon("E:\\hansol\\java\\data03\\22.png"));
		f.getContentPane().add(btnNewButton_1, BorderLayout.CENTER);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
//				result.setText("º¸¸¦ ´­·¶À½");
				
				int c = r.nextInt(3);
				if (c == 0) {
					result.setText("ÀÌ±è¿©!");
					my_win++;
				} else if (c == 1) {
					result.setText("Áü¿©!");
					com_win++;
				} else {
					result.setText("ºñ±è¿©!");
				}
				f.setTitle("°¡À§ ¹ÙÀ§ º¸ °ÔÀÓ// ÃÑ°ÔÀÓ È½¼ö >> " + count+"//³»°¡ ÀÌ±ä È½¼ö >> "+my_win+"ÄÄÇ»ÅÍ°¡ ÀÌ±ä È½¼ö >> "+com_win+"½Â·ü >> "+(my_win/(double)count)*100+"%");
			}
		});
		btnNewButton_2.setBackground(Color.PINK);
		btnNewButton_2.setName("\uBCF4");
		btnNewButton_2.setIcon(new ImageIcon("E:\\hansol\\java\\data03\\33.png"));
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		
		
		result.setFont(new Font("±¼¸²", Font.PLAIN, 35));
		result.setBackground(new Color(255, 0, 0));
		f.getContentPane().add(result, BorderLayout.NORTH);
		
		f.setVisible(true);
	}

}
