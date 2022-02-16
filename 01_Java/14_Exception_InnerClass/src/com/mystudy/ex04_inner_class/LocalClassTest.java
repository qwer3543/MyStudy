package com.mystudy.ex04_inner_class;


public class LocalClassTest {

	int a = 100;
	
	void innerTest(int k) {
		int b = 200; // 지역변수 (local variable)
		int c = k;
		
		// 메소드 내에 선언된 클래스(지역 클래스 -local class)
		// 선언된 메소드 내부에서만 사용 가능
		class Inner{
			void printData() {
				System.out.println("int a: " + a);
				System.out.println("int b: " + b);
				System.out.println("int c: " + c);
				System.out.println("파라미터 k: " + k);
			}
		}
		Inner in = new Inner();
		System.out.println("내부클래스 in: " + in);
		in.printData();
		
	}
	
	public static void main(String[] args) {
		
		LocalClassTest outer = new LocalClassTest();
		outer.innerTest(999);

	}

}
