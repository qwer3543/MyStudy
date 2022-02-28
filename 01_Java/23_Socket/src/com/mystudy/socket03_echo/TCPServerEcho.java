package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEcho {

	public static void main(String[] args) {
		// 서버측 : 읽고, 쓰기
		// 클라이언트가 보내온 메시지를 1번 받고, - BufferedReader 
		// 받은 메시지 클라이언트에게 다시 보내기 - PrintWriter
		// BufferedReader <- InputStreamReader <- InputStream 
		// PrintWriter <- OutputStream
		//-------------------------------------------
		
		ServerSocket server = null;
		
		//메시지 읽고, 쓰기 위한 객체 저장할 변수 선언
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			server = new ServerSocket(10000);
			System.out.println(">>> 서버 시작, 대기중~~~");
			
			Socket socket = server.accept();
			
			//데이터를 받고, 받은 데이터 되돌려주기(읽고, 쓰기)
//			InputStream is = socket.getInputStream();
//			InputStreamReader isr = new InputStreamReader(is);
//			br = new BufferedReader(isr);
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			System.out.println(":: 메시지 읽기");
			String msg = br.readLine();
			System.out.println("받은메시지> " + msg);
			
			//-----------------------------
			//받은 메시지를 클라이언트 쪽으로 다시 보내기
			//OutputStream os = socket.getOutputStream();
			//pw = new PrintWriter(os);
			pw = new PrintWriter(socket.getOutputStream());
			
			pw.println(msg);
			System.out.println("보낸메시지> " + msg);
			
			pw.flush(); //버퍼에 있는 데이터 출력(전송)
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) pw.close();
			try {
				if (br != null) br.close();
			} catch (IOException e) { }
		}
		System.out.println(">>> 서버종료");
	}

}





