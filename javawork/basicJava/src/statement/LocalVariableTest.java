package statement;

//�ڹٿ��� ����(local)������ Ư¡
// - { }(��) ���ο��� ����Ǵ� ������ ��� ���ú����� �Ѵ�. ��, Ŭ���� ����� ���� ����Ǵ� ������ ����.
// - �ڹٿ����� ���������� ������ ����.
// 
public class LocalVariableTest {
	int i = 0;//���ú��� �ƴ�
	public static void main(String[] args) {
		int j = 10; //���ú���
		//1. ���ú����� ����ϱ� ���� �ݵ�� �ʱ�ȭ(���� =�����ڷ� �Ҵ�)�ؾ� �Ѵ�.
		int num;
		//System.out.println("���ú���=>"+num);
		int val = 0; //������������ 0���� �ʱⰪ�� �����Ѵ�.
		if(j>=10) {
			val = 100; //���ú���
			//int j = 100;
			System.out.println("val="+val);
		}else {
			for(int k=0;k<=10;k++) { //k�� for�� �ȿ��� ����� ������ �����Ƿ� ���ú���
				System.out.println(k);
			}
		}
		//2. ���ú����� ����� �� ���ο����� ����� �� �ִ�.
		//   ���� ������ �޸𸮿��� �����ȴ�.
		System.out.println("val�� ��=>"+val);
	}
}











