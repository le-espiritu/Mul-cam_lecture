package statement;
//while�� �����
public class WhileTest01 {
	public static void main(String[] args) {
		//�ڹ����α׷��� ���ڿ��� 5�� ���
		int i = 1;
		while(i<=5) {
			System.out.println("�ڹ����α׷���");
			i++;
		}
		System.out.println("======================");
		i=1;//i������ ������
		while(true) { //���ѷ���
			if(i>5) {
				//while���� ����������
				break;
			}
			System.out.println("�ڹ����α׷���:"+i);
			i++;
		}
	}
}
