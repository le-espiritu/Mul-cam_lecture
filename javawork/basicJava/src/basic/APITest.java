package basic;

public class APITest {
	public static void main(String[] args) {
		System.out.println("���ڿ�");
		int i = 10;
		//���ڿ��� ó���ϱ� ���� ����� ����ϱ� ���� String Ŭ������ JVM�� �ν��ϴ�(ã�Ƽ� ����� �� �ִ�, �̸� ��ӵ�) �۾������� �Ҵ�
		//                                 -------------------------------------------------------------------
		//                                                    heap�� �Ҵ��Ѵٴ� �ǹ�
		//[����]
		//�Ҵ�Ǵ�Ŭ����Ÿ�� ������  = new heap�� �Ҵ��ؼ� ����ϰ� ���� Ŭ������()
		//                         or new heap�� �Ҵ��ؼ� ����ϰ� ���� Ŭ������(�Ҵ��ϱ� ���� �ʿ��� ��1, ��2.......)
		//
		
		//java���ڿ��� ó���ϱ� ���ؼ� StringŬ������ heap�� �Ҵ�
		//heap�Ҵ�� String��ü�� APITest.java�� main������ ����ϱ� ���ؼ� str������ ���� ������ �� �ֵ��� heap�� �ּҸ� ����
		String str = new String("java");
		Thread t =  new Thread();
		Object o = new Object();
		
		//str�� �����ϴ�(str�� �˰� �ִ�) �ּҸ� ������ heap�� �ִ� ��ü�� ����
		//heap�� �Ҵ�� String��ü�� length�޼ҵ带 ����
		str.length();//�޼ҵ�ȣ��
	}
}
