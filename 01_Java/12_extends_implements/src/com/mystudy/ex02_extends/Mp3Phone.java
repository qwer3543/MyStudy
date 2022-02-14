package com.mystudy.ex02_extends;

// Phone 클래스를 extends(확장)해서 Mp3Phone 만들기
// Phone의 속성, 기능을 사용(허용해준것만) + Mp3Phone의 속성, 기능 사용(허용해준것만)
class Mp3Phone extends Phone{

	public Mp3Phone(String phoneNo) {
		super(phoneNo); // 부모 클래스 생성자 호출
		
	}

	public Mp3Phone(String type, String phoneNo) {
		super(type, phoneNo); // 부모 클래스 생성자 호출
		
	}

	
	
	
	
	
	// 메소드==========
	
	public void playMusic() {
		System.out.println("Mp3Phone - 음악플레이");
	}
	
	
	
	
	
	
}
