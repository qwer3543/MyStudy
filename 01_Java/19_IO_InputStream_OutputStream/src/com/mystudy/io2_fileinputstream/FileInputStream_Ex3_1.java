package com.mystudy.io2_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_Ex3_1 {

	public static void main(String[] args) {
		File file = new File("file/test01.txt");
		
		FileInputStream fis = null;
		
		try {
			//1. 파일을 읽기 위한 객체 생성(File 객체 입력(주입)받음)
			fis = new FileInputStream(file);
			
			//read(byte[] b) 
			byte[] bytes = new byte[10];
			System.out.println("bytes : " + Arrays.toString(bytes));
			
			int byteCnt = fis.read(bytes);
			System.out.println("읽은 갯수 : " + byteCnt);
			System.out.println("읽어온 값 : " + Arrays.toString(bytes));
			for (int i = 0; i < byteCnt; i++) {
				System.out.println("int값: " + bytes[i] + ", char: " + (char)bytes[i]);
			}
			
			byteCnt = fis.read(bytes);
			System.out.println("읽은 갯수 : " + byteCnt);
			System.out.println("읽어온 값 : " + Arrays.toString(bytes));
			for (int i = 0; i < byteCnt; i++) {
				System.out.println("int값: " + bytes[i] + ", char: " + (char)bytes[i]);
			}
			
			byteCnt = fis.read(bytes);
			System.out.println("읽은 갯수 : " + byteCnt);
			System.out.println("읽어온 값 : " + Arrays.toString(bytes));
			for (int i = 0; i < byteCnt; i++) {
				System.out.println("int값: " + bytes[i] + ", char: " + (char)bytes[i]);
			}
			
			//--------------------------------
			byteCnt = fis.read(bytes);
			System.out.println("읽은값이 없으면 리턴값 : " + byteCnt); //-1

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 사용객체 닫기(close)
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
