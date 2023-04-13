package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;



public class MyNetServer03 {
	public static void main(String[] args) {
		//클라이언트와 통신하기 위한 소켓객체
		Socket client = null;
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		Random rand = new Random();
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("클라이언트의 접속을 기다림...");
			while(true){
				client = server.accept();
				os = client.getOutputStream();
				dos = new DataOutputStream(os);
				is = client.getInputStream();
				dis = new DataInputStream(is);
				//1. 서버 -> 클라이언트
				dos.writeUTF("안녕하세요 클라이언트님");
				int randomNum = rand.nextInt(8)+2;
				dos.writeInt(randomNum);
				
				//2. 서버<-클라이언트
				String clientMsg = dis.readUTF();
				System.out.println(clientMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}








