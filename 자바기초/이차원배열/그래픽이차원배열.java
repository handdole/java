package �������迭;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class �׷����������迭 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(300, 300);

		Object[] title = { "�̸�", "����", "����" };     // Ÿ��Ʋ�� 1���� �迭���� ���� �߰��� �ȵǴϱ�
		Object[][] content = { 
				{ "ȫ�浿", 100, "����" }, 
				{ "�ڱ浿", 200, "����" }, 
				{ "�۱浿", 150, "��ǻ��" }, 
				{ "�۱浿", 150, "��ǻ��" }, 
				{ "�۱浿", 150, "��ǻ��" }, 
				{ "�۱浿", 150, "��ǻ��" }, 
				{ "�۱浿", 150, "��ǻ��" }, 
				{ "�۱浿", 150, "��ǻ��" }, 
				{ "�۱浿", 150, "��ǻ��" }, 
				{ "�۱浿", 150, "��ǻ��" }, 
				{ "�۱浿", 150, "��ǻ��" }, 
				{ "�۱浿", 150, "��ǻ��" }, 
				{ "�۱浿", 150, "��ǻ��" }, 
				{ "�۱浿", 150, "��ǻ��" }, 
				{ "�۱浿", 150, "��ǻ��" }, 
				{ "�۱浿", 150, "��ǻ��" }, 
				{ "�۱浿", 150, "��ǻ��" }, 
				{ "�۱浿", 150, "��ǻ��" }, 
				{ "�۱浿", 150, "��ǻ��" }, 
				{ "�۱浿", 150, "��ǻ��" }, 
				}; 
		// �������� 2�����迭 ���� �߰��� �Ǵϱ�
		

		JTable table = new JTable(content, title);
		JScrollPane scroll = new JScrollPane(table);   // �躸�� ����� ŭ 
		f.add(scroll);    // ��ũ�� ���ٰ� ���̺��� ���°���.
		
		
		f.setVisible(true);
	}

}
