package statement;

import java.util.Scanner;

public class ScoreSwitchExam {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("�����Է�:");
		int jumsu = key.nextInt();
		if(jumsu<0 | jumsu>100) {
			System.out.println("�߸��Է�");
		}else {
			//hint : ����/���� = ����
			switch(jumsu/10) {
				case 10:
				case 9:
					System.out.println("A����");
					break;
				case 8:
					System.out.println("B����");
					break;
				case 7:
					System.out.println("C����");
					break;
				case 6:
					System.out.println("D����");
					break;
				default:
					System.out.println("F����");
			}
		}
		
	}
}

















