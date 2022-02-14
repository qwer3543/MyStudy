package com.mystudy.stringbuilder;

import java.util.Arrays;

public class Ex04_String_controls_exam2 {

	public static void main(String[] args) {
		/* String[]과 String 메소드 사용 실습
		문자열 : "홍길동","이순신","이순신","을지문덕","김유신","연개소문","Tom","TOM"
		1. 위의 문자열 값을 저장할 수 있는 문자열 배열(names) 변수를 선언하고 입력
		2. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한 라인에 출력
		   출력 예) 홍길동,이순신,이순신,을지문덕....
		3. 배열에 있는 데이터의 첫 글자만 출력-구분자 콤마(,) 사용 한 라인에 출력
		   출력 예) 홍,이,이,을,김,연,T,T...
		4. 이름의 글자수가 4글자 이상인 이름을 검색해서 "인덱스번호:이름" 형태로 출력
		   예) 3:을지문덕
		5. 이름이 같은 데이터를 "인덱스번호:이름=인덱스번호:이름" 형태로 출력
		   예) 1:이순신=2:이순신
		(기타) 이름 비교시에는 대소문자 구분 없이 비교처리(Tom, TOM 은 같다)
		========================================================= */
		//"홍길동","이순신","이순신","을지문덕","김유신","연개소문","Tom","TOM"
		//1. 위의 문자열 값을 저장할 수 있는 문자열 배열(names) 변수를 선언하고 입력
		/* 배열선언1 - new 크기 지정
		String[] names = new String[8];
		names[0] = "홍길동";
		names[1] = "이순신";
		names[2] = "이순신";
		//----------------
		// 배열선언2 - new + 데이터 입력 
		String[] names = new String[] {"홍길동","이순신","이순신","을지문덕","김유신","연개소문","Tom","TOM"};
		*/
		// 배열선언3 - 배열 데이터 입력 
		String[] names = {"홍길동","이순신","이순신","을지문덕",
				"김유신","연개소문","Tom","TOM"};
		
		//2. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한 라인에 출력
		//   출력 예) 홍길동,이순신,이순신,을지문덕, .... ,TOM
		System.out.print(names[0] + ",");
		System.out.print(names[1] + ",");
		System.out.print(names[2] + ",");
		System.out.print(names[3] + ",");
		System.out.println();
		System.out.println("-------");
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + ",");
		}
		System.out.println();
		System.out.println("--- 반복문내에서 마지막 데이터 구분처리 ----");
		// 이름, + 이름, + ... + 이름
		for (int i = 0; i < names.length; i++) {
			//현재처리중인 데이터가 마지막 데이터 여부 확인
			if (i == (names.length - 1)) {
				System.out.print(names[i]);
			} else {
				System.out.print(names[i] + ",");
			}
		}
		System.out.println();
		
		//첫번째 ~ 마지막 이전 데이터까지
		int lastIndex = names.length - 1;
		for (int i = 0; i < lastIndex; i++) {
			System.out.print(names[i] + ",");
		}
		//마지막 데이터
		if (names.length > 0) {
			System.out.print(names[lastIndex]);
		}
		System.out.println();
		
		System.out.println("========");
		
		System.out.print(names[0]);
		System.out.print("," + names[1]);
		System.out.print("," + names[2]);
		System.out.print("," + names[3]);
		System.out.println();
		System.out.println("----");
		
		//첫번째 데이터 처리
		if (names.length > 0) {
			System.out.print(names[0]); //첫번째 
		}
		//2번째 부터  ~ 마지막 데이터까지
		for (int i = 1; i < names.length; i++) {
			System.out.print("," + names[i]);
		}
		System.out.println();
		System.out.println("----");
		
		System.out.println("--- 반복문내에서 첫번째 데이터 구분처리 ----");
		// 이름 + ,이름 + ,이름 + ... + ,이름
		for (int i = 0; i < names.length; i++) {
			//현재처리중인 데이터가 첫번째 데이터 여부 확인
			if (i == 0) {
				System.out.print(names[i]);
			} else {
				System.out.print("," + names[i]);
			}
		}
		System.out.println();
		
		System.out.println(">>> 문자열 데이터를 만들고 출력");
		//첫번째 데이터 처리
		String nameStr = "";
		if (names.length > 0) {
			nameStr = names[0]; //첫번째 
		}
		//2번째 부터  ~ 마지막 데이터까지
		for (int i = 1; i < names.length; i++) {
			nameStr += "," + names[i];
		}
		System.out.println(nameStr);
		System.out.println();
		
		System.out.println("===== 3번  이름 첫글자만 =====");
		//3. 배열에 있는 데이터의 첫 글자만 출력-구분자 콤마(,) 사용 한 라인에 출력
		//   출력 예) 홍,이,이,을,김,연,T,T...
		//첫번째 데이터 처리
		if (names.length > 0) {
			System.out.print(names[0].charAt(0)); //첫번째데이터 첫글자 
		}
		//2번째 부터  ~ 마지막 데이터까지
		for (int i = 1; i < names.length; i++) {
			System.out.print("," + names[i].charAt(0));
		}
		System.out.println();
		
		System.out.println("==== 4번 이름 4글자 이상만 추출 ===");
		//4. 이름의 글자수가 4글자 이상인 이름을 검색해서 "인덱스번호:이름" 형태로 출력
		//   예) 3:을지문덕
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() >= 4) {
				System.out.println(i + ":" + names[i]);
			}
		}
		
		System.out.println("==== 5번 중복이름 있으면 출력 ====");
		//5. 이름이 같은 데이터를 "인덱스번호:이름=인덱스번호:이름" 형태로 출력
		//   예) 1:이순신=2:이순신
		//(기타) 이름 비교시에는 대소문자 구분 없이 비교처리(Tom, TOM 은 같다)
		//---------------------------------
		//"홍길동","이순신","이순신","을지문덕","김유신","연개소문","Tom","TOM"
		
		//바깥쪽 for 기준값 변경 처리(0~마지막 이전)
		//내부(안쪽) for 비교대상값 변경 처리(기준값+1 ~ 마지막 데이터까지)
		System.out.println(Arrays.toString(names));
		System.out.println("=== 이중 for문 작성 코드 =======");
		for (int gijun = 0; gijun < names.length-1; gijun++) {
			for (int i = (gijun+1); i < names.length; i++) {
				//System.out.println(gijun + " vs " + i);
				if (names[gijun].equalsIgnoreCase(names[i])) {
					System.out.println(gijun +":"+ names[gijun]
							+ "=" + i +":"+ names[i]);
				}
			}
		}
		System.out.println();
		
		System.out.println("==== 반복문 전환 순차적 처리 ===");
		//   예) 1:이순신=2:이순신
		//기준 인덱스: 0 일때
		if (names[0].equalsIgnoreCase(names[1])) {
			System.out.println(0 +":"+ names[0] +"="+ 1 +":"+ names[1]);
		}
		if (names[0].equalsIgnoreCase(names[2])) {
			System.out.println(0 +":"+ names[0] +"="+ 2 +":"+ names[2]);
		}
		//....
		//마지막 데이터 까지
		if (names[0].equalsIgnoreCase(names[names.length - 1])) {
			System.out.println(0 +":"+ names[0] 
					+"="+ (names.length - 1) +":"+ names[names.length - 1]);
		}
		System.out.println("======");
		//------------
		//기준 인덱스: 1 일때
		if (names[1].equalsIgnoreCase(names[2])) {
			System.out.println(1 +":"+ names[1] +"="+ 2 +":"+ names[2]);
		}
		if (names[1].equalsIgnoreCase(names[3])) {
			System.out.println(1 +":"+ names[1] +"="+ 3 +":"+ names[3]);
		}
		//...
		if (names[1].equalsIgnoreCase(names[names.length - 1])) {
			System.out.println(1 +":"+ names[1] 
					+"="+ (names.length - 1) +":"+ names[names.length - 1]);
		}
		
		System.out.println("=================");
		System.out.println("--- for문 0 인덱스 기준 ----");
		for (int i = 1; i < names.length; i++) {
			if (names[0].equalsIgnoreCase(names[i])) {
				System.out.println(0 +":"+ names[0] +"="+ i +":"+ names[i]);
			}
		}
		
		System.out.println("--- for문 1 인덱스 기준 ----");
		for (int i = 2; i < names.length; i++) {
			if (names[1].equalsIgnoreCase(names[i])) {
				System.out.println(1 +":"+ names[1] +"="+ i +":"+ names[i]);
			}
		}
		
		System.out.println("--- for문 2 인덱스  기준 ----");
		for (int i = 3; i < names.length; i++) {
			if (names[2].equalsIgnoreCase(names[i])) {
				System.out.println(2 +":"+ names[2] +"="+ i +":"+ names[i]);
			}
		}
		System.out.println("--- for문 인덱스 마지막 이전  기준 ----");
		//기준인덱스 마지막 이전 데이터까지
		for (int i = names.length-1; i < names.length; i++) {
			if (names[names.length-2].equalsIgnoreCase(names[i])) {
				System.out.println(names.length-2 +":"+ names[names.length-2] 
						+"="+ i +":"+ names[i]);
			}
		}
		System.out.println("==== for문 이중 중복처리 ====");
		//인덱스 기준 : 0 ~ 마지막 이전 데이터까지
		for (int idx = 0; idx < names.length - 1; idx++) {
			for (int i = (idx + 1); i < names.length; i++) {
				if (names[idx].equalsIgnoreCase(names[i])) {
					System.out.println(idx +":"+ names[idx] +"="+ i +":"+ names[i]);
				}
			}
		}
		System.out.println(">> main() 끝");
	}

}




