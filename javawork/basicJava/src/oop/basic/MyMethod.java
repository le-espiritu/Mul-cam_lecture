package oop.basic;
//���� ������ �޼ҵ带 ����
public class MyMethod {
	//4. �Ű������� �ְ� ���ϰ��� �ִ� �޼ҵ�
	// => ���� 2���� �Է¹޾� ���� ����� �����ϴ� �޼ҵ�
	public int add(int num1,int num2) {
		int result = 0;
		result = num1 +num2;
		return result;		
	}
	
	
	//3. �Ű������� 2�� �ְ� ���ϰ��� ���� �޼ҵ�
	//=> ����� Ư�����ڸ� �Է¹ް�, ����� Ƚ���� �Է¹޾Ƽ� ó���ϱ�
	//                        ------------
	//                           int
	//   MyMethod, MyMethodTest DM���� ����
	public void display(String str,int count) {
		for(int i=1;i<=count;i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	public void display(int count,String str) {
		for(int i=1;i<=count;i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	//2. �Ű������� 1�� �ְ� ���ϰ��� ���� �޼ҵ�
	// ===> �����ϴ�. *�� ������� �ʰ� �ܺο��� �Է��ϴ� Ư�����ڸ� ����ϵ��� ����
	//      ȣ���Ҷ� ���޵Ǵ� Ư�����ڸ� �޸𸮿� �ӽú����ϱ� ���ؼ� str�� ����
	public void display(String str) {
		for(int i=1;i<=10;i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	
	//1. �Ű������� ���� ���ϰ��� ���� �޼ҵ�
	//--> *�� 10�� ����ϴ� ����� �޼ҵ�
	public void display() {
		for(int i=1;i<=10;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}
