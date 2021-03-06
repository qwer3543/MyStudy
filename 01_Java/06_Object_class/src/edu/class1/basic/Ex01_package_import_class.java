package edu.class1.basic;
/* package 선언문 설정한다 (맨 첫줄에 위치하며 한번만 작성한다)
   package는 class들을 담는 파일이라고 볼 수 있다(class파일의 위치를 나타냄)
     일반적으로 회사의 도메인명을 반대로 사용
     작성예) 회사가 네이버 라면 naver.com이 -> com.naver으로 시작함
         com.naver.kim여기서 kim은 파일 이름이 된다
*/  

import java.util.Scanner;
// import java.util.*; -> java.util 안에 모든 것을 사용한다는 뜻
// import 선언문: Scanner라는 class를 어디서 가져와 쓸 것인지 선언한다
// (java.lang 패키지 이외의 패키지에 있는 타입 사용시 사용)



// class 선언문 설정한다 (필수)

public class Ex01_package_import_class {

	public static void main(String[] args) {
		// 클래스로 시작된 모든 명령어들은 참조형 
		
	Scanner scan = new Scanner(System.in);
	// 위에서 	Scanner라는 class을 선언 하여서 
	// java.util.Scanner scan = new java.util.Scanner(System.in);
	// java.util.Scanner -> Scanner로 줄여 쓸수 있다

	System.out.print(">> 인사말 : ");	
	
	
	String hello = scan.nextLine();
	// scan.nextLine(); -> 문자를 입력받아 
	// String 타입의 hello변수 안에 저장한다
	
	System.out.println(hello);	
	// 저장한(우리가 입력한) 	hello 변수를 출력한다
		
	
		
		
		
		

	}

}
