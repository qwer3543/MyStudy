package com.mystudy.string;

import java.util.Arrays;

public class Ex02_String_method {

	public static void main(String[] args) {
		
		// String 클래스 메소드를 사용 문자열 처리(단, 원본문자열 불변)
		//            0123456789
		String str = "Java World";
		
		System.out.println("str: " + str);
		
		System.out.println("---- charAt() : index번째 문자를 반환함 ----");
		
		// .charAt(0) 해당 번호에 위치하는 문자를 char타입으로 출력한다
		char ch = str.charAt(0);
		
		System.out.println("ch: " + ch); // -> J
		
		char[] ch2 = new char[4];
		
		for (int i = 0; i < ch2.length; i++) {
			// ch2 변수에 str 변수값을 가져온다
			ch2[i] = str.charAt(i);
		}     // Arrays.toString(값) 값을 문자로 [] 안에 출력 해줌
		System.out.println("ch: " + Arrays.toString(ch2));
		
		System.out.println("---- compareTo() : 비교하여 결과로 양수, 음수, 0의 값을 반환함 ----");
		
		// .compareTo 검사 결과가 0이면 같다는 뜻 이외 값들은 다르다는 뜻
		System.out.println("java".compareTo("java"));
		
		// 앞쪽에 있는 문자을 .compareTo() 안에 들어가는 문자와 비교한다
		System.out.println("aaa".compareTo("bbb"));
		
		System.out.println("---- copyValueOf() : 문자 배열값을 문자열로 복사함 ----");
		
		char[] ch3 = { 'a', 'b', 'c', 'd'};
		
		System.out.println(Arrays.toString(ch3));
		
		// .copyValueOf(ch3) -> ch3 값을 str 변수로 보낸다
		str = String.copyValueOf(ch3);
		
		System.out.println(str);
		
		System.out.println("==== indexOf() : 문자(문자열) 위치값 확인 ====");
		
		//     0123456789
		str = "Java World";
	
		System.out.println("str: " + str);
		
		// .indexOf() 변수안에 가지고 있는 값의 인텍스 번호를 알려준다
		// ('a',2) -> ,2는 2번 인덱스 이후부터 있는 a 값을 찾아라 라는 뜻
		System.out.println(str.indexOf('a',2));
		
		// 맨 뒤에서부터 찾기 시작한다 
		System.out.println(str.lastIndexOf('W'));
		
		// startsWith() 문자의 시작값이(문장이) 맞는지 아닌지를 true, false로 알려줌
		System.out.println(str.startsWith("Java"));
		System.out.println(str.startsWith("World"));
		
		// endsWith() 문자의 마지막 값이 (문장이) 맞는지 아닌지를 true, false로 알려줌
		System.out.println(str.endsWith("Java"));
		System.out.println(str.endsWith("World"));
		
		// isEmpty() 값이 비어있는지 아닌지를 true, false로 알려줌
		System.out.println(str.isEmpty());
		
		
		
		//	   0123456789
		str = "Java World";
		
		System.out.println("str: " + str);
		
		// replace() : "Java", "Hello" -> Java 문자열을 -> Hello 바꾼다
	    // 중복 되는 값도 다~ 바꾼다
		System.out.println(str.replace("Java", "Hello")); // Hello World
		
		// 위에서 변경 코드들을 썻지만 원본 값인 str변수는 불변 값으로 변하지 않는다
		System.out.println(str);
		
		
		
		
		//	   0123456789
		str = "Java World";
		
		System.out.println("str: " + str);
		
		// substring() 입력한 인덱스 위치부터 끝까지 출력한다
		System.out.println(str.substring(5));
		
		// (0, 4) -> (입력한 인텍스 위치부터, 입력한 인덱스 이전값 까지 출력)
		System.out.println(str.substring(0, 4));
		
		// 뒤에서 5개 문자만 사용
		System.out.println(str.substring(str.length() - 5));
		
		// length() 문자열의 길이를 알려준다
		System.out.println(str.length());
		
		   
		str = "  Java World  ";
		
		System.out.println(str);
		
		// toUpperCase() 전채 대문자로 변경
		System.out.println(str.toUpperCase());
		
		// toLowerCase() 전채 소문자로 변경
		System.out.println(str.toLowerCase());
		
		// trim() 불필요한 문자열을 없에준다(좌우측 끝에 있는 뛰어쓰기값 지워짐)
		System.out.println(str.trim());
		
		
		
		int num = 100;
		
		// 100이라는 숫자값을 자동으로 문자열로 바꿔서 붙여라
		
		// str = 100 + ""; // 100 -> "100" 문자처리됨 하지만 (아래 방법이 더좋다)
		
		System.out.println(str + 1);
		
		str = String.valueOf(100); // "100" 문자열로 변환 (이 방법이 좋음)
		
		str = String.valueOf(num); // num에 있는 100의 정수를 str에 문자열로 보낸다
		
		
		str = "Java World";
		
		// str 문자열을 ch4로 보낸다 (배열)
		char[] ch4 = str.toCharArray();
		
		System.out.println(Arrays.toString(ch4));
		
		System.out.println(ch4);
		
		
		
		
		
		
		
		
	}

}
