package basic;
//���׿�����, ���Կ�����
public class OprTest05{
	public static void main(String[] args) {
		int num1 = 90;
		//���׿�����
		//����?�����̸����ϴ� ��� �Ҵ�� ��:������ �������� ������ �Ҵ�� ��
		System.out.println(num1>=90?"�հ�":"���հ�");
		int point = num1>=90?1000:0;
		System.out.println(point);

		//���Կ�����
		int i = 0;
		i = i+20;
		System.out.println("i="+i);

		i+=30;
		System.out.println("i="+i);

		i-=30;
		System.out.println("i="+i);

		i*=30;
		System.out.println("i="+i);

		i/=30;
		System.out.println("i="+i);
	}
}
