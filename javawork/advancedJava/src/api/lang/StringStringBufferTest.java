package api.lang;
//String�� StringBuffer�� ���� ����
public class StringStringBufferTest {
	//String���� ���ڿ� �߰��ϱ� ����� ���� - +�����ڷ� �߰�
	public static void stringCheck(int count) {
		//�����Ҷ� ���� �ð��� ���� - nanoTime
		String str = new String("�ڹ�");
		long start = System.nanoTime();
		for(int i=1;i<=count;i++) {
			str = str+"java";
		}
		//�۾��� ����ɶ� ���� �ð��� ����
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("str = str + java");
		System.out.println("����ð�:"+time);
	}
	//StringBuffer�� ���ڿ� �߰��ϱ� - append
	public static void stringBufferCheck(int count) {
		//�����Ҷ� ���� �ð��� ���� - nanoTime
		StringBuffer sb = new StringBuffer("�ڹ�");
		long start = System.nanoTime();
		for(int i=1;i<=count;i++) {
			sb.append("java");
		}
		//�۾��� ����ɶ� ���� �ð��� ����
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("sb.append(\"java\")");
		System.out.println("����ð�:"+time);
	}
	
	
	
	
	
	public static void main(String[] args) {
		int count = 10000;
		System.out.println("����Ƚ��:"+count);
		stringCheck(count);
		stringBufferCheck(count);
	}
}
