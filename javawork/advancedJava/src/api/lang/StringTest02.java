package api.lang;
//String�� ������ Ȯ��
public class StringTest02 {
	public static void main(String[] args) {
		byte[] data = {65,66,67,68,69,70};
		char[] data2 = new char[] {'0','1','0','-','7','7','7','7','-'};
		
		//StringŬ������ ����ϴ� ��� �پ��� Ÿ���� �Էµ����͸� ���ڿ��� ����� ���ؼ� �����Ҷ� �ʱ�ȭ�� �� �ֵ��� �پ��� Ÿ���� 
		//�����ڰ� �����ε��Ǿ� �ִ�.
		String str = new String("java");
		String str1 = new String(data);
		String str2 = new String(data2);
		String str3 = new String(data2,3,5);
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);//toString()ȣ���� ����
		System.out.println(str3);
		
	}
}
