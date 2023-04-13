package network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//서버
public class MyNetServer01 {
	public static void main(String[] args) {
		//클라이언트와 통신할 수 있도록 준비
		//=> 클라이언트와 통신하기 위해서 ServerSocket을 생성
		try {
			//클라이언트와 통신하기위한 소켓을 열고 준비
			ServerSocket server = new ServerSocket(50000);
			System.out.println("서버준비 완료...클라이언트의 접속을 기다림");
			//클라이언트가 접속하면 클라이언트와 통신할 수 있는 소켓을 받아온다.
			while(true){
				Socket client = server.accept();
				InetAddress ip = client.getInetAddress();
				System.out.println("접속한 클라이언트:"+ip.getHostAddress());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
