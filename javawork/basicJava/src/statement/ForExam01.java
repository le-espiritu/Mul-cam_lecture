package statement;

public class ForExam01 {
	public static void main(String[] args) {
		//1���� 100���� ¦���� ����ϼ���..
		//[�������]
		//¦�� : 2
		//¦�� : 4
		//¦�� : 6
		// ......
		//¦�� : 100
		for(int i=0;i<=100;i=i+2) {
			System.out.println("¦�� : "+i);
		}
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println("¦�� : "+i);
			}
		}

	}
}
