package basic;
//�񱳿�����
public class OprTest02{
	public static void main(String[] args){
		int num1 = 100;
		int num2 = 200;
		int num3 = 200;
		//num1������ +������ ������ ���ڿ��� �Ǿ��� ������ �����߻�
		//+�����ڴ� ���ϱ��� �ǹ� ���� �����ϴ� ����� ó��
		//+������ �տ� ���ڿ��� ������ �ڿ� ���ڰ� �־ ���ڿ��� ��ȯ�ȴ�.
		//�񱳿���, ��Ģ������ �� �� ����.
		System.out.println("���Ѱ��==>"+ (num1+num2));
		System.out.println("num1>num2==>"+ (num1>num2));
		System.out.println("num1>=num2==>"+ (num1>=num2));
		System.out.println("num1<num2==>"+ (num1<num2));
		System.out.println("num1<=num2==>"+ (num1<=num2));


		System.out.println("num1==num3==>"+ (num1==num3));
		System.out.println("num2==num3==>"+ (num2==num3));
		System.out.println("num1!=num3==>"+ (num1!=num3));
	}
}