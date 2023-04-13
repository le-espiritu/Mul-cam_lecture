package thread;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Horse extends Canvas implements Runnable{
	private int x = 0;
	private int randNum ;
	public Horse(){
		double su = Math.random();
		randNum = (int)(su*5);
	}
	public void paint(Graphics g){
		setBackground(Color.yellow);//Canvas�� ��������
		g.drawLine(0, this.getSize().height/2,
				this.getSize().width,
				this.getSize().height/2);
		g.fillOval(x, 0, 10, this.getSize().height);
	}
	public void startThread(){
		new Thread(this).start();
	}
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//ĵ������ x��ǥ���� �����ϴ� �ڵ�
			x = x+10+randNum;
			//x��ǥ���� ĵ������ width���� Ŀ���� �ݺ��� ����������. 
			if(x>this.getSize().width-10){
				break;
			}
			repaint();//Canvas�� paint()�� ȣ���Ѵ�.
		}
	}
	
	
}

public class Test extends Frame implements ActionListener{
	private BorderLayout bl = new BorderLayout();
	private Label lb = new Label("�� �� = ", Label.RIGHT);
	private TextField tf = new TextField(10);
	private Button bt = new Button("����");
	public List li = new List(3, false);
	private Panel pp;
	private Horse[] horse;
	private Button bt1 = new Button("����ϱ�");
	public HorseGame(){
		super("ActionEvent����");
		init();
		start();
		this.setSize(600,500);
		this.setVisible(true);
	}
	public void init(){
		this.setLayout(bl);
		Panel p = new Panel(new FlowLayout());
		p.add(lb);
		p.add(tf);
		p.add(bt);
		p.add(bt1);
		this.add("North", p);
		
		this.add("South", li);
	}
	public void start(){
		tf.addActionListener(this);
		bt.addActionListener(this);
		bt1.addActionListener(this);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==tf||e.getSource()==bt){
			//�ؽ�Ʈ�ʵ忡 �Է��ϴ� ���� ������ŭ ���� ����� �۾�
			//---> ��ư�� �����ų� �ؽ�Ʈ�ʵ忡�� Enter�� ������ ����
			if(pp!=null){
				this.remove(pp);
			}
			int x = Integer.parseInt(tf.getText().trim());
			pp = new Panel();
			pp.setLayout(new GridLayout(x,1,3,3));
			horse = new Horse[x];
			for (int i = 0; i < x; i++) {
				horse[i] = new Horse();
				pp.add(horse[i]);
			}
			this.add("Center",pp);
			this.validate();//ȭ���� �籸��
		}else if(e.getSource()==bt1){
			for (int i = 0; i < horse.length; i++) {
				horse[i].startThread();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Test g =new  T();

	}
}













