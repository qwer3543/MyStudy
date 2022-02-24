package com.mystudy.ex04_printwriter;

import java.util.Calendar;

public class Printf_Exam {

	public static void main(String[] args) {
		// printf() 메소드
		int a = 20;
		long b = 3_000_000_000L;
		float c = 34.95f;
		double d = 234.234;
		char e = 'A';
		String f = "Hello~~";
		boolean g = false;
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.printf("%tF", today);
		System.out.println();
		
		System.out.println(">> " + a +" "+ b +" "+ c +" "+
				d +" "+ e +" "+ f +" "+ g);
		System.out.println();
		
		/* [ ] : 생략가능
		%[인덱스$][-][크기]형식문자 : %, 형식문자 필수
		- 기본은 우측정렬
		- 좌측정렬 사용 마이너스 부호 사용    예) %-10d
		*/
		System.out.println("println : \\ %% %n \n");
		System.out.printf("printf : \\ %% %n \n"); //printf 줄바꿈 %n, \n
		System.out.println();
		System.out.println("-------");
		
		System.out.printf("%d %d %c %s%n", 100, 100, 'A', "Hello~");
		
		System.out.println("---- 인덱스(파라미터위치값) 사용 ----");
		//[인덱스$] 파라미터 위치값 $ 부호와 함께 사용
		//[주의] 인덱스 적용하면 데이터 매칭에서 제외됨
		System.out.printf("%1$d %1$d %c %s%n", 67, 'A', "Hello~");
		System.out.printf("%1$d %1$d %2$c %3$s %n", 66, 'A', "Hello~");
		
		System.out.println("---- 실수형 데이터 표시 -----");
		System.out.printf("%f %1$a %1$e %1$g %n", 65.812345678);
		System.out.printf("%1$10.3f %n", 65.85679123456); //전체자리수 10, 소수점이하 3
		System.out.printf("%1$30.10f %n", 65.812345678);
		System.out.printf("%1$-30.10f %n", 65.812345678); //좌측정렬 마이너스(-) 부호사용 
		
		System.out.println("--- 날짜관련 ---");
		System.out.printf("%1$ty, %1$tY/%1$tm/%1$td %1$tF %n", today);
		System.out.printf("%1$tB %1$th %n", today);
		System.out.printf("%1$tI %1$tM %1$tS %1$ta %n", today);
		
		System.out.println("--- 폭(width) 지정 ---");
		System.out.printf("%1$20f %n", 5678.1234567890);//20자리 우측정렬
		System.out.printf("%1$-20f %n", 5678.1234567890);//좌측정렬
		System.out.printf("%1$-20.10f %n", 5678.1234567890);//좌측정렬, 소수점 이하 10
		System.out.println("==========================");
		
		String name = "홍길동";
		int kor = 100, eng = 90, math = 81;
		System.out.printf("%s은 국어 %d, 영어 %d 입니다.", name, kor, eng);
		
	}

}







