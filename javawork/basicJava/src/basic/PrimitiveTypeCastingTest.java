package basic;
//�⺻���������� ����ȯ
public class PrimitiveTypeCastingTest {
	public static void main(String[] args) {
		//1. �ڵ�����ȯ - ���ο��� �ڵ�ó��
		byte b = 100;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		
		char c = 'A';
		int data = c;//char�� int�� �ڵ�ĳ������ ������ ���� char�� ���� ASCII��� �ڵ尪�� ���ǵǾ� �ֱ� ������ ����
		             //Ű������ �� Ű�� ���������� ����� �� �ִ� ���ڰ��� ������ �ִ�. (ASCII�ڵ�)
		System.out.println(l);
		System.out.println(d);
		System.out.println(data);
		
		//2. ���������ȯ - ���� Ÿ���� ����
		byte bdata = (byte)200;
		System.out.println(bdata);
		//ASCII�ڵ带 ���ڷ� ��ȯ�ؾ� �ϴ� ���
		int idata = 65; //ascii�ڵ�
		char cdata = (char)idata;//���ڷκ�ȯ
		System.out.println(cdata);
		System.out.println((char)100);
		
		double result = (double)10/3;
		System.out.println(result);
		
		double result2 = (double)20/100 * 100 ;
		System.out.println(result2+"%");
		
	}
}











