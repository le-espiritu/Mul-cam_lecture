package network;

import java.io.IOException;
import java.net.Socket;

//Ŭ���̾�Ʈ
public class MyNetClient01 {
	public static void main(String[] args) {
		//������ ����� �� �ִ� Socket��ü�� ����
		try {
			Socket socket = new Socket("192.168.9.22",50000);
			System.out.println("�������ӿϷ�..."+socket);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
