package oop.poly;

import java.util.Scanner;

public class SenderTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("********Sender�ý���********");
		System.out.println("1. Email�� ����");
		System.out.println("2. SMS�� ����");
		System.out.println("3. BAND�� ����");
		System.out.println("4. KaKao�� ����");
		System.out.print("���ϴ� �۾��� �����ϼ���:");
		int work = key.nextInt();
		Sender sender = null;
		
		switch(work){
			case 1:
				sender = new EmailSender("���Ϸ�����",100);
				break;
			case 2:  
				sender = new SMSSender("�ܹ���",80);
				break;
			case 3:  
				sender = new BandSender("Band",80);
				break;	
			case 4:  
				sender = new KaKaoSender("KaKao",80);
				break;	
		}
		SenderLogic s = new SenderLogic();
		s.run(sender);

	}

}
