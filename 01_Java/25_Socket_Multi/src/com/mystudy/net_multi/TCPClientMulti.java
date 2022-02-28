package com.mystudy.net_multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

//서버쪽으로 메시지 전송만~~~
public class TCPClientMulti {

	public static void main(String[] args) {
		System.out.println(">>> 클라이언트 시작~~");
		Socket socket = null;
		
		//메시지 쓰고, 읽기 위한 객체 저장할 변수 선언
		PrintWriter pw = null;
		BufferedReader br = null;
		
		try {
			//socket = new Socket("localhost", 10000);
			socket = new Socket("192.168.11.31", 10000);//강사PC
			System.out.println(">>> 서버 접속 완료");
			
			//서버쪽으로 쓰고, 읽기 위한 객체 생성
			System.out.println(":: 메시지 쓰기(client -> server)");
			pw = new PrintWriter(socket.getOutputStream());
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//Scanner 사용해서 보낼 메시지 화면에서 입력 처리
			Scanner scan = new Scanner(System.in);
			
			while (true) {
				System.out.print("메시지 입력> ");
				String msg = scan.nextLine();
				pw.println(msg);
				pw.flush(); //버퍼에 있는 데이터를 강제로 출력(사용)
				
				if ("exit".equalsIgnoreCase(msg)) {
					System.out.println("::: 대화를 종료 합니다");
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) pw.close();
			try {
				if (br != null) br.close();
			} catch (IOException e) { }
			
			try {
				if (socket != null) socket.close();
			} catch (IOException e) {}
		}
		System.out.println(">>> 클라이언트 종료");
		
	}

}