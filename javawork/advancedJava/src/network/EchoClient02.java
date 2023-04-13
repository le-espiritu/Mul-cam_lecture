package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient02 {
	public static void main(String[] args) {
		BufferedReader keyin = null;
		BufferedReader in = null;
		PrintWriter out = null;
		Socket socket = null;
		try {
			socket = new Socket("192.168.9.44",12345);
			in = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(),
					true);
			keyin = new BufferedReader(
						new InputStreamReader(System.in));
			String sendMsg = "";//������ ���� �޽���
			String reMsg = "";//�����κ��� ���� �޽���
			reMsg = in.readLine();
			System.out.println("������ ������ �޽���>>"+reMsg);
			while((sendMsg=keyin.readLine())!=null){
				//Ű����� �Է��� �����͸� ������ ����
				out.println(sendMsg);
				//������ �������� �����͸� �б�
				reMsg = in.readLine();
				System.out.println("�������� ���۵� �޽���>>"+reMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(out!=null) out.close();
		}
	}
}










