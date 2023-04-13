package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;



public class MyNetServer03 {
	public static void main(String[] args) {
		//Ŭ���̾�Ʈ�� ����ϱ� ���� ���ϰ�ü
		Socket client = null;
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		Random rand = new Random();
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ�...");
			while(true){
				client = server.accept();
				os = client.getOutputStream();
				dos = new DataOutputStream(os);
				is = client.getInputStream();
				dis = new DataInputStream(is);
				//1. ���� -> Ŭ���̾�Ʈ
				dos.writeUTF("�ȳ��ϼ��� Ŭ���̾�Ʈ��");
				int randomNum = rand.nextInt(8)+2;
				dos.writeInt(randomNum);
				
				//2. ����<-Ŭ���̾�Ʈ
				String clientMsg = dis.readUTF();
				System.out.println(clientMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}








