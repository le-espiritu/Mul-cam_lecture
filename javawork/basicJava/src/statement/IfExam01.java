package statement;

import java.util.Scanner;

public class IfExam01 {
	public static void main(String[] args) {
		//�������� �߻���Ű�� 0, ����, ����� �Ǻ��ؼ� ����ϱ�
		//ex) 2144 => ���
		//    -4567 => ����
		//    0 => 0
		//[�������]
		//____ => _____
		/*
		 * Random rand = new Random(); 
		 * int randVal = rand.nextInt();
		 */
		//Scanner�� �̿��ؼ� �۾�
		Scanner key = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���:");
		int randVal = key.nextInt();
		
		if(randVal<0) {
			System.out.println(randVal + "=> ����");
		}else{ 
			//������ �������� �ʴ� ���
			//�� �ٸ� ������ �����ؾ� �ϴ� ���
			//���¦��, ���Ȧ��
			//int result = randVal%2;
			if(randVal%2==0) {
				System.out.println(randVal + "=> ���¦��");
			}else {
				System.out.println(randVal + "=> ���Ȧ��");
			}
			
//			if(randVal==0) {
//				System.out.println(randVal + "=> 0");
//			}else {
//				System.out.println(randVal + "=> ���");
//			}
		}
	}
}
