package api.lang;
//StringBuffer
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java programming");
		System.out.println("����=>"+sb);
		
		sb.append("��մ�.");//�� �ڿ� �߰�
		System.out.println("����=>"+sb);
		
		sb.insert(2,"�ڹ�");//������ index��° ���ڿ��� ����
		System.out.println("����=>"+sb);
		
		sb.delete(2, 6);//start ~ end-1��ġ�� ���ڿ� ����
		System.out.println("����=>"+sb);
		
		sb.reverse();
		System.out.println("����=>"+sb);
	}
}
