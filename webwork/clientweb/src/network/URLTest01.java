package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

//��Ʈ��ũ ���� ����(�ڿ�)�� ���� �� �ִ� ����� �����ϴ� ��ü
public class URLTest01 {
	public static void main(String[] args) {
		try {
			URL url = new URL(args[0]);
			System.out.println(url.toString());
			System.out.println("url.getHost()=>"+url.getHost());
			System.out.println("url.getPath()=>"+url.getPath());
			//getPort�� -1�̸� -1��Ʈ�� �����ߴٴ� �ǹ̰� �ƴ϶� �������ݿ� ���
			//�Ǿ� �ִ� �⺻ port�� �����ߴٴ� �ǹ�
			//http���������� �⺻ port 80
			System.out.println("url.getPort()=>"+url.getPort());
			System.out.println("url.getProtocol()=>"
								+url.getProtocol());
			System.out.println("url.getFile()=>"+url.getFile());
			//BufferdReader�� �о� ���
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










