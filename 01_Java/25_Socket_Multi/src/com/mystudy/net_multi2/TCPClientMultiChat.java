package com.mystudy.net_multi2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

// 내부클래스를 사용한 읽기, 쓰기 쓰레드 생성해서 사용
// 쓰기쓰레드 : 메시지 작성 및 전송을 독립적으로 처리(언제든지 메시지 보내기 - 쓰기전용)
// 읽기쓰레드 : 서버쪽으로 부터 받은 메시지를 읽어서 화면 표시(언제든지 읽기 - 읽기전용)
public class TCPClientMultiChat {

	public static void main(String[] args) {
		//송신, 수신 쓰레드 생성 및 실행
		System.out.println("==== main() 시작 =======");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("사용할 이름(별칭) 입력 > ");
		String name = scan.nextLine();
		
		Socket socket = null;
		
		try {
			socket = new Socket("localhost", 10000);
			
			//메시지 보내기 쓰레드 생성
			ClientSender clientSender = new ClientSender(socket, name);
			clientSender.start();
			
			//메시지 받기 쓰레드 생성
			ClientReceiver clientReceiver = new ClientReceiver(socket);
			clientReceiver.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("==== main() 끝 ========");

	}
	
	//메시지 보내기 쓰레드
	static class ClientSender extends Thread {
		Socket socket;
		String name;
		DataOutputStream out;

		public ClientSender(Socket socket, String name) {
			this.socket = socket;
			this.name = name;
			
			try {
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				//e.printStackTrace();
				System.out.println("[예외발생] ClientSender 생성자 "
						+ "out 객체 생성 실패!!!");
			}
		}
		
		@Override
		public void run() {
			// 메시지 작성해서 서버로 전송
			if (out == null) {
				System.out.println("[예외발생] 출력 객체가 없습니다");
				return;
			}
			
			Scanner scan = new Scanner(System.in);
			
			try {
				out.writeUTF(name); //첫번째 메시지 전송 : 이름(별칭)
				
				while (true) {
					System.out.print("메시지작성> ");
					String msg = scan.nextLine();
					
					out.writeUTF("[" + name + "] " + msg);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//메시지 받기 쓰레드(읽기전용 - Input)
	static class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream in;

		public ClientReceiver(Socket socket) {
			this.socket = socket;
			
			try {
				in = new DataInputStream(socket.getInputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			//메시지를 받아서 화면출력(반복)
			while (true) {
				try {
					System.out.println(in.readUTF());
				} catch (IOException e) {
					//e.printStackTrace();
					System.out.println("[예외발생] " + e.getMessage());
					break; //더이상 읽을 수 없으면 반복 중단
				}
			}
			
//			try {
//				while (true) {
//					System.out.println(in.readUTF());
//				}
//			} catch (IOException e) {
//				//e.printStackTrace();
//			}
		}
		
	}

}//end class








