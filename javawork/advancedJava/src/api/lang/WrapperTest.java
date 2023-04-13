package api.lang;

public class WrapperTest {
	public static void main(String[] args) {
		//5.0����
		int i = 100;
		Integer obj = new Integer(i);
		run(obj);
		
		
		//5.0����
		int num = 1000;
		//5.0���� ������ jdk������ �����Ϸ��� �ڵ����� ��ȯ
		//�������Ű������� �⺻�� �����͸� �����ϴ� ��� 
		//�����Ϸ��� �ڵ����� Integer ���� = new Integer(num)�� ���� �ڵ带 �����ؼ� �������ش�. - ����ڽ�
		Integer obj2 = num; //Integer = int
		run(obj2);
		run(1000000);//wrapperŸ�Կ� ���ؼ��� - �ڵ����� �����Ϸ��� 1000000�� Integer��ü�� ��ȯ 
	}
	public static void run(Object obj) {
		System.out.println(obj);
		
		//5.0���� - �Ű������� ���޹��� ���������� ��ȯ�� int���� ���� �⺻������ ��ȯ
		//�Ű������� ���޹��� ��ü�� Integer�� ��ȯ�ϰ� Integer�� �޼ҵ带 ȣ���ؼ� 
		Integer in = (Integer)obj;
		int num = in.intValue();
		
		//5.0����
		//�����ڽ�
		//int�� ������ ���������� ��ȯ�� ���� �����ϴ� ��� �����Ϸ��� �ڵ����� ��ü�� ����� ���� Ǯ���� �⺻������ ��ȯ���ش�.
		int i = (Integer)obj;
		
		System.out.println("5.0������������ ��ȯ=>"+num);
		System.out.println("5.0���Ĺ������� ��ȯ=>"+i);
		
	}
}






























