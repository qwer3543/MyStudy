package com.mystudy.socket01_byte;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClientByte {

	public static void main(String[] args) {
		// 클라이언트 : Socket 이용해서 서버에 접속(서버IP주소, 포트번호)
		Socket socket = null;
		try {
			System.out.println("==== 클라이언트 =====");
			//                  locahost : 현재컴퓨터, 127로 시작 IP주소
			//socket = new Socket("localhost", 10000);
			socket = new Socket("127.0.0.1", 10000);
			System.out.println(">> 서버 연결 성공 ~~~~~");
			
			InputStream is = socket.getInputStream();
			OutputStream os =socket.getOutputStream();
			
			//OutputStream 이용해서 서버쪽으로 쓰기(출력)
//			System.out.println(">> 서버쪽으로 문자 'A' 보내기");
//			os.write('A');
			
			String msg = "안녕하세요~ 반갑습니다.";
			System.out.println("서버로 보낸 메시지 : "+ msg);
			byte[] buf = msg.getBytes();
			os.write(buf);
			
			os.close();
			is.close();
			
			System.out.println(">> 클라이언트 종료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
