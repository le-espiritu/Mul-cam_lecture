package exception;
//��������� Exception�����
//==> ���α׷��� �����ϸ� �����ڰ� ���ϴ� ��Ȳ�� ���ܻ�Ȳ���� ����ϱ�
//1. ��������� Ŭ������ ExceptionŬ������ �����ϱ�
public class MyException extends Exception{
	public MyException() {
		super("Ȧ�� �Է����� ������...");
	}
}
