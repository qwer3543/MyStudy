package com.mystudy.ex01_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterExam {

	public static void main(String[] args) {
		// 버퍼(buffer) 기능이 구현되어 있는 클래스
		// 버퍼 : 데이터를 저장하는 공간
		// BufferedReader, BufferedWriter
		// File -> FileReader -> BufferedReader
		File inFile = new File("file/test_buf_rw_in.txt");
		FileReader fr = null;
		
		File outFile = new File("file/test_buf_rw_out.txt");
		FileWriter fw = null;
		
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		
		
		
		
		try {
			// 파일로 부터 읽기 위한 객체(인스턴스) 생성
			fr = new FileReader(inFile);
			bufferedReader = new BufferedReader(fr); //버퍼기능 + 파일읽기 기능
			
			// 파일에 쓰기 위한 객체 생성
			fw = new FileWriter(outFile);
			bufferedWriter = new BufferedWriter(fw); //버퍼사용 + 파일쓰기 기능
			
			bufferedWriter.write("안녕하세요. 자바 공부중 입니다. \n"); // \n 줄바꿈 처리
			bufferedWriter.write("Hello Java!!!");
			bufferedWriter.newLine(); // 줄바꿈 처리
			bufferedWriter.write("제미있나요???");
			bufferedWriter.newLine(); // 줄바꿈 처리
			bufferedWriter.write("------------");
			bufferedWriter.newLine(); // 줄바꿈 처리
			
			// 한줄 읽어 오기
			String str = bufferedReader.readLine();
			System.out.println(str);
			
			// 한줄 출력 하기
			bufferedWriter.write(str + "\n"); // 줄바꿈 처리 
			//bufferedWriter.newLine(); // 줄바꿈 처리
			
			// 남은 데이터 모두 읽고 쓰기
			while (true) {
				str = bufferedReader.readLine();
				if (str == null) break;
				bufferedWriter.write(str + "\n");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null) bufferedReader.close();
			} catch (IOException e) {}
			try {
				if (bufferedWriter != null) bufferedWriter.close();
			} catch (IOException e) {}
			
		}
	}

}
