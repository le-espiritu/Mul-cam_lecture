package basic;

import java.util.Random;

public class APIExam02 {
	public static void main(String[] args) {
		//RandomŬ������ nextInt()�޼ҵ带 ȣ���Ͽ� �������� ������ ���� ������·� ����ϼ���
		// - RandomŬ���� �������� : rand
		//[�������]
		//������:____
		Random rand = new Random();
		int result = rand.nextInt();
		System.out.println("������:"+result);
		
		//1���� 100���� �������� ���
		//[�������]
		//������:____
		//nextInt(����)
		//0�� ����, ����ڰ� �Է��� ���ڴ� ���Ե��� �ʴ´�.
		Random rand2 = new Random();
		int result2 = rand2.nextInt(100)+1;
		System.out.println("������:"+result2);
	}
}
