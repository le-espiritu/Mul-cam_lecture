package thread;
//������ �ִ� ���α׷�
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//GUI���α׷��� ����ϴ� ��� main������� ȭ���� �����ϰ� �̺�Ʈ�� ó���ϴ� �۾��� �����ؾ�
//�ϸ� ���� �ٸ� �۾��� ������ ����ǰ� ����� �ʹٸ� �����带 �����ؼ� ����ǵ��� �ؾ� �Ѵ�.
public class GUIThread extends JFrame{
	JLabel lblNum;
	JButton btnStart;
	JTextField txtInput;
	public GUIThread(String title){
		super(title);
		display();//ȭ�������
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void display() {
		Container c = getContentPane();
		setLayout(new FlowLayout());
		int n = 0;
		lblNum = new JLabel(n+"");
		lblNum.setFont(new Font("Gothic",
				Font.ITALIC+Font.BOLD, 80));
		btnStart = new JButton("���������");
		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				print();
			}
		});
		txtInput = new JTextField(10);
		c.add(lblNum);
		c.add(btnStart);
		c.add(txtInput);
		
	}
	public void print(){
		int num=1;
		while(num<=10){
			lblNum.setText(num+"");
			num++;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		GUIThread obj = new GUIThread("Thread");
	}
}





