package com.mystudy.scanner1;

import java.util.Scanner;

public class Scanner_Exam1 {

	public static void main(String[] args) {
		// Scanner : 콘솔(화면)에서 데이터 읽어오기
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자열입력1 : ");
		String str1 = scan.nextLine();
		System.out.println(">>> " + str1);
		
		System.out.println("----");
		System.out.print("문자열입력2 : ");
		String str2 = scan.nextLine();
		System.out.println(">>> " + str2);
		
		System.out.println("===============");
		System.out.println("정수값을 2개를 입력하면 더한 결과 출력");
		//int num1 = 100;
		//int num2 = 50;
		int sum = 0;
		
		System.out.print("숫자입력1 : ");
		int num1 = scan.nextInt();
		scan.nextLine(); //숫자입력후 엔터키(줄바꿈) 제어문자 까지 읽기(그래야 밑에 형변환 가능함)
		
		System.out.print("숫자입력2 : ");
		int num2 = Integer.parseInt(scan.nextLine()); // 문자열을 int 타입으로 형변환 시킴(parseInt())
		
		sum = num1 + num2;
		System.out.println("합계 : " + sum);
		
		
		
		
	}

}
