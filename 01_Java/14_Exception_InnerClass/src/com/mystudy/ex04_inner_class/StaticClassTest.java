package com.mystudy.ex04_inner_class;

public class StaticClassTest {
	
	int a = 10;
	private int b = 100;
	static int c = 200;
	
	static int sum = 0;
	static int sNum1 = 20;
	static int sNum2 = 30;
	
	static void sum() {
		sum = Inner.d + sNum1; // static 변수끼리 사용 가능
		//System.out.println(sum);
	}
	
	// 스태틱 내부 클래스 (Inner 클래스 중 static 클래스)
	static class Inner{
		static int d = 1000;
		int e = 2000;
		
		void printData() {
			
			// static class 클래스에선 static만 쓸수있다 즉 non-static 사용 불가 
			//System.out.println("int a: " + a); // non-static
			//System.out.println("private int b: " + b); // non-static
			
			System.out.println("Outer static int c: " + c);
			System.out.println("Inner static int d: " + d);
			
			// static class안에서 만들어진 non-static은 쓸수 있다
			// 외부에있는 non-static은 사용 불가
			System.out.println("Inner int e: " + e);
		}
	}
	
	

	public static void main(String[] args) {
		// 클래스에 선언된 static변수, static 메소드는 객체생성 안하고도
		// 클래스명.변수명, 클래스명.메소드명(); 으로 사용가능 하다
		int num = StaticClassTest.c;
		StaticClassTest.sum();
		
		// static 내부클래스의 static 필드변수 사용
		int innerNum = StaticClassTest.Inner.d;
		
		StaticClassTest.Inner inner = new StaticClassTest.Inner();
		
		System.out.println("inner: " + inner);
		inner.printData();
		//sum();

	}

}
