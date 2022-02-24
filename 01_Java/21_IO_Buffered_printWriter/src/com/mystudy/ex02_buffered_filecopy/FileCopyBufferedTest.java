package com.mystudy.ex02_buffered_filecopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyBufferedTest {

	public static void main(String[] args) {
		// BufferedInputStream, BufferedOutputStream 적용
		// 파일복사(문자) : temp.txt --> temp_buf_out.txt
		// 파일복사(binary) : img100.jpg --> img100_buf_copy.jpg
		// File -> FileInputStream -> BufferedInputStream
		
		
		
		
		
		// in
		File inFile = new File("img1.jpg"); // 이미지
		//File inFile = new File("temp.txt"); // 텍스트
		FileInputStream fr = null;
		// out
		File outFile = new File("file/img1_.jpg"); // 이미지
		//File outFile = new File("temp_buf_out.txt"); // 텍스트
		FileOutputStream fw = null;
		
		BufferedInputStream bR = null;
		BufferedOutputStream bW = null;
		
		
		try {
			// in
			
			fr = new FileInputStream(inFile);
			bR = new BufferedInputStream(fr);
			// out
			fw = new FileOutputStream(outFile);
			bW = new BufferedOutputStream(fw);
			
			long starTime = System.currentTimeMillis(); // 시작 시간
			
			// 읽기
			int str;
			
			while (true) {
				str = bR.read();
				if (str == -1) break;
				bW.write(str);
			} 
			
			long endTime = System.currentTimeMillis(); // 현제 시간
			System.out.println("복사 시간: " + (endTime - starTime));
			
			// 버퍼기능이 있는 파일 복사 ----------------------
			
			bR = new BufferedInputStream(new FileInputStream(inFile));
			
			bW = new BufferedOutputStream(new FileOutputStream("file/img2_.jpg"));
			
			int str1;
			
			while (true) {
				str1 = bR.read();
				if (str1 == -1) break;
				bW.write(str1);
			}
			
			long endTime1 = System.currentTimeMillis(); // 현제 시간
			System.out.println("복사 시간: " + (endTime - starTime));
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bR != null)
				try {
					bR.close();
				} catch (IOException e) {}
			if (bW != null)
				try {
					bW.close();
				} catch (IOException e) {}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
