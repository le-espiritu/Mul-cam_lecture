package basic;

public class StringTest {
	public static void main(String[] args) {
		String str = "java programming";
		//��ü ���ڿ����� ���ڸ� �����ϱ� - String Ŭ������ charAt�� �̿�
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		for(int i=0;i<str.length();i++) {
			System.out.println((char)(str.charAt(i)+1));
		}
	}
}
