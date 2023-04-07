package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class MyNetServer04 {
	public static void main(String[] args) {
		Socket client = null;
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("�������ӿϷ�.....");
			while(true) {
				client = server.accept();
				InetAddress clientIp = client.getInetAddress();
				System.out.println("������ Ŭ���̾�Ʈ:"+clientIp.getHostAddress());
				//��Ʈ��ũ�� ���ؼ� ������� �ϱ� ���� IO��Ʈ����ü�� ����
				in = new BufferedReader(new InputStreamReader(
													client.getInputStream()));
				out = new PrintWriter(client.getOutputStream());
				
				
				//***********��Ž���***************************
				//1. ���� -> Ŭ���̾�Ʈ
				out.println("Ŭ���̾�Ʈ�� ���� ����");
				//����ϱ� ���� �����͸� ��¹��ۿ� �ӽ÷� �׾Ҵٰ� ��Ʈ������ ��µǱ� ���ؼ� ���ۿ� �׿��ִ�
				//�����͸� �������⸦ �ؾ� �Ѵ�. - flush�� ���۸� ����� ����� �������� ���� �޼ҵ�
				out.flush();
				
				//2. ���� <- Ŭ���̾�Ʈ
				String msg = in.readLine();
				System.out.println("Ŭ���̾�Ʈ�� ������ �޽���>>>>>>"+msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
