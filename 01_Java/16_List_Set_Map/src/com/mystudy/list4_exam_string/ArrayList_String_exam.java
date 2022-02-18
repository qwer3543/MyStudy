package com.mystudy.list4_exam_string;

import java.util.ArrayList;

public class ArrayList_String_exam {

	public static void main(String[] args) {
		/* List 중 ArrayList<String> 사용 실습
		문자열 : "홍길동","이순신","이순신","을지문덕"
		1. 위의 문자열 값을 저장할 수 있는 ArrayList 타입 names 변수를 선언하고 입력
		2. List에 있는 값을 구분자 콤마(,)로 구분하여 한 라인에 출력
		   출력 예) 홍길동,이순신,이순신,을지문덕
		3. List에 있는 데이터의 첫 글자만 출력-구분자 콤마(,) 사용 한 라인에 출력
		   출력 예) 홍,이,이,을
		4. 이름이 을지문덕인 데이터를 찾아서 "인덱스번호:이름" 형태로 출력
		   예) 3:을지문덕
		========================================================= */
		// 1. 위의 문자열 값을 저장할 수 있는 ArrayList 타입 
		//    names 변수를 선언하고 입력
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("홍길동");
		names.add("이순신");
		names.add("이순신");
		names.add("을지문덕");
		
		//2. List에 있는 값을 구분자 콤마(,)로 구분하여 한 라인에 출력
		//   출력 예) 홍길동,이순신,이순신,을지문덕
		System.out.println(names);
		
		
		//3. List에 있는 데이터의 첫 글자만 출력-구분자 콤마(,) 사용 한 라인에 출력
		//   출력 예) 홍,이,이,을
		
		for (int i = 0; i < names.size(); i++) {
			System.out.print(names.get(i).charAt(0));
			if (i < names.size() -1) {
				System.out.print(",");
			}
		}
		System.out.println();
		
		
		//4. 이름이 을지문덕인 데이터를 찾아서 "인덱스번호:이름" 형태로 출력
		//   예) 3:을지문덕
		
		for (int i = 0; i < names.size(); i++) {
			if (names.get(i).equals("을지문덕")) {
				System.out.println(names.indexOf(names.get(i)) + " : " + names.get(i));
			}
		}
		
		
		
		
		
	}

}
