package exception;

import java.util.Scanner;

//�ڹٿ��� ���� ó���ϴ� ���
public class ExceptionTest02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		try {
			//���ܹ߻� ���ɼ��� �ִ� �ڵ�
			System.out.println("start");
			System.out.println("���ڸ� �Է��ϼ���:");
			int num = key.nextInt();
			System.out.println("���� ���ڸ� �Է��ϼ���:");
			int num2 = key.nextInt();
			System.out.println("���:"+(num/num2));
			System.out.println("�ٸ��۾���ó��");
			System.out.println("end - ��������");
		}catch(Exception e) {
			//���ܰ� �߻����� ��� ������ �ڵ�
			System.out.println("���ܹ߻�!!");
			System.out.println("����ó���ڵ� - ���� ����ǵ��� �ڵ带 �ۼ�");
			//���ܰ�ü�� �����ϴ� �������� e�� �̿��ؼ� ���ܰ�ü�� ���� �ִ� �޼ҵ带 �׼���(���)�� �� �ִ�.
			//System.out.println(e.getMessage());
			//�����Ҷ� ���� ���� ����ϴ� ���ܰ�ü�� �޼ҵ�
			//-> ���� Ŭ������ �̿��ؼ� �۾��ϴ� ��� ������ �����ؼ� � Ŭ������ � �޼ҵ��� �� �� ���ο��� ���ܰ� �߻��ϴ��� ���
			e.printStackTrace();
		}
		
	}
}
