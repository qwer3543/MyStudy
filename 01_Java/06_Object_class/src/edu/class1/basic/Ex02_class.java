package edu.class1.basic;

public class Ex02_class {
	//======== 변수 선언 영역 =========
	// 필드변수(인스턴스변수, 멤버변수, 속성-propertyy)선언
	int num = 111;

	
	
	// 클래스변수, 스테틱(static)변수, 인스턴스(객체) 공통변수
	static int staticNum = 222;
	
	//======== 생성자 선언 영역 =========
	
	// 이름은 클레스 명으로 시작한다
	Ex02_class()  {} //기본생성자(default constructor) 생략가능
	
	//======== 메소드 선언 영역 =========
	
	// main 메소드
	public static void main(String[] args) {
		// 로컬변수(지역변수)
		
		int num1 = 100;
		int num2 = 200;
		int k = num1 + num2;
		System.out.println(k);	
		
	    System.out.println("======================");
	    
		k = add(num1, num2);
		// num1 100의 값과 num2 200의 값이 add의 변수 a, b
		// 로 저장한다
		
		System.out.println(k);
		
	}
	
	public static int add(int a, int b) {
		
		return a + b;
		
		
		
	}
	
	
	
}
