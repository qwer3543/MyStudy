package com.mystudy.net_multi2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Set;

// ==== 멀티채팅 서버측 기능 ====
//다중 접속 가능하게 처리
//접속자가 보낸 메시지를 읽을 수 있는 읽기 전용 쓰레드 생성
//접속자 명단 가지고 있기
//받은 메시지를 접속자 모두에게 전송하는 기능
public class TCPServerMultiChat {
	HashMap<String, DataOutputStream> clients; //접속자 명단

	public static void main(String[] args) {
		new TCPServerMultiChat().serverStart();
	}
	
	public TCPServerMultiChat() {
		clients = new HashMap<String, DataOutputStream>();
	}
	
	//서버소켓 생성하고 대기하다가
	//클라이언트가 접속하면 메시지를 읽기위한 읽기전용 쓰레드 생성
	private void serverStart() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(10000);
			System.out.println(">> 서버가 시작 되었습니다...");
			System.out.println("IP주소:포트 - "
					+ InetAddress.getLocalHost().getHostAddress()
					+ ":" + serverSocket.getLocalPort());
			
			while (true) {
				socket = serverSocket.accept();
				System.out.println("["+ socket.getInetAddress()
						+ ":" + socket.getPort() + "] 접속");
				
				//접속된 클라이언트에 대한 처리 : 쓰레드 생성(읽기 쓰레드)
				ServerReceiver thread = new ServerReceiver(socket);
				thread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//ServerReceiver : 전달받은 Socket 이용 메시지 받고, 접속자 전체에게 전달
	//생성될때 : 필드 clients 에 추가
	//종료될때 : 필드 clients 에서 삭제 처리
	private class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		String name;

		public ServerReceiver(Socket socket) {
			this.socket = socket;
			
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			//생성될때 : 필드 clients 에 추가
			//종료될때 : 필드 clients 에서 삭제 처리
			//메시지 받고, 받은 메시지 전체에게 전달
			try {
				//클라이언트로 부터 받은 첫 메지시 : 별명(아이디)
				name = in.readUTF();
				System.out.println("접속자>> " + name);
				
				//생성될때 : 필드 clients 에 추가
				clients.put(name, out);
				System.out.println("접속자 명단 : " + clients);
				
				//메시지 읽고, 전체에게 전달(반복)
				while (true) {
					String msg = in.readUTF();
					System.out.println(name + "> " + msg); //서버화면 출력
					
					//접속자 전체에게 보내기
					sendToAll(msg);
				}
			} catch (IOException e) {
				//e.printStackTrace();
			} finally {
				//클라이언트 접속 종료시 처리
				//종료될때 : 필드 clients 에서 삭제 처리
				clients.remove(name);
				System.out.println("-접속자명단 : " + clients);
				String outMsg = "<"+ name +">님이 나갔습니다.";
				sendToAll(outMsg);
				System.out.println(outMsg);
			}
		}

		private void sendToAll(String msg) {
			// 접속된 전체 인원에게 메시지 전달
			Set<String> members = clients.keySet();
			for (String member : members) {
				DataOutputStream out = clients.get(member);
				try {
					out.writeUTF(msg);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
