package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;



public class MyNetClient04 {
	public static void main(String[] args) {
		Socket soc = null;
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			soc = new Socket("192.168.9.44",12345);
			in = new BufferedReader(
					new InputStreamReader(
							soc.getInputStream()));
			out = new PrintWriter(soc.getOutputStream(),
					true);
			String msg = in.readLine();
			System.out.println("�����κ��� ���۵� ������>>"+msg);
			out.print("�����ȳ�");
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			if(out!=null)out.close();
		}
	}

}









