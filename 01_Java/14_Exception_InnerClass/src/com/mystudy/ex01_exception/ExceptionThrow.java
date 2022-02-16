package com.mystudy.ex01_exception;

public class ExceptionThrow {

	public static void main(String[] args) {
		// 예외처리 throw : 예외를 발생시킬 때 사용
		
		//throw new ArithmeticException();
		//throw new ArithmeticException("throw 테스트중");
		throw new ArrayIndexOutOfBoundsException();
		
		//throw new Exception();
	}

}
