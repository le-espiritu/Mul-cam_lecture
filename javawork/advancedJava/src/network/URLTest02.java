package network;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest02 {
	public static void main(String[] args) {
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		try {
			URL url = new URL(args[0]);
			bis = new BufferedInputStream(url.openStream());
			fos = new FileOutputStream("src/images/jangImg.jpg");
			while(true){
				int data = bis.read();
				if(data==-1){
					break;
				}
				fos.write(data);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{		
				try {
					if(bis!=null)bis.close();
					if(fos!=null)fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}

}
