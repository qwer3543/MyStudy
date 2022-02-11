package com.mystudy.stringbuilder;

import java.util.StringTokenizer;

public class Ex03_StringTokenizer {

	public static void main(String[] args) {
		
		// String 클래스의 split() vs StringTokenizer 클래스
		
		String str = "사과,배,복숭아,,포도";
		
		System.out.println(str.toString());
		
		// ,을 기준으로 데이터을 하나씩 만들어 배열안에 넣준다
		// (정보가 없는 빈칸도 포함)
		String[] strSplot = str.split(","); 
		
		// 5개의 데이터가 들어옴
		System.out.println(strSplot.length);
		
		for (int i = 0; i < strSplot.length; i++) {
			System.out.println(strSplot[i]);
		}
		
		System.out.println("--- 개선된 for문 ---");
		
		// forEach문 : 변수명 안에 <- 집합객체를 순서대로 보낸다
		// for (데이터타입 변수명 : 집합객체){}
		
		for (String str2 : strSplot) {
			System.out.println(str2);
		}
		
		System.out.println("==============");
		
		// 간단한 포문
		
		int idx = 0;
		
		for(String str2 : strSplot) {
			System.out.println(idx + " : " + str2);
			idx++;
		}
		
		System.out.println("==============");
		
		System.out.println(str);
		
		// ,을 기준으로 데이터을 하나씩 만들어 변수에 넣준다 (빈공간 포함 안함)
		StringTokenizer strTokn = new StringTokenizer(str, ",");
		
		// 데이터의 갯수을 나타낸다
		System.out.println(strTokn.countTokens());
		
		// hasMoreTokens : 데이터값의 유무를 true, false로 알려줌
		while (strTokn.hasMoreTokens()) {
			// strTokn 변수의 데이터 값을 token 변수로 보낸다
			String token = strTokn.nextToken();
			System.out.println(token);
		}
		System.out.println(strTokn.countTokens());
		
		System.out.println("=============");
		
		
		// for문으로 토큰 출력 
		System.out.println(str);
		
		System.out.println();
		
		StringTokenizer kkk = new StringTokenizer(str, ",");
		
		int j = kkk.countTokens();
		
		for (int i = 0; i < j; i++) {
			String ttt = kkk.nextToken();
			System.out.println(ttt);
		}
		
		System.out.println("=============");
		
		
		
		
		
		
		
 
	}

}
