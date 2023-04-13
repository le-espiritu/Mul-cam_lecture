package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer03{
	public static void main(String[] args) {
		BufferedReader keyin = null;
		BufferedReader in = null;
		PrintWriter out = null;
		Socket client = null;
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("클라이언트가 접속하기를 기다림......");
			while(true){
				client = server.accept();
				System.out.println(
						client.getInetAddress().getHostAddress()
						+"님 접속");
				in = new BufferedReader(
						new InputStreamReader(
								client.getInputStream()));
				out = new PrintWriter(client.getOutputStream(),
						true);
				keyin = new BufferedReader(
						new InputStreamReader(System.in));
				String reMsg="";
				String sendMsg="";
				while(true){
					reMsg = in.readLine();//클라이언트가 전송하는 데이터 읽기
					System.out.println("클라이언트>>"+reMsg);
					if(reMsg==null){
						break;
					}
					//클라이언트에게 보낼 메시지를 키보드로 입력받아 전송
					sendMsg = keyin.readLine();
					out.println(sendMsg);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(out!=null)out.close();
		}
	}
}






