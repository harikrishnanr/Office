package demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

class Provider {

	ServerSocket providerSocket;
	Socket connection = null;
	OutputStream out;
	InputStream in;
	StringBuffer request;
	String Message;
	String Response = "HTTP/1.0 200 OK\r\n";
	int c;

	void run() {
		try {
			
			

			providerSocket = new ServerSocket(2010);

			System.out.println("Waiting for Connection");
			connection = providerSocket.accept();

			out = new BufferedOutputStream(connection.getOutputStream());
			out.flush();
			in = new BufferedInputStream(connection.getInputStream());
			request = new StringBuffer(80);

			while (true) {
				c = in.read();
				if (c == '\r' || c == '\n' || c == -1)
					break;
				request.append((char) c);
			}
			String data = "HEllo INXS";
			byte [] dat = data.getBytes("ASCII");

			System.out.println(request);
			String header = "HTTP/1.0 200 OK\r\n"
			     + "Server: OneFile 1.0\r\n"
			     + "Content-length: " + dat.length + "\r\n"
			     + "Content-type: " + "text/html" + "\r\n\r\n";
			
			byte [] head = header.getBytes("ASCII");
			if (request.toString().indexOf("HTTP/") != -1) {
	            out.write(head);
	          }
						
			

			out.write(dat);
			out.flush();

		} catch (IOException ioException) {
			ioException.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
				providerSocket.close();
			} catch (IOException ioException) {
				ioException.printStackTrace();
			}
		}
	}

	/*void sendMessage(String msg) {
		try {
			out.writeObject(msg);
			out.flush();
			System.out.println("Server>" + msg);
		} catch (IOException ioException) {
			ioException.printStackTrace();
		}
	}*/

}

public class Server {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Provider server = new Provider();
		while (true) {
			server.run();
		}

	}

}
