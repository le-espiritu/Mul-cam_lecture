package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;



public class MyNetServer04 {
	public static void main(String[] args) {
		//클라이언트와 통신하기 위한 소켓객체
		Socket client = null;
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("클라이언트의 접속을 기다림...");
			while(true){
				client = server.accept();
				System.out.println(
					client.getInetAddress().getHostAddress()
					+"님 접속");
				//클라이언트와 통신할 수 있는 input/output스트림을
				//소켓으로 부터 얻어온다.
				in = new BufferedReader(
						new InputStreamReader(
								client.getInputStream()));
				out = new PrintWriter(client.getOutputStream(),
						true);
				//********통신시작*********
				out.println("클라이언트님 접속 성공");//서버->클라이언트
				
				//서버<-클라이언트
				String msg = in.readLine();
				System.out.println("클라이언트가 전송한 데이터>>"+msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(out!=null)out.close();
		}
		
	}
}








