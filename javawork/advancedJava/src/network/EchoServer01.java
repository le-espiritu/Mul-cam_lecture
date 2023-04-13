package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer01 {
	public static void main(String[] args) {
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
				//클라이언트가 보내오는 데이터를 바로 다시 클라이언트에게 보내주는 작업
				String reMsg="";
				while(true){
					reMsg = in.readLine();//클라이언트가 전송하는 데이터 읽기
					if(reMsg==null){
						break;
					}
					out.println("^^"+reMsg);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(out!=null)out.close();
		}
	}
}






