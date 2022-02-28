package com.mystudy.socket02_line;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientLine {

	public static void main(String[] args) throws UnknownHostException {
		// 서버접속 후 PrintWriter 사용해서 메시지 1번 보내기
		// OutputStream -> PrintWriter
		//----------------------------------------
		System.out.println(">>>> 클라이언트 시작");
		Socket socket = null;
		
		System.out.println("현재컴퓨터IP : " + InetAddress.getLocalHost());
		System.out.println(">>> 서버 접속 시도~~");
		try {
			//1. 소켓(Socket) 생성 : 접속할 IP주소, 포트(port) 정보로 서버 접속
			socket = new Socket(InetAddress.getLocalHost(), 10000);
			System.out.println(">>> 서버 접속 성공!!!");
			
			//2. 소켓으로부터 입,출력 객체 생성 - InputStream, OutputStream
			InputStream is = socket.getInputStream();
			
			OutputStream os = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(os);
			
			//3. 전송(out)할 데이터가 있으면 쓰기(write)
			String msg = "안녕하세요. 만나서 반갑습니다. 소켓통신 공부중~~~";
			pw.println(msg);
			
			pw.flush();
			
			//4. 읽을 데이터가 있으면 읽기
			// 구현안함
			
			//5. 자원반납(close)
			pw.close();
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(">>> 클라이언트 작업종료");
	}

}





