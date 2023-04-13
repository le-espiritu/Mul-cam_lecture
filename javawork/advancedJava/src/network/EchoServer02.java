package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class EchoServer02{
	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		Socket client = null;
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("클라이언트가 접속하기를 기다림......");
			while(true){
				client = server.accept();
				String ip
				=	client.getInetAddress().getHostAddress();
				in = new BufferedReader(
						new InputStreamReader(
								client.getInputStream()));
				out = new PrintWriter(client.getOutputStream(),
						true);
				
				String reMsg="";
				out.println("안녕하세요 클라이언트님?");
				while((reMsg=in.readLine())!=null){
					if(reMsg.startsWith("안녕하세요")|
							reMsg.startsWith("하이")){
						out.println(ip+"님 반갑습니다.");
					}else if(reMsg.startsWith("오늘 날짜는")){
						out.println(new Date().toString());
					}else{
						out.println(ip+"님 어여 가~~");
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			
		}finally{
			if(out!=null)out.close();
		}
	}
}






