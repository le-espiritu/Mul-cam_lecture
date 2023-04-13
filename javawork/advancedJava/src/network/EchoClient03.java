package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoClient03 {
	public static void main(String[] args) {
		BufferedReader keyin = null;
		BufferedReader in = null;
		PrintWriter out = null;
		Socket socket = null;
		try {
			socket = new Socket("192.168.9.44",12345);
			in = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(),
					true);
			keyin = new BufferedReader(
						new InputStreamReader(System.in));
			//키보드로 입력하는 내용이 지속적으로 서버에 전달되도록 
			String sendMsg = "";//서버로 보낼 메시지
			String reMsg = "";//서버로부터 받을 메시지
			while((sendMsg=keyin.readLine())!=null){
				out.println(sendMsg);
				reMsg = in.readLine();
				System.out.println("서버에서 전송된 메시지>>"+reMsg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(out!=null) out.close();
		}
	}
}










