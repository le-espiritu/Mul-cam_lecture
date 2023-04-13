package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;



public class MyNetClient02 {
	public static void main(String[] args) {
		Socket soc = null;
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		try {
			soc = new Socket("192.168.9.17",12345);
			//서버로 출력하기 위한 객체를 소켓으로 부터 생성한다.
			os = soc.getOutputStream();
			dos = new DataOutputStream(os);
			
			//서버가 전송하는 데이터를 읽기 위한 객체를 소켓으로 부터 생성한다.
			is = soc.getInputStream();
			dis = new DataInputStream(is);
			
			//1. 클라이언트 <-서버 (서버가 보내는 데이터를 읽기)
			String msg = dis.readUTF();
			System.out.println("서버가 전송한 데이터1:"+msg);
			int intmsg = dis.readInt();
			System.out.println("서버가 전송한 데이터2:"+intmsg);
			
			//2. 클라이언트 -> 서버
			dos.writeUTF("안녕하세요..클라이언트입니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}









