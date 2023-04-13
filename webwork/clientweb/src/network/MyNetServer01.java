package network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//����
public class MyNetServer01 {
	public static void main(String[] args) {
		//Ŭ���̾�Ʈ�� ����� �� �ֵ��� �غ�
		//=> Ŭ���̾�Ʈ�� ����ϱ� ���ؼ� ServerSocket�� ����
		try {
			//Ŭ���̾�Ʈ�� ����ϱ����� ������ ���� �غ�
			ServerSocket server = new ServerSocket(50000);
			System.out.println("�����غ� �Ϸ�...Ŭ���̾�Ʈ�� ������ ��ٸ�");
			//Ŭ���̾�Ʈ�� �����ϸ� Ŭ���̾�Ʈ�� ����� �� �ִ� ������ �޾ƿ´�.
			while(true){
				Socket client = server.accept();
				InetAddress ip = client.getInetAddress();
				System.out.println("������ Ŭ���̾�Ʈ:"+ip.getHostAddress());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
