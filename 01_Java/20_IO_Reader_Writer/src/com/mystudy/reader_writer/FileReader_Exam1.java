package com.mystudy.reader_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Exam1 {

	public static void main(String[] args) {
		// 문자(Character) 단위 입력 처리
		// FileReader : 파일로 부터 문자단위 데이터 읽기
		// 문자단위 : 1, A, $, - 1byte 문자
		//    가, 대, 한 - 2 byte 문자(한글, 아랍어, 태국어, 중국어, 일본어,...)
		//-----------------------------
		
		File file = new File("file/test_char.txt");
		
		FileReader fr = null;
		
		try {
			
			fr = new FileReader(file);
			
			int readChar;
			
			while (true) {
				readChar = fr.read();
				if (readChar == -1) break;
				System.out.print((char) readChar);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}







