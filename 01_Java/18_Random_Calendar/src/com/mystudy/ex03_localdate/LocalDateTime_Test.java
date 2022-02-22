package com.mystudy.ex03_localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class LocalDateTime_Test {

	public static void main(String[] args) {
		// Calendar : 값이 변경됨(Muttable)
		Calendar cal = Calendar.getInstance();
		System.out.println("cal : " + cal);
		System.out.println("cal date : " + cal.get(Calendar.DATE));
		cal.add(Calendar.DATE, 3);
		System.out.println("cal 3일 후 : " + cal);
		System.out.println("cal 3일 후 : " + cal.get(Calendar.DATE));

		System.out.println("=============================");
		//LocalDate, LocalTime, LocalDateTime : 데이터 불변(immutable)
		System.out.println("=== LocalDate ===");
		LocalDate nowDate = LocalDate.now();
		System.out.println("LocalDate.now() : " + nowDate.toString()); //2022-02-22
		System.out.println("년 : " + nowDate.getYear());
		System.out.println("월 : " + nowDate.getMonthValue()); //1~12
		System.out.println("일 : " + nowDate.getDayOfMonth());
		
		LocalDate newLocalDate = nowDate.plusYears(2).plusMonths(2).plusDays(2);
		System.out.println("nowDate : " + nowDate.toString());
		System.out.println("newLocalDate : " + newLocalDate.toString());
		
		System.out.println("=== LocalTime ===");
		LocalTime nowTime = LocalTime.now();
		System.out.println("LocalTime.now() : " + nowTime.toString());//12:13:54.494
		System.out.println(nowTime.getHour());
		System.out.println(nowTime.getMinute());
		System.out.println(nowTime.getSecond());
		System.out.println(nowTime.getNano());
		
		System.out.println("==== LocalDateTime ====");
		LocalDateTime nowDT = LocalDateTime.now();
		System.out.println("LocalDateTime.now(): " + nowDT);
		System.out.println("년 : " + nowDT.getYear());
		System.out.println("월 : " + nowDT.getMonthValue());
		System.out.println("일 : " + nowDT.getDayOfMonth());
		System.out.println("시 : " + nowDT.getHour());
		System.out.println("분 : " + nowDT.getMinute());
		System.out.println("초 : " + nowDT.getSecond());
		
		
	}

}
