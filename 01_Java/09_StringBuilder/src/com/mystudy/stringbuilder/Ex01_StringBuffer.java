package com.mystudy.stringbuilder;

public class Ex01_StringBuffer {

	public static void main(String[] args) {
		
		// StringBuffer 클래스
		
		StringBuffer sb = new StringBuffer("Hello Java");
		
		System.out.println(sb);
		
		System.out.println(sb.toString());
		
		System.out.println(sb.capacity()); // 저장 공간의 크기 확인
		
		System.out.println(sb.length()); // 문자열의 길이
		
		String str = new String("Hello Java");
		
		str = str + " 반갑습니다";
		
		System.out.println(str);
		
		System.out.println(str.replace("a", "m")); // 문자을 바꾼다(기존 값 불변)
		
		System.out.println(str);
		
		System.out.println("=== StringBuffer ===");
		
		System.out.println(sb.toString());
		
		sb.append(" 반갑습니다").append("!!!"); // 문자열 붙이기
		
		System.out.println(sb.toString());
		
		sb.reverse(); // 문자열 뒤집어 주기																																																																					
		
		System.out.println(sb.toString());
		
		sb.reverse(); 
		
		System.out.println(sb.toString());
		
		System.out.println(sb.delete(0, 6)); // 문자열 자르기
		
		System.out.println(sb.insert(0, "Hello ")); // 문자열 입력하기
		
		System.out.println(sb.replace(0, 5, "Hi,")); // 범위 설정 후 문자열 입력하기
		
		
		StringBuffer sb2 = new StringBuffer(1000);
		
		System.out.println(sb2.capacity()); 
		
		System.out.println(sb2.length()); 
		
		sb2.append("안녕하세요 ").append("반갑습니다!!");
		
		System.out.println(sb2.toString());
		
		
		sb2.trimToSize(); // 저장공간의 크기와 길이을 맞춘다
		
		System.out.println(sb2.capacity()); 
		
		System.out.println(sb2.length()); 
		
		
		sb2.setLength(1); // 적은 숫자만큼 글자수를 남기고 모두 지운다
		
		System.out.println(sb2);
		
		
		
	}

}
