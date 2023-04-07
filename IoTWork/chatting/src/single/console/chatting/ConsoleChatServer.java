package single.console.chatting;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ConsoleChatServer {
	public static void main(String[] args) {
		Socket client = null;
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("�������ӿϷ�.....");
			while(true) {
				//Ŭ���̾�Ʈ���� 1:1�� ����ϵ��� �����Ϸ��� Ŭ���̾�Ʈ ������ ����
				//accept�ؼ� Ŭ���̾�Ʈ�� ������ ����ϴ� �κе� ������� ó��
				client = server.accept();
				InetAddress clientIp = client.getInetAddress();
				System.out.println("������ Ŭ���̾�Ʈ:"+clientIp.getHostAddress());
				
				//Ŭ���̾�Ʈ�� �����ϸ� Ŭ���̾�Ʈ�� ����� �� �ִ� ������ �����带 �����ϰ� start
				ServerReceiveThread receiveThread = new ServerReceiveThread(client);
				receiveThread.start();
				new ServerSenderThread(client).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
