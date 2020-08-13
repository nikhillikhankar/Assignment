//12. Java Program to Create a Client That Receive Message From the Server
//This is Server side Program.

package BankingSystem;

import java.io.*;
import java.net.*;
public class SocketServer {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		
		ServerSocket listener = new ServerSocket(9096);				//Create a server on port number.
		System.out.println("Server is running");
		try
		{
			while (true)									//Loop to handle client after client indefinitely.
			{
// This statement blocks server and let server keep waiting for a new client. When client connects, its socket is stored at "socket".	
				Socket socket = listener.accept();			
				try
				{
// Get outputstream of client. This allows server to send something for client				
					PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
					out.println("Hi There");
				}
			
				finally
				{
				socket.close();
				}
			}
		}
		
		finally
		{
		listener.close();
		}

	}

}
