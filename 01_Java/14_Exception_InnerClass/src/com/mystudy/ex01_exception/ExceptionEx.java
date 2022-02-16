package com.mystudy.ex01_exception;

public class ExceptionEx {

	public static void main(String[] args) {
		System.out.println("--- main() 시작 ---");
		int num = 100;
		int num1 = 0;
		int num2 = 30;
		int result = 0;
		System.out.println(">> 연산 시작");
		
		//result = num / num1; //ArithmeticException: / by zero
		
		//예외처리 -------------
		if (num1 == 0) {
			System.out.println("[예외발생] 나누는 값이 0입니다");
		} else {
			result = num / num1;
			System.out.println("연산결과 result : " + result);
		}
		System.out.println();
		
		//-----------------------------------------------------
		System.out.println("==== try ~ catch 예외처리 ====");
		
		try {
			result = num / num1;
			System.out.println("연산결과 result : " + result);
		} catch (ArithmeticException e) {
			System.out.println("[예외발생] 나누는 값이 0입니다");
			System.out.println("[예외발생-ArithmeticException] " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("[예외발생-RuntimeException] 나누는 값이 0입니다");
		} catch (Exception e) {
			System.out.println("[예외발생-Exception] 나누는 값이 0입니다");
		}
		
		
		System.out.println("--- main() 끝 ---");

	}

}











