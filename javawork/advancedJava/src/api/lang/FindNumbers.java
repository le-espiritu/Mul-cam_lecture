package api.lang;

public class FindNumbers {
	
	public static void main(String[] args) {
		FindNumbers fn=new FindNumbers();
		
		long number = 228754462;
		System.out.println( "�Է� ���� = " + number );		
		System.out.println("2 Ƚ�� => " + fn.countNumber(number, 2));//3�� ����
		System.out.println("4 Ƚ�� => " + fn.countNumber(number, 4));//2�� ����
	}
	
	/*  �̰��� countNumber �޼ҵ带 �ۼ��Ͻʽÿ�. */
	public int countNumber(long number,int value) {
		int count = 0;
		String data = number+"";//�Ű������� ���޹��� ���ڸ� ���ڷ� ��ȯ
		int size = data.length();
		for (int i = 0; i <size; i++) {
			if((data.charAt(i)+"").equals(value+"")) {
				count++;
			}
		}
		return count;
	}
}
