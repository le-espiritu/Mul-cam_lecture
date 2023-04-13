package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class EchoServer02{
	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		Socket client = null;
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("Ŭ���̾�Ʈ�� �����ϱ⸦ ��ٸ�......");
			while(true){
				client = server.accept();
				String ip
				=	client.getInetAddress().getHostAddress();
				in = new BufferedReader(
						new InputStreamReader(
								client.getInputStream()));
				out = new PrintWriter(client.getOutputStream(),
						true);
				
				String reMsg="";
				out.println("�ȳ��ϼ��� Ŭ���̾�Ʈ��?");
				while((reMsg=in.readLine())!=null){
					if(reMsg.startsWith("�ȳ��ϼ���")|
							reMsg.startsWith("����")){
						out.println(ip+"�� �ݰ����ϴ�.");
					}else if(reMsg.startsWith("���� ��¥��")){
						out.println(new Date().toString());
					}else{
						out.println(ip+"�� � ��~~");
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			
		}finally{
			if(out!=null)out.close();
		}
	}
}






