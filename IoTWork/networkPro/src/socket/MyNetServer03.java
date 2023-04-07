package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
public class MyNetServer03 {
	public static void main(String[] args) {
		Socket client = null;
		InputStream socketIn = null;//Ŭ���̾�Ʈ�� �������� �����͸� �б� ���ؼ� ���Ͽ��� �������� ��Ʈ����ü
		OutputStream socketOut = null;//Ŭ���̾�Ʈ���� �����͸� ������ ���ؼ� ���Ͽ��� �������� ��Ʈ����ü
		DataInputStream dis = null;//Ŭ���̾�Ʈ�� ���� ���� �����͸� Ÿ�Ժ��� �б� ���� ����ϴ� ������Ʈ����ü
		DataOutputStream dos = null;//Ŭ���̾�Ʈ�� �����͸� Ÿ�Ժ��� ������ ���� ����ϴ� ������Ʈ����ü
		Random rand = new Random();
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("�����غ�Ϸ�.....Ŭ���̾�Ʈ�� ������ ��ٸ�");
			while(true) {
				client =  server.accept();
				InetAddress clientIp =  client.getInetAddress();
				System.out.println("������ Ŭ���̾�Ʈ:"+clientIp.getHostAddress());
				
				socketIn = client.getInputStream();
				socketOut = client.getOutputStream();
				dis = new DataInputStream(socketIn);
				dos = new DataOutputStream(socketOut);
				
				//1. ���� -> Ŭ���̾�Ʈ
				dos.writeUTF("�ȳ��ϼ��� Ŭ���̾�Ʈ��");
				//2. ���� -> Ŭ���̾�Ʈ
				int randNum = rand.nextInt(8)+2;//0~7
				dos.writeInt(randNum);
				
				//3. ���� <- Ŭ���̾�Ʈ
				String data =  dis.readUTF();
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
