package statement;
//�ݺ������ for���� ������ ���캸�� �ڵ�
public class ForTest01 {
	public static void main(String[] args) {
		//"�ڹ����α׷���"�̶�� ���ڿ��� 10�� ����ϼ���.
		//i++ => i=i+1
		//int val1 = 5;
		for(int i=1;i<11;i++) {
			System.out.println("�ڹ����α׷���:"+i);
		}
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("===================================");
		int count = 1;
		for(int i=10;i<=14;i++) {
			System.out.println("�ڹ����α׷���:"+count);
			//count = count+1;
			count++;
		}
		System.out.println("===================================");
		for(int i=5;i>=1;i--) {
			System.out.println("�ڹ����α׷���");
		}
	}
}
