package api.lang;
//StringŬ������ �ֿ� �޼ҵ�
public class StringTest04 {
	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("��մ�");
		//5�� index���� ����
		System.out.println("str1.substring(5)=>"+str1.substring(5));
		//5�� ~ 7�� ���� ����
		System.out.println("str1.substring(5,8)=>"+str1.substring(5,8));
		System.out.println("str1.replace('a','A')=>"+str1.replace('a','A'));
		System.out.println("���ڿ�����=>"+str1);
		
	}
}
