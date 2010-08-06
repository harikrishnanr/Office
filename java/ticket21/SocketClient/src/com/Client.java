package com;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;


class Requester {
	
	Socket requestSocket;
	ObjectOutputStream out;
	ObjectInputStream in;
	String Message;
	
	void run() {
		try {
			
			requestSocket = new Socket("localhost",2006);
			
			System.out.println("Connected to localhost 2004");
			
			
			out = new ObjectOutputStream(requestSocket.getOutputStream());
			out.flush();
			in = new ObjectInputStream(requestSocket.getInputStream());
			
			do { 
				try {
					Message = (String)in.readObject();
					System.out.println("Server> " +Message);
					
					sendMessage("Hi Server");
					Message = "bye";
					sendMessage(Message);
					
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
				requestSocket.close();
			}catch (IOException ioException) {
				ioException.printStackTrace();
			}
		}
	}
	
	void sendMessage(String msg) {
		try {
			out.writeObject(msg);
			out.flush();
			System.out.println("Client>" +msg);
		}catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}
	
}




public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Requester client = new Requester();
		client.run();
	}

}
