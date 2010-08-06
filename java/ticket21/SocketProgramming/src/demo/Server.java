package demo;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;


class Provider {
	
	ServerSocket providerSocket;
	Socket connection = null;
	ObjectOutputStream out;
	ObjectInputStream in;
	String Message;
	
	void run() {
		try {
			
			providerSocket = new ServerSocket(2006,4);
			
			System.out.println("Waiting for Connection");
			connection = providerSocket.accept();
			
			out = new ObjectOutputStream(connection.getOutputStream());
			out.flush();
			in = new ObjectInputStream(connection.getInputStream());
			
			sendMessage("Connection Successfull");
			
			do { 
				try {
					Message = (String)in.readObject();
					System.out.println("Client> " +Message);
					if(Message.equals("bye"))
						sendMessage("bye");
					
				}catch (ClassNotFoundException classnot) {
					System.err.println("Data Received in Unknown Format");
				}
			} while(!Message.equals("bye"));
			
		} catch(IOException ioException) {
			ioException.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
				providerSocket.close();
			}catch (IOException ioException) {
				ioException.printStackTrace();
			}
		}
	}
	
	void sendMessage(String msg) {
		try {
			out.writeObject(msg);
			out.flush();
			System.out.println("Server>" +msg);
		}catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
	
}

public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Provider server = new Provider();
		while(true){
			server.run();
		}
          
	}

}
