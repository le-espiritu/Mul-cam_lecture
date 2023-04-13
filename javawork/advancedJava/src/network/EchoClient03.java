package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient03 {
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
			//Ű����� �Է��ϴ� ������ ���������� ������ ���޵ǵ��� 
			String sendMsg = "";//������ ���� �޽���
			String reMsg = "";//�����κ��� ���� �޽���
			while((sendMsg=keyin.readLine())!=null){
				out.println(sendMsg);
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










