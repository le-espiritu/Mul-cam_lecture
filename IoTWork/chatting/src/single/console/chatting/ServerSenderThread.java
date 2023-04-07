package single.console.chatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

//�������� Ŭ���̾�Ʈ�� �޽����� �����ϴ� �۾��� �����ϴ� ������
public class ServerSenderThread extends Thread{
	Socket client;//Ŭ���̾�Ʈ
	//�����尡 �����ɶ� Ŭ���̾�Ʈ ������ �Ѱ� �޵��� �۾�
	public ServerSenderThread(Socket client) {
		super();
		this.client = client;
	}
	//Ű����� �Է��� �޽����� ������ ������ �۾��� ó��
	@Override
	public void run() {
		BufferedReader keyin = null;
		PrintWriter out = null;
		try {
			keyin = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(client.getOutputStream(),true);
			String sendMsg="";//Ŭ���̾�Ʈ�� ���� �޽���
			while(true) {
				sendMsg = keyin.readLine();
				if(sendMsg==null) {
					break;
				}
				out.println(sendMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
