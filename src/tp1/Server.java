package tp1;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[]args) {
		try {
			ServerSocket Server = new ServerSocket(1234);
			System.out.println("attend la connexion d'un client ");
			Socket socket = Server.accept();
			System.out.println("connecté");
			socket.close();
			Server.close();
			System.out.println("ferme");
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
}
