package statement;

import java.util.Random;

//if~else�� ����
public class IfTest01 {
	public static void main(String[] args) {
		Random rand = new Random();
		int num = rand.nextInt(100)+1;
		if(num>=90) {
			System.out.println("����:"+num+"(�հ�)");
		}else {
			System.out.println("����:"+num+"(�����)");
		}
	}
}
