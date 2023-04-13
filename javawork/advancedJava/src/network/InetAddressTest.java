package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
	public static void main(String[] args) {
		try {
			InetAddress ia = InetAddress.getByName(args[0]);
			System.out.println("ia.getHostName()=>"+
									ia.getHostName());
			System.out.println("ia.getHostAddress()=>"+
									ia.getHostAddress());
			System.out.println("InetAddress.getLocalHost()=>"+
					InetAddress.getLocalHost());
			InetAddress[] ias = 
					InetAddress.getAllByName(args[0]);
			System.out.println("****getAllByNameÀÌ¿ë*****");
			for (int i = 0; i < ias.length; i++) {
				System.out.println("ia.getHostName()=>"+
						ias[i].getHostName());
				System.out.println("ia.getHostAddress()=>"+
						ias[i].getHostAddress());
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
