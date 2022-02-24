package com.mystudy.reader_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Exam2 {

	public static void main(String[] args) {
		
		File asd = new File("file/test_char.txt");
		FileReader kkk = null;
		
		try {
			
			kkk = new FileReader(asd);
			
			int pk;
			
			while (true) {
				pk = kkk.read();
				if (pk == -1) break;
				System.out.print((char) pk);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace(); // 파일 없음 오류
		} catch (IOException e) {
			e.printStackTrace(); // 파일 읽지못함 오류
		} finally {
			if (kkk == null) {
				try {
					kkk.close();
				} catch (IOException e) {}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
