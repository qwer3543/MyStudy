package com.mystudy.ex04_inner_class;

public class InstanceClassTest {

	int a = 100;
	private int b = 10;
	static int c = 200; 
	int sum = 0;
	
	void sum() {
		sum = a + b;
	}
	
	// 내부 클래스: static이 안 붙어 있으니 인스턴스 클래스다
	class Inner{
		int in = 100;
		
		void printData() {
			System.out.println("int a: " + a);
			System.out.println("private int b: " + b);
			System.out.println("static int c: " + c);
			sum();
			System.out.println("sum: " + sum);
			System.out.println("내부클래스 필드 in:" + in);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		InstanceClassTest outer = new InstanceClassTest();
		System.out.println("필드변수 a: " + outer.a);
		
		System.out.println("=== 인스턴스 클래스(내부 클래스) 사용 ===");
		
		InstanceClassTest.Inner inner = new InstanceClassTest().new Inner();
		inner.printData();
		
		System.out.println("==========");
		
		System.out.println("Inner 클래스 변수 in: " + inner.in);

	}

}
