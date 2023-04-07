package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyNetClient04 {
	public static void main(String[] args) {
		Socket server = null;
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			server =new Socket("192.168.0.221", 12345);
			System.out.println("������ ���� ����");
			//��Ʈ��ũ�� ���ؼ� ������ ������� �ϱ� ���� IO��Ʈ����ü�� ����
			in = new BufferedReader(new InputStreamReader(
								server.getInputStream()));
			out = new PrintWriter(server.getOutputStream(),true);
			
			//***********��Ž���***************************
			//1. Ŭ���̾�Ʈ <- ����
			String msg = in.readLine();
			System.out.println("������ ���� �� �޽���>>>"+msg);
			
			//2. Ŭ���̾�Ʈ -> ����
			out.println("������ �ȳ�...���� Ŭ���̾�Ʈ^^");
			//out.flush();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
