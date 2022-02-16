package com.mystudy.ex01_exception;

public class ExceptionFinally {

	public static void main(String[] args) {
		// try ~ catch ~ finally
		System.out.println("--- main() 시작 ---");
		int num = 5;
		int result = 0;
		
		try {
			System.out.println("-- try문 시작");
			num = 5;
			result = 100 / num;
			System.out.println("연산결과 : " + result);
			
			System.out.println("-- try문 종료");
		} catch (ArithmeticException e) {
			System.out.println(">>> catch문 실행");
		} finally {
			System.out.println("***>> finally : 항상실행(무조건)");
		}
		System.out.println("-------------------");
		
		System.out.println("test()실행결과 : " + test());

		System.out.println("--- main() 끝 ---");
	}
	
	// 메소드 내에서 예외를 직접 처리한다
	static String test() {
		String result = "";
		int[] num = new int[3]; //인덱스 0, 1, 2
		
		try {
			num[3] = 100;
			result = "<정상실행>";
		} catch (ArrayIndexOutOfBoundsException e) {
			result = "<예외발생> ArrayIndexOutOfBoundsException : " + e.getMessage();
		}
			
		return result;
	}
	

}








