package luohao;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.List;

public class EchoServer {
	private static final int ECHO_SERVER_PORT = 6789;
	
	public static void main(String[] args) {
		try(ServerSocket server = new ServerSocket(ECHO_SERVER_PORT)){
			System.out.println("服务器已经启动...");
			while(true) {
				Socket client = server.accept();
				new Thread(new ClientHandler(client)).start();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static class ClientHandler implements Runnable{
		private Socket client;
		
		public ClientHandler(Socket client) {
			this.client = client;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			try(BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream())
					PrintWriter pw = new PrintWriter(client.getOutputStream()))){
				
			}
		}
	}
}
