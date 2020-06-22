package class708.mega.com;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MessengerB extends JFrame {
	private JTextField input;
	DatagramSocket socket;
	JTextArea list;

	public MessengerB() throws Exception {
		socket = new DatagramSocket(6000);
		getContentPane().setBackground(Color.CYAN);
		setTitle("메신저 B");
		setSize(400, 650);
		
		list = new JTextArea();
		list.setEditable(false);
		list.setBackground(Color.CYAN);
		getContentPane().add(list, BorderLayout.CENTER);

		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = input.getText();
				list.append("나 >> " + data + "\n");
				input.setText("");

				// 보내자!
				try {
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					byte[] data2 = data.getBytes();
					DatagramSocket socket = new DatagramSocket();

					DatagramPacket packet = new DatagramPacket(data2, data2.length, ip, 5000);
					socket.send(packet);
					System.out.println("전송완료!");
					socket.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		input.setBackground(Color.ORANGE);
		input.setFont(new Font("굴림", Font.PLAIN, 35));
		getContentPane().add(input, BorderLayout.SOUTH);
		input.setColumns(10);
		setVisible(true);
	}

	public void process() {
		while (true) {
			try {
				// 받는 소켓
				byte[] buf = new byte[256];
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				list.append("너 >> " + new String(buf) + "\n");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws Exception {
		MessengerB m = new MessengerB();
		m.process(); // 보내기 전에 받을 준비를 먼저ㅓ 해야된다.
						// 계속받아야하기때문에 무한루프
	}

}
