package com.mystudy.string;

public class Ex01_String_basic {

	public static void main(String[] args) {
		
		// String 클래스: 문자열 저장, 처리하기 위한 클래스
		// String 데이터 자체는 불변 값이다
		
		// 사용형식 2가지
		// String str = "홍길동"; // 기본 데이터 타입 처럼 사용 (많이 쓰이지 않는다)
		// String str = new String("홍길동"); // 객체(인스턴스)생성
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		
		// 같은 저장공간을 쓰고 있다
		System.out.println(str2 == str2); // 동일 객체 여부 확인(true)
		
		System.out.println();
		
		System.out.println("===== new 객체 생성 =====");
		System.out.println();
		
		String strObj1 = new String("홍길동");
		
		System.out.println("str2: " + str2);
		System.out.println("strObj1: " + strObj1);
		
		// 별도의 저장공간을 쓰고있다
		System.out.println(str2 == strObj1); // 동일 객체 여부 확인(false)
//=====================================================================================		
		System.out.println("==== 올바른 비교방법 equals() ====");
		
		// == : 객체 비교(동일 객체 여부 확인)
		// 문자열 값 비교할때는 항상 아래와 같이 비교 해야한다 .equals() !!![중요]!!!
		System.out.println();
		
		System.out.println("str1.equals(str2) :  " + str1.equals(str2));
		System.out.println("str1.equals(strObj1) :  " + str1.equals(strObj1));
//=====================================================================================		
		
		System.out.println("========== concat()=========");
		// 문자열을 붙여주는 기능
		
		String a = "Hello";
		String b = "World";
		String c = "~~~~~";
		
		// a에다가 b을 붙인다는 뜻
		
		// 1] 
		System.out.println(a.concat(b));
		
		// 2]
		String kk = a.concat(b).concat(c).concat("!!!!");
		
		System.out.println(kk);
		
		System.out.println("======= equals 대 소문자 비교 =======");
		
		str1 = "JAVA";
		str2 = "java";
		
		// equals의 경우 대문자 소문자도 구별하여 정의한다 (false)
		System.out.println(str1.equals(str2));
		
		// equalsIgnoreCase의 경우 구별 하지 않는다 (true)
		System.out.println(str1.equalsIgnoreCase(str2));
		
	}

}
