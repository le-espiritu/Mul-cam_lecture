package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer01 {
	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		Socket client = null;
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("Ŭ���̾�Ʈ�� �����ϱ⸦ ��ٸ�......");
			while(true){
				client = server.accept();
				System.out.println(
						client.getInetAddress().getHostAddress()
						+"�� ����");
				in = new BufferedReader(
						new InputStreamReader(
								client.getInputStream()));
				out = new PrintWriter(client.getOutputStream(),
						true);
				//Ŭ���̾�Ʈ�� �������� �����͸� �ٷ� �ٽ� Ŭ���̾�Ʈ���� �����ִ� �۾�
				String reMsg="";
				while(true){
					reMsg = in.readLine();//Ŭ���̾�Ʈ�� �����ϴ� ������ �б�
					if(reMsg==null){
						break;
					}
					out.println("^^"+reMsg);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(out!=null)out.close();
		}
	}
}






