package com.mystudy.socket04_echo_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEchoWhile {

	public static void main(String[] args) {
		// 읽고, 쓰기 반복처리
		ServerSocket server = null;
		
		//메시지 읽고, 쓰기 위한 객체 저장할 변수 선언
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			server = new ServerSocket(10000);
			System.out.println(">>> 서버 시작~~~");
			System.out.println(">>접속 대기중~~~");
			System.out.println(">>IP주소:포트번호 - "
					+ InetAddress.getLocalHost().getHostAddress()
					+ ":" + server.getLocalPort());
			
			Socket socket = server.accept();
			System.out.println(">> 클라이언트 접속됨");
			System.out.println(":: 접속정보 : " + socket.getInetAddress());
			
			//읽고, 쓰기위한 객체 생성
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			pw = new PrintWriter(socket.getOutputStream());
			
			while (true) {
				//읽고
				String msg = br.readLine();
				//클라이언트에서 작업종료(exit)하면 종료 처리
				if (msg == null || "exit".equalsIgnoreCase(msg)) {
					System.out.println(":::: 서버를 중단합니다");
					break;
				}
				System.out.println("받은메시지> " + msg);
				
				//쓰기
				pw.println(msg);
				System.out.println("보낸메시지> " + msg);
				
				pw.flush(); //버퍼에 있는 데이터 출력(전송)
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {}
			}
			if (pw != null) pw.close();
			try {
				if (server != null) server.close();
			} catch (IOException e) {}
		}
		
		System.out.println("::::: 서버 종료 ----------------");
	}

}
