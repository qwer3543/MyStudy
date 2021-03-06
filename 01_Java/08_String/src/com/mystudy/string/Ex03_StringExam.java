package com.mystudy.string;

import java.util.Arrays;

public class Ex03_StringExam {

	public static void main(String[] args) {
		// String str = "901012-1234567"; // 주민번호
		// 1] 전체자리수 14개 여부 확인, '-'위치: 7번째 여부 확인
		
		// 2] 생년월일 출력(1-2:년도, 3-4:월, 5-6:일)
		
		// 3] 성별 확인하고 출력(1,3: 남성 / 2,4: 여성)
		
		// 4] 데이터의 값을 검증(월: 1~12, 일: 1~31)
		
		// 참고) int num = Integer.parseInt("10"); -> "10"을 숫자 10으로 바꾼다
		
		//========================================================
		
		String str = "901012-1234567";
		
		// 1]> 전체자리수 14개 여부 확인
		
		if (str.length() == 14) {
			System.out.println(str + " [정상]");
		} else {
			System.out.println(str.length() + " [비정상]");
		}
		
		//========================================================
		
		//  '-'위치: 7번째 여부 확인
		
		// 1.
		if (str.substring(6, 7).equals("-")) {
			System.out.println("'-' [정상]");
		} else {
			System.out.println("'-' [비정상]");
		}
		
		// 2. 비교 값이 상수라면 위와 다르게 비교를 먼저 해준다(널 값 때문??)
		if (!"-".equals(str.substring(6, 7))) {
			System.out.println("'-' [비정상1]");
		} else {
			System.out.println("'-' [정상1]");
		}
		
		//========================================================
		// 2]> 생년월일 출력(년도, 월, 일)
		
		System.out.println("19" + str.substring(0, 2) + "년 "
				 				+ str.substring(2, 4) + "월 "
				 				+ str.substring(4, 6) + "일 ");
		
		//========================================================
		
		// 3]> 성별 확인하고 출력(1,3: 남성 / 2,4: 여성)
		
		// String.valueOf() : 어떤 값이든 String타입 으로 바꾸어 준다
		// 기존에 str.charAt(7)).equals("1")은 비교가 불가능했다
		// 이유는 cher타입[charAt()]과 String타입[equals()]과 비교 했기 때문이다
		// 그래서 cher타입[charAt()]을 -> String.valueOf() 안에 넣어 줌으로
		// String타입 으로 바꾸고 다시 비교한다 -> String == String
		
		if (String.valueOf(str.charAt(7)).equals("1") || String.valueOf(str.charAt(7)).equals("3") ) {
			System.out.println("남성 입니다.");
		} else {
			System.out.println("여성 입니다.");
		}
		
		
		//========================================================
		
		// 4]> 데이터의 값을 검증(월: 1~12, 일: 1~31)
		
		// str(자리값): 10 -> 숫자 10으로 변환
		int month = Integer.parseInt(str.substring(2, 4)); 
		
		//str(자리값): 12 -> 숫자 12으로 변환
		int duty = Integer.parseInt(str.substring(4, 6));
		
		if (month < 13 && month > 0) {
			System.out.println("월: [정상]");
		} else {
			System.out.println("월: [비정상]");
		}
		
		if (duty < 32 && duty > 0) {
			System.out.println("일: [정상]");
		} else {
			System.out.println("일: [비정상]");
		}
		
		

	}

}
