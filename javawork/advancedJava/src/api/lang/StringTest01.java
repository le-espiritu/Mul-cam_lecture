package api.lang;
//String�� �����ϴ� ���
// - ���ͷ�(literal) 
// - ��ü����
public class StringTest01 {
	public static void main(String[] args) {
		//String�� ���ͷ��� �������� �Ҵ��ϸ� heap�� String��� pool�� ����
		String str1 = "java";
		String str2 = "java";
		
		//��ü�������� �Ҵ� - �ν��Ͻ������
		String str3 = new String("java");
		String str4 = new String("java");
		
		if(str1==str2) {//����.
			System.out.println("����.");
		}else {
			System.out.println("�ٸ���.");
		}
		
		if(str1==str3) {//�ٸ���
			System.out.println("����.");
		}else {
			System.out.println("�ٸ���.");
		}
		

		if(str3==str4) {//�ٸ���
			System.out.println("����.");
		}else {
			System.out.println("�ٸ���.");
		}
		//String��ü�� �Ҵ� ����ϰ� ������� ���ڿ��� ��
		if(str1.equals(str4)) {//����
			System.out.println("����.");
		}else {
			System.out.println("�ٸ���.");
		}
	}

}
