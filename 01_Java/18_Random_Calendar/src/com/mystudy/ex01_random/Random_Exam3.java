package com.mystudy.ex01_random;

import java.util.Calendar;
import java.util.Random;

public class Random_Exam3 {

	public static void main(String[] args) {
		// 실습: 오늘 상신의 행운지수 알아보기(0~100)
		// 실행결과 출력
		// 예) 2022년 2월 22일 당신의 행운지수는 ?? 입니다
		//-----------------------------------------
		
		Random ran = new Random();
		
		Calendar car = Calendar.getInstance();
		
		int year = car.get(Calendar.YEAR);
		int month = car.get(Calendar.MONTH);
		int day = car.get(Calendar.DATE) + 1; // 0~11 로 시작히기 때문에 +1을 붙여준다
		
		System.out.println("=== 방법 1 ===");
		
		int kkk = ran.nextInt(101); // 랜덤 번호 0~100 생성
		
		String yyyymmdd = year + "년 " + month + "월 " + day + "일 ";
		
		System.out.println(yyyymmdd + "당신의 행운지수는 " + kkk + "입니다");
		
		System.out.println("=== 방법 2 ===");
		int kkk1 = (int) (Math.random() * 101);
		
		System.out.println(yyyymmdd + "당신의 행운지수는 " + kkk1 + "입니다");
		
	}

}
