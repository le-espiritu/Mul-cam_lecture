package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;



public class MyNetServer02 {
	public static void main(String[] args) {
		//클라이언트와 통신하기 위한 소켓객체
		Socket client = null;
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("클라이언트의 접속을 기다림...");
			while(true){
				client = server.accept();
				//클라이언트로 출력하기 위한 객체를 소켓으로 부터 생성한다.
				os = client.getOutputStream();
				dos = new DataOutputStream(os);
				
				//클라이언트가 전송하는 데이터를 읽기 위한 객체를 소켓으로 부터 생성한다.
				is = client.getInputStream();
				dis = new DataInputStream(is);
				
				//1. 서버->클라이언트
				dos.writeUTF(client.getInetAddress().getHostAddress()
						+"님 접속을 환영합니다.");
				dos.writeInt(1000);
				
				//2. 서버 <- 클라이언트
				String clientMsg = dis.readUTF();
				System.out.println("클라이언트가 전송한 데이터:"+clientMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}








