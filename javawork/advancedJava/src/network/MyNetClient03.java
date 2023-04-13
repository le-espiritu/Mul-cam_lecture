package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;



public class MyNetClient03 {
	public static void main(String[] args) {
		Socket soc = null;
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		try {
			soc = new Socket("192.168.9.44",12345);
			os = soc.getOutputStream();
			dos = new DataOutputStream(os);
			
			is = soc.getInputStream();
			dis = new DataInputStream(is);
			
			//1. 클라이언트<-서버
			String msg1 = dis.readUTF();
			System.out.println(msg1);
			
			int dan = dis.readInt();
			for (int i =1 ;i <=9; i++) {
				System.out.println(dan+"*"+i+"="+(dan*i));
			}
			
			//2. 클라이언트-> 서버
			String msg2 = "";
			if(dan%2==0){
				msg2 = "서버님 짝수입니다.";
			}else{
				msg2 = "서버님 홀수입니다.";
			}
			dos.writeUTF(msg2);		
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(dos!=null)dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}









