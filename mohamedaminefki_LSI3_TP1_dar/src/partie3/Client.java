package partie3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[]args) {
		try 
		  {
			
			InetAddress inetAdress = InetAddress.getByName("10.27.15.178");
			InetSocketAddress inetSocketAdre = new InetSocketAddress(inetAdress,1234); 
			
			Socket client = new Socket();
			client.connect(inetSocketAdre); 
	
			System.out.println("je suis un client connecté");
			
			InputStream is = client.getInputStream();
			OutputStream os = client.getOutputStream();
			int nb;
			System.out.println("nb= ");	
			try (Scanner scanner = new Scanner(System.in)) {
				nb=scanner.nextInt();
			}
			os.write(nb);
			int response =is.read();
			System.out.println("le nombre est "+response);
			client.close();
			System.out.println("disconnexion");
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

