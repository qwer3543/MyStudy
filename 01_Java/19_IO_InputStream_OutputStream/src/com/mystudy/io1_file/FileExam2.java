package com.mystudy.io1_file;

import java.io.File;
import java.io.IOException;

public class FileExam2 {

	public static void main(String[] args) throws IOException {
		// 파일명 : temp.txt - 파일명.확장자(명)
		File file1 = new File("temp.txt");
		
		// File 객체생성은 파일의 존재여부와 관계없이 생성가능
		System.out.println(file1);
		
		// 절대 주소 방식: Root 디렉토리로 부터 전체 경로를 표시
		// 항상 가장 위(시작위치부터) 부터 찾으려고하는 파일 위치까지 표시함
		File file2 = new File("c:\\trmp\\aaa\\a1\\temp.txt"); 
		System.out.println(file2);
		
		// 상대경로 방식(. 현재위치, .. 상위디렉토리(폴더))
		// 현재 위치에 따라 경로가 다르게 변함
		File file3 = new File("file/temp.txt"); // ./file/temp.txt
		
		System.out.println("=== getAbsolutePath() 절대 경로 ===");
		
		System.out.println(file1.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file3.getAbsolutePath());
		
		System.out.println("=== getCanonicalpath() ===");
		
		System.out.println(file1.getCanonicalPath());
		System.out.println(file2.getCanonicalPath());
		System.out.println(file3.getCanonicalPath());
		
		System.out.println("=== exists() 파일이 존재하는가? ===");
		
		System.out.println(file1.exists());
		System.out.println(file2.exists());
		System.out.println(file3.exists());
		
		System.out.println("=== File 속성정보 ===");
		
		System.out.println(file1.length());
		System.out.println(file1.canRead());
		System.out.println(file1.canWrite());
		System.out.println(file1.canExecute());
		
		System.out.println("=== 파일 경로, 파일명 확인가능 ===");
		
		System.out.println(file1.getPath());
		System.out.println(file2.getPath());
		System.out.println(file3.getPath());
		
		System.out.println("=== 파일 이름만 확인가능 ===");
		
		System.out.println(file1.getName());
		System.out.println(file2.getName());
		System.out.println(file3.getName());
		
		System.out.println("=== 경로가Directory인지 File인지 확인해 볼수 있다 ===");
		System.out.println(file1.isDirectory());
		System.out.println(file1.isFile());
		
		System.out.println("=====================");
		
		File file4 = new File("file/temp4.txt");
		
		System.out.println(file4.delete()); // 저장된 경로의 파일을 삭제함 (false, true)
		
		file4.createNewFile(); // 파일 새로 만들기(경로까진 만들어 주지 않는다) / 없는 디렉토리는 못만듬 
		
		

	}

}
