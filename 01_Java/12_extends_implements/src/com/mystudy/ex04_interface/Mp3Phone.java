package com.mystudy.ex04_interface;

/* Mp3Phone 기능 구현(반드시 I_Phone, I_Mp3Phone 구현해라)
	전화정보확인, 전화걸고, 받고, 문자 주고, 받고, 
	음악도 플레이
*/
//public class Mp3Phone implements I_Phone, I_Mp3Phone {

// I_Phone 구현한 Phone 클래스 상속확장하고, I_Mp3Phone 인터페이스 기능 구현
public class Mp3Phone extends Phone implements I_Mp3Phone {

	public Mp3Phone(String phoneNo) {
		super("Mp3Phone타입", phoneNo);
	}
	
	public Mp3Phone(String type, String phoneNo) {
		super(type, phoneNo);
	}

	@Override
	public void playMusic() {
		System.out.println(">> 음악플레이");
	}


}













