package com.mystudy.socket01_byte;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class TCPServerByte {

	public static void main(String[] args) {
		// 서버측 : ServerSocket 객체가 클라이언트 접속을 기다린다 
		ServerSocket server = null;
		
		try {
			// 서버에서 10000번 포트를 열고
			server = new ServerSocket(10000);
			System.out.println("현재컴퓨터IP : " + InetAddress.getLocalHost());
			System.out.println("[서버] 시작 후 클라이언트 접속 대기중~~");
			
			// 서버에서 해당 포트로 접속한 클라이언트와 통신할 수 있는 소켓 객체 생성
			Socket socket = server.accept();
			System.out.println("[서버] 1개 클라이언트 접속");
			
			// 소켓에서 Input, Output 스트림 객체 받아서 사용
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			// 데이터 읽기 : 클라이언트에서 보내온 데이터
//			int readValue = is.read();
//			System.out.println("[서버] 클라이언트로부터 받은 메시지 : " 
//					+ (char)readValue);
			
			byte[] buf = new byte[100];
			is.read(buf);
			//System.out.println("[서버] 받은메시지 : " + Arrays.toString(buf));
			System.out.println("[서버] 받은메시지 : " + new String(buf));
			
			System.out.println(">> 서버종료");
			
			os.close();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
