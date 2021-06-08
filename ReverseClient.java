import java.io.*;
import java.net.*;

class ReverseClient 
{
	public static void main(String argv[]) throws Exception
	{
        	String sentence;
        	String modifiedSentence;
        	BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        	Socket clientSocket;
        	clientSocket = new Socket("192.168.159.1", 9999);
        	DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
        	BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        	sentence = inFromUser.readLine();
        	outToServer.writeBytes(sentence + '\n');
        	modifiedSentence = inFromServer.readLine();
        	System.out.println("FROM SERVER: " + modifiedSentence);
        	clientSocket.close();
	}
}