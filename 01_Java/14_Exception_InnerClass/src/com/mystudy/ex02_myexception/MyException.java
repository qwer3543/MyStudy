package com.mystudy.ex02_myexception;


// 예외 만들기: Exception 클래스를 상속받아 만들기
public class MyException extends Exception{

	public MyException() {
		// 슈퍼(부모)클래스의 생성자 호출(메시지전달)
		super(">> 내가 만든 Exception");
	}
	
	public MyException(String msg) {
		// 슈퍼(부모)클래스의 생성자 호출(메시지전달)
		super(">> 내가 만든 Exception: " + msg);
	}
	
	
	
	
}
