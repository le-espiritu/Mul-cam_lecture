package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

//네트워크 상의 파일(자원)을 읽을 수 있는 기능을 지원하는 객체
public class URLTest01 {
	public static void main(String[] args) {
		try {
			URL url = new URL(args[0]);
			System.out.println(url.toString());
			System.out.println("url.getHost()=>"+url.getHost());
			System.out.println("url.getPath()=>"+url.getPath());
			//getPort가 -1이면 -1포트로 접속했다는 의미가 아니라 프로토콜에 등록
			//되어 있는 기본 port로 접속했다는 의미
			//http프로토콜의 기본 port 80
			System.out.println("url.getPort()=>"+url.getPort());
			System.out.println("url.getProtocol()=>"
								+url.getProtocol());
			System.out.println("url.getFile()=>"+url.getFile());
			//BufferdReader로 읽어 출력
			/*InputStream in = url.openStream();
			InputStreamReader isr = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(isr);*/
			
			BufferedReader br = 
					new BufferedReader(
						new InputStreamReader(url.openStream()));
			while(true){
				String line = br.readLine();
				if(line==null){
					break;
				}
				System.out.println(line);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}










