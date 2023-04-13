package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;



public class MyNetServer04 {
	public static void main(String[] args) {
		//Ŭ���̾�Ʈ�� ����ϱ� ���� ���ϰ�ü
		Socket client = null;
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ�...");
			while(true){
				client = server.accept();
				System.out.println(
					client.getInetAddress().getHostAddress()
					+"�� ����");
				//Ŭ���̾�Ʈ�� ����� �� �ִ� input/output��Ʈ����
				//�������� ���� ���´�.
				in = new BufferedReader(
						new InputStreamReader(
								client.getInputStream()));
				out = new PrintWriter(client.getOutputStream(),
						true);
				//********��Ž���*********
				out.println("Ŭ���̾�Ʈ�� ���� ����");//����->Ŭ���̾�Ʈ
				
				//����<-Ŭ���̾�Ʈ
				String msg = in.readLine();
				System.out.println("Ŭ���̾�Ʈ�� ������ ������>>"+msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(out!=null)out.close();
		}
		
	}
}








