package com.mystudy.ex02_myexception;

public class MyExceptionTest {

	public static void main(String[] args) {
		
		System.out.println("=== main 시작 ==="); // 
		
		try {
			firstMethod();
		} catch (MyException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		System.out.println("=== main 끝 ==="); // 6

	}

	private static void firstMethod() throws MyException {
		System.out.println("> firstMethod 시작 ==="); // 
		
		secondMethod();
		
		System.out.println("> firstMethod 끝 ==="); // 
	}

	private static void secondMethod() throws MyException {
		System.out.println(">>> secondMethod 시작 ==="); // 
		// 예외 발생시키기
		boolean isException = true;
		if(isException) {
			throw new MyException("secondMethod()에서 예외발생!!!");
		}
		System.out.println(">>> secondMethod 끝 ==="); // 
	}

	
	
	
}
