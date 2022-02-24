package com.mystudy.io2_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_Ex3_2 {

	public static void main(String[] args) {
		//(실습) 3_1 파일을 반복문으로 변경
		File file = new File("file/test01.txt");
		
		FileInputStream fis = null;
		
		try {
			//1. 사용할 객체(인스턴스) 생성
			fis = new FileInputStream(file);
			
			//2. 사용해서 작업 처리
			byte[] bytes = new byte[10];
			System.out.println("bytes : " + Arrays.toString(bytes));
			
			int byteCnt;
			
			while (true) {
				byteCnt = fis.read(bytes);
				if (byteCnt == -1) break;
				
				System.out.println("읽은 갯수 : " + byteCnt);
				System.out.println("읽어온 값 : " + Arrays.toString(bytes));
				for (int i = 0; i < byteCnt; i++) {
					System.out.println("int값: " + bytes[i] + ", char: " + (char)bytes[i]);
				}
				System.out.println("----------------");
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 사용객체 닫기(close)
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {}
			}
		}

	}

}
