package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

//API���� �����Ǵ� Ŭ������ ����ϴ� ��� �߻��ϴ� ���� ó��
//FileNotFoundException,IOException�� ȣ���ϴ� ������ ���ܿ� ���� ó���� ���� ������ ���������� �߻��Ǿ� �������� ������� �ʴ´�.
//NumberFormatException�� ȣ���ϴ� ������ ���ܿ� ���� ó���� ���� �ʾƵ� ���������� �߻����� �ʴ´�.
//====> RuntimeException�� ���� Exception�� ����ó���� ���� �ʾƵ� ���������� �߻����� �ʴ´�.(unChecked����)
//====> RuntimeException�� ���� Exception�� �ƴ� ��� ���ܿ� ���� ó���� �ݵ�� �ؾ� �Ѵ�.(checked����)
//====> ���������� ����ó���� �����ϰų� ���������ʰų� ��� ���ܿ� ���� ó���� �ؾ� �Ѵ�.
public class ExceptionTest05 {
	public static void main(String[] args) {
		//FileReader�� FileNotFoundException�� throws�ϰ� �ִٴ� ���� ���ο��� ���ܸ� ���� ó������ �ʰ� ȣ���ϴ� ������ ���ܸ� 
		//ó���϶�� �ǹ�
		try {
			FileReader fr = new FileReader("test.txt");	
			System.out.println((char)fr.read());//IOException�� �߻��ǹǷ� ó���ؾ� �Ѵ�.
			System.out.println(Integer.parseInt("����������"));
			DriverManager.getConnection("");
		}catch(FileNotFoundException e) {
			System.out.println("�ش� ������ ã�� �� �����ϴ�. ");
			//���ϸ��� Ʋ�� ��� ó���ؾ� �ϴ� �ڵ带 ���
		}catch(IOException e) {
			System.out.println("������ ���� �� �����ϴ�.");
		}catch(SQLException e) {
			System.out.println("Ŀ�ؼǽ���");
		}catch(NumberFormatException e) {
			System.out.println("���ڸ� �Է��ϼ���.");
		}
		
		
	}
}
