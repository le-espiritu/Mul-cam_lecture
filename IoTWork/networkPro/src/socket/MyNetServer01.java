package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyNetServer01 {
	public static void main(String[] args) {
		try {
			//1. Ŭ���̾�Ʈ�� ����� �� �ִ� ��ü�� ����
			ServerSocket server = new ServerSocket(12345);
			System.out.println("�����غ�Ϸ�.....Ŭ���̾�Ʈ�� ������ ��ٸ�");
			//2. Ŭ���̾�Ʈ�� �����Ҷ����� ���
			//   Ŭ���̾�Ʈ�� �����ϸ� ������ Ŭ���̾�Ʈ�� ������ ����
			Socket client =  server.accept();
			System.out.println("������ Ŭ���̾�Ʈ:"+client);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
