package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;



public class MyNetClient02 {
	public static void main(String[] args) {
		Socket soc = null;
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		try {
			soc = new Socket("192.168.9.17",12345);
			//������ ����ϱ� ���� ��ü�� �������� ���� �����Ѵ�.
			os = soc.getOutputStream();
			dos = new DataOutputStream(os);
			
			//������ �����ϴ� �����͸� �б� ���� ��ü�� �������� ���� �����Ѵ�.
			is = soc.getInputStream();
			dis = new DataInputStream(is);
			
			//1. Ŭ���̾�Ʈ <-���� (������ ������ �����͸� �б�)
			String msg = dis.readUTF();
			System.out.println("������ ������ ������1:"+msg);
			int intmsg = dis.readInt();
			System.out.println("������ ������ ������2:"+intmsg);
			
			//2. Ŭ���̾�Ʈ -> ����
			dos.writeUTF("�ȳ��ϼ���..Ŭ���̾�Ʈ�Դϴ�.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}









