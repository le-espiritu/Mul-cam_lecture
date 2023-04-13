package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;



public class MyNetServer02 {
	public static void main(String[] args) {
		//Ŭ���̾�Ʈ�� ����ϱ� ���� ���ϰ�ü
		Socket client = null;
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ�...");
			while(true){
				client = server.accept();
				//Ŭ���̾�Ʈ�� ����ϱ� ���� ��ü�� �������� ���� �����Ѵ�.
				os = client.getOutputStream();
				dos = new DataOutputStream(os);
				
				//Ŭ���̾�Ʈ�� �����ϴ� �����͸� �б� ���� ��ü�� �������� ���� �����Ѵ�.
				is = client.getInputStream();
				dis = new DataInputStream(is);
				
				//1. ����->Ŭ���̾�Ʈ
				dos.writeUTF(client.getInetAddress().getHostAddress()
						+"�� ������ ȯ���մϴ�.");
				dos.writeInt(1000);
				
				//2. ���� <- Ŭ���̾�Ʈ
				String clientMsg = dis.readUTF();
				System.out.println("Ŭ���̾�Ʈ�� ������ ������:"+clientMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}








