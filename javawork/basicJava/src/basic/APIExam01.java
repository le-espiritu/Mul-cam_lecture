package basic;

import java.io.File;
import java.util.Random;

/*import java.io.File;
import java.util.Random;
import java.util.Vector;*/
public class APIExam01 {
	public static void main(String[] args) {
		//1. "I like java"���ڿ��� �Ʒ� ���ǿ� �°� ó���� �� �ֵ��� StringŬ������ ���� �۾��մϴ�.
		//2. StringŬ������ ����� str������ ���� ������ �� �ֵ��� ó���մϴ�.
		//3. StringŬ������ ���ǵǾ� �ִ� length�޼ҵ带 ȣ��
		//4. ������¿� ���� ȣ������ ���
		//[�������]
		//���ڿ��� ���� :_________
		//��������(heaves@hanmail.net)
		String str = new String("I like java");
		int result = str.length();
		System.out.println("���ڿ��� ����:"+result);
		
		//JVM�� �⺻���� �ν��ϴ� API�� ��ġ�� java.lang��Ű���� ���� �ҽ������� �۾��ϴ� ��ġ(basic)
		new Random();
		new File("");
		
	}
}
