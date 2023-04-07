package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
public class MyNetClient03 {
	public static void main(String[] args) {
		Socket serverobj = null;
		InputStream socketIn = null;
		OutputStream socketOut = null;
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			serverobj = new Socket("192.168.0.221", 12345);
			System.out.println("서버접속완료:"+serverobj);
			socketIn = serverobj.getInputStream();
			socketOut = serverobj.getOutputStream();
			dis = new DataInputStream(socketIn);
			dos = new DataOutputStream(socketOut);
			
			//클라이언트 <- 서버
			String data = dis.readUTF();
			System.out.println("서버가 전송한 메시지1>>"+data);
			//클라이언트 <- 서버
			int gugu = dis.readInt();
			for (int i = 1; i <=9; i++) {
				System.out.println(gugu+"*"+i+"="+(gugu*i));
			}
			
			//클라이언트 -> 서버
			String clientMsg = "";
			if(gugu%2==0) {
				clientMsg = "짝수";
			}else {
				clientMsg = "홀수";
			}
			dos.writeUTF(clientMsg);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}








