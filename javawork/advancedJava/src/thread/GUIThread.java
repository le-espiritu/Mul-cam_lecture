package thread;
//문제가 있는 프로그램
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//GUI프로그램을 사용하는 경우 main쓰레드는 화면을 관리하고 이벤트를 처리하는 작업을 수행해야
//하며 만약 다른 작업을 별도로 실행되게 만들고 싶다면 쓰레드를 생성해서 실행되도록 해야 한다.
public class GUIThread extends JFrame{
	JLabel lblNum;
	JButton btnStart;
	JTextField txtInput;
	public GUIThread(String title){
		super(title);
		display();//화면디자인
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
		btnStart = new JButton("쓰레드시작");
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





