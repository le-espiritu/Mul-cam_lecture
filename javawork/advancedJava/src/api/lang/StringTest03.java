package api.lang;
//String�� �ֿ� �޼ҵ�
public class StringTest03 {
	public static void main(String[] args) {
//		System.out.println("java\t program");
//		System.out.println("java\n program");
//		System.out.println("\"java\" progr\\am");
		
		String str1 = new String("java programming");
		String str2 = new String("��մ�");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("str1.charAt(1)=>"+str1.charAt(1));
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));
		System.out.println("str1.indexOf('a')=>"+str1.indexOf('a'));
		System.out.println("str1.indexOf('��')=>"+str1.indexOf("��"));
		System.out.println("str1.lastIndexOf('a')=>"+str1.lastIndexOf('a'));
		System.out.println("str1.length()=>"+str1.length());
		System.out.println("str1.equals(\"java programming\")=>"+str1.equals("java programming"));
		System.out.println("str1.equals(\"Java programming\")=>"+str1.equals("Java programming"));
		System.out.println("str1.equalsIgnoreCase(\"Java programming\")=>"
													+str1.equalsIgnoreCase("Java programming"));
		
		System.out.println();
		System.out.println();
		System.out.println("str1.startsWith(\"java\")=>"+str1.startsWith("java"));
		System.out.println("str1.endsWith(\"mming\")=>"+str1.endsWith("mming"));
		System.out.println("str1.endsWith(\"java\")=>"+str1.endsWith("java"));
		System.out.println("str1.toUpperCase()=>"+str1.toUpperCase());
		//String��ü�� ������ ������� �ʰ� �޼ҵ� �������� ���ο� String��ü�� ���������.
		//���ڿ� ������ ���� �۾��� String�� ���� ���� �δ�
		System.out.println("���ڿ�����=>"+str1);
		System.out.println("str1.toUpperCase().toLowerCase()=>"+str1.toUpperCase().toLowerCase());
		System.out.println();
		System.out.println();
		
		String data = new String("java programming");
		//GNIMMARGORP AVAJ
		//���ڿ������� ���ؼ� 1���ھ� ����
		//��ü���ڿ��� Ȯ�� -for
		//���ڿ��� �Ųٷ� ó�� : length()-1���� -- ���Ѽ� �۾��ϱ�
		data = data.toUpperCase();
		for(int i=data.length()-1;i>=0;i--) {
			System.out.print(data.charAt(i));
		}
		
	}
}












