package exception;

import java.util.Scanner;
public class ExceptionExam02 {
	//�ʿ��� ��� ������ �޼��� ����κ�(�޼��� �ñ׳�ó)�� �����Ͻñ� �ٶ��ϴ�.
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("���ڷ� ��ȯ�� ���ڿ��� �Է¹ٶ��ϴ�.");
		String str= scan.nextLine();
		int result= 0;
		//���⸦ �ۼ��Ͻʽÿ�.
		//convert�� ���ܸ� �߻���Ű�� �޼ҵ��̹Ƿ� try~catch�� ó��
		//throws�ϰ� �ִ� �޼ҵ带 ȣ���ϸ� ������ try~catch�� ó���Ѵ�.
		try {
			System.out.println("��ȯ�� ���ڴ�"+convert(str)+"�Դϴ�.");
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	//�ʿ��� ��� ������ �޼��� ����κ�(�޼��� �ñ׳�ó)�� �����Ͻñ� �ٶ��ϴ�.
	private static int convert(String str) throws IllegalArgumentException{
		//���⸦ �ۼ��Ͻʽÿ�.
		int result = 0;
		if(str==null | str.length()==0) {
			throw new IllegalArgumentException("���ܰ� �߻��Ǿ����ϴ� . ���ڿ��� �Է����� �ʰ� Enter Ű�� �����̽��ϴ�");
		}
		result = Integer.parseInt(str);
		return result;
	}
}