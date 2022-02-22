package com.mystudy.scanner1;

import java.util.Scanner;

public class Scanner_Exam2 {

	public static void main(String[] args) {
		
		// 성명, 국어, 영어, 수학 입력 받고
		// 총점, 평균 계산 후 결과 출력
		/*
		  이름: 홍길동
		  국어: 100
		  영어: 90
		  수학: 81
		  ------
		  총점: 271
		  평균: 90.33
		 */
		
		//===================================================
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		System.out.print("국어: ");
		int kor = scan.nextInt();
		
		System.out.print("영어: ");
		int eng = scan.nextInt();
		
		System.out.print("수학: ");
		int math = scan.nextInt();
		
		System.out.println("--- 성적 처리 결과 ---");
		
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		
		System.out.println("----------");
		
		int tot = kor + eng + math;
		System.out.println("총점: " + tot);
		
		double avg = tot * 100 / 3 / 100.0;
		System.out.println("평균: " + avg);
		//=========================================================
		
		
		
		
		
		
		
		
		

	}

}
