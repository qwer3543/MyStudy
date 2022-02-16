package com.mystudy.ex01_exception;

public class ExceptionThrows {

	public static void main(String[] args) {
		// throws : 예외를 던질 때(위임, 전가) 사용
		// 예외가 발생한 곳에서 처리하지 않고 예외를 던져서 다른 곳에서 처리하도록 함
		// 호출한 곳에서 처리하도록 예외를 던짐
		System.out.println("=== throws ===");
		
		try {
			System.out.println(test(5));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("[넘겨 받은 예외처리 여기서 실행]");
		}
		
		
		
	}
	
	// 예외를 직접 처리하지 않고 호출한 곳으로 예외를 전달해서
	// 호출한 곳에서 예외 처리를 하도록 .. 예외 처리를 전가한다
	static String test(int s) throws ArrayIndexOutOfBoundsException {
		String result = "";
		int[] num = new int[3]; //인덱스 0, 1, 2
		
		num[s] = 100; // ArrayIndexOutOfBoundsException 예외 발생시 다른곳에서 예외 처리하도록 넘김
		result = "<정상실행>";
		
			
		return result;
	}

}
