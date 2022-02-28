package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientEcho {

	public static void main(String[] args) {
		// 클라이언트 : 쓰고, 읽기
		// 서버접속 후 사용해서 메시지 1번 보내고, - PrintWriter
		// 서버에서 보내온 메시지 받아서 화면출력 - BufferedReader
		// PrintWriter <- OutputStream
		// BufferedReader <- InputStreamReader <- InputStream 
		//----------------------------------------
		System.out.println(">>> 클라이언트 시작~~");
		Socket socket = null;
		
		//메시지 쓰고, 읽기 위한 객체 저장할 변수 선언
		PrintWriter pw = null;
		BufferedReader br = null;
		
		try {
			socket = new Socket("localhost", 10000);
			System.out.println(">>> 서버 접속 완료");
			
			//서버쪽으로 쓰기
			System.out.println(":: 메시지 쓰기(client -> server)");
			pw = new PrintWriter(socket.getOutputStream());
			
			//String msg = "안녕하세요~ 반갑습니다";
			
			//Scanner 사용해서 보낼 메시지 화면에서 입력 처리
			Scanner scan = new Scanner(System.in);
			System.out.print("메시지 입력> ");
			String msg = scan.nextLine();
			
			pw.println(msg);
			pw.flush(); //버퍼에 있는 데이터를 강제로 출력(사용)
			
			System.out.println("보낸메시지> " + msg);
			
			//------------
			//서버에서 보내온 메시지 읽기
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			msg = br.readLine();
			System.out.println("받은메시지> " + msg);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) pw.close();
			try {
				if (br != null) br.close();
			} catch (IOException e) { }
		}
		System.out.println(">>> 클라이언트 종료");
		
	}

}
