package com.mystudy.io2_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Ex1 {

	public static void main(String[] args) {
		File file = new File("temp.txt");

		//파일로 부터 읽기 위한 작업 진행
		FileInputStream fis = null;
		try {
			// 전달받은 파이(file)을 이용해서 파일에 있는 데이터 읽어서 처리
			//1. 사용할 객체 생성
			fis = new FileInputStream(file);
			
			//2. 객체 사용 작업 처리
			int readValue = fis.read();
			System.out.println("read() int값 : " + readValue);
			System.out.println("(char)read() : " + (char)readValue);
			
			System.out.println("--- 전체 데이터 읽어오기 ----");
			while (true) {
				//EOF(End Of File)를 만나면(더이상 읽을 것이 없으면) -1 리턴
				readValue = fis.read();
				if (readValue == -1) break; //파일의 끝이면
				System.out.println("read() int값 : " + readValue);
				System.out.println(">> char : " + (char)readValue);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 객체 사용 후 닫기(close)
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
