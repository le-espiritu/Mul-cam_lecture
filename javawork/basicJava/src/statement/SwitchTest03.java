package statement;
//switch�� Ư�� - case�� ���� ���� Ÿ��
public class SwitchTest03 {
	public static void main(String[] args) {
		//switch�� �� ������ int�� ��ȯ�� ������ Ÿ�Ը� ����� �� �ִ�.
//		long d = 10L;
//		switch(d) {//long���� �Ұ���
//			case 1.0:
//				System.out.println("�׽�Ʈ");
//		}
		int data=5;
		switch(data+60) {
			case 'A' : //char�� int�� �ڵ�ĳ������ �ǹǷ� ��������� ����
				System.out.println("A");
				break;
			case 'B' : //char�� int�� �ڵ�ĳ������ �ǹǷ� ��������� ����
				System.out.println("B");
				break;	
		}
		
		String code = new String("A01");//jdk6.0���� �߰�
		switch(code) {
			case "A01" :
				System.out.println("A01");
				break;
			case "A02" : 
				System.out.println("A02");
				break;	
		}
		
	}
}















