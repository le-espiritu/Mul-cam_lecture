package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//finally�� - ������ ����� ��ɹ��� �����Ҷ� ���
public class ExceptionTest04{
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
			//System.out.println(args[0]);
			System.out.println("end - ��������");
		}catch(ArithmeticException e) {
			System.out.println("0���� ���������ϴ�. �ٽ� �Է��ϼ���.");
		}catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է��ؾ�"
					+ " �մϴ�. ���ڸ� �Է��ϼ̾�� �ٽ� Ȯ����~~");
		}catch(Exception e) {
			//����ó��
			System.out.println("��Ÿ ó������ ���� ������ �߻��� ���");
		}finally{
			//���ܻ�Ȳ�̳� ����ó����Ȳ ��� �ݵ�� �����ؾ� �ϴ� �ڵ带 �����ϴ� ��
			System.out.println("+++++++++++++++++++++++++�ڿ��ݳ�+++++++++++++++++++++++++");
		}
	}
}









