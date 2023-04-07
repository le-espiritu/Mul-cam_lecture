package socket.echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
//������ Ŭ���̾�Ʈ�� Ű����� ����ϱ�
public class MyEchoServer03 {
	public static void main(String[] args) {
		Socket client = null;
		BufferedReader in = null;//Ŭ���̾�Ʈ�� ����ϱ� ���� ��Ʈ��
		BufferedReader keyin = null;//Ű����� �Է��ϴ� �޽����� �б� ���� ��Ʈ��
		PrintWriter out = null;
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("�������ӿϷ�.....");
			while(true) {
				client = server.accept();
				InetAddress clientIp = client.getInetAddress();
				System.out.println("������ Ŭ���̾�Ʈ:"+clientIp.getHostAddress());
				in = new BufferedReader(new InputStreamReader(
													client.getInputStream()));
				out = new PrintWriter(client.getOutputStream(),true);
				keyin = new BufferedReader(new InputStreamReader(System.in));
				String sendMsg="";
				String resMsg="";//Ŭ���̾�Ʈ�� ������ �޽���
				while(true) {
					//1. ���� <- Ŭ���̾�Ʈ
					resMsg = in.readLine();
					System.out.println("Ŭ���̾�Ʈ�� ���� �޽���>>"+resMsg);
					if(resMsg==null) {
						break;
					}
				
					//2. ���� -> Ŭ���̾�Ʈ
					sendMsg = keyin.readLine();
					out.println(sendMsg);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}











