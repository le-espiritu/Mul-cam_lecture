package network;

import java.io.IOException;
import java.net.Socket;

//클라이언트
public class MyNetClient01 {
	public static void main(String[] args) {
		//서버와 통신할 수 있는 Socket객체를 생성
		try {
			Socket socket = new Socket("192.168.9.22",50000);
			System.out.println("서버접속완료..."+socket);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
