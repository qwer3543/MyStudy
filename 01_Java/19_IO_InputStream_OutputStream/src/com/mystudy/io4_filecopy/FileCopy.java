package com.mystudy.io4_filecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// 파일 복사: 원본 파일에서 읽고, 대상파일에 쓰기
		// 복사할 원본 파일 (source file : AS-Is)
		// 쓰기위한 대상 파일 (target file : TO-BE)
		//-----------------------------------------
		
		//File fileOut = new File("file/img1_copy.jpg"); // 복사한 사본
		File fileOut = new File("file/FileCopy_copy.java"); // 복사한 사본
		FileOutputStream fos = null;
		
		//File fileIn = new File("img1.jpg"); // 복사할 원본 파일
		File fileIn = new File("src/com/mystudy/io4_filecopy/FileCopy.java"); // 복사할 원본 파일
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(fileIn);
			fos = new FileOutputStream(fileOut);
			
			int by;
			
			while (true) {
				by = fis.read();
				if (by == -1) break;
				fos.write(by);
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
