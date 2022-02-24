package com.mystudy.ex03_isr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_Exam {

	public static void main(String[] args) {
		// InputStream ---> Reader
		// byte 처리 계열 -> 문자(Character) 처리 계열 전환
		// InputStreamReader : InputStream -> Reader 전환
		// OutputStreamWriter : OutputStream -> Writer 전환
		//----------------------------
		
		File file = new File("file/test_isr.txt");
		
		FileInputStream fis = null;
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			fis = new FileInputStream(file);
			
//			int readByte = fis.read();
//			System.out.println((char)readByte);
//			
//			readByte = fis.read();
//			System.out.println((char)readByte); // 1바이트로는 읽을수 없어 한글 깨짐
			//=============================================================
			isr = new InputStreamReader(fis); // 문자단위 처리 -> 한글 읽음
			
			int readIsr = isr.read();
			System.out.println((char)readIsr);
			
			readIsr = isr.read();
			System.out.println((char)readIsr);
			//=============================================================
			// 버퍼기능 사용해서 라인 단위
			br = new BufferedReader(isr);
			
			String str = br.readLine();
			System.out.println(str);
			
			while (true) {
				str = br.readLine();
				if (str == null) break; // 리턴 타입 : null
				System.out.println(str);
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close();
			} catch (IOException e) {}
		}
		

	}

}
