package exception;

import java.io.FileReader;

//throws�� �޼ҵ带 ȣ���ϴ� ������ ���ܸ� ó���ϵ��� ����
//�ڹ����������Ϳ��� ���ܿ� ���� ó���� �ϵ��� �ѱ��(���ܸ� ������.)
public class ExceptionTest06 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("test.txt");
	}
}
