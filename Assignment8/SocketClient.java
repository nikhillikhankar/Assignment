// 12. Java Program to Create a Client That Receive Message From the Server
//This is Client side Program.
package BankingSystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import javax.swing.JOptionPane;

public class SocketClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	// Ask client for server and port he wants to connect to.	
		String serverAddress = JOptionPane.showInputDialog("Enter Server Name");
		String serverPort = JOptionPane.showInputDialog("Enter Port Number");

		int port = Integer.parseInt(serverPort);
	
		Socket s = new Socket(serverAddress, port);			//Define socket that connects to server
		
	// Retrieve input stream of server. This allows client to receive from server. 	
		BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
	
		String answer = input.readLine();				//Receive something from server.
	
		JOptionPane.showMessageDialog(null, answer);
		System.exit(0);
		

	}

}
