package sub03;

import java.net.ServerSocket;
import java.net.Socket;

/*
 * 날짜 : 2022/09/21
 * 이름 : 이민혁
 * 내용 : Chat 
 * 
 */

public class ChatServer {
	public static void main(String[] args) {
		
		System.out.println("[Server]");
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9002);
			System.out.println("연결 대기...");
			
			socket = serverSocket.accept();
			System.out.println("연결 수립...");
			
			Thread t1 = new SenderThread(socket);
			Thread t2 = new ReceiverThread(socket);
			
			t1.start();
			t2.start();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
