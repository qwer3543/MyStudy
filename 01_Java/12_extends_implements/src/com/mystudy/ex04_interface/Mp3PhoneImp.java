package com.mystudy.ex04_interface;

/* Mp3Phone 기능 구현(반드시 I_Phone, I_Mp3Phone 구현해라)
전화정보확인, 전화걸고, 받고, 문자 주고, 받고, 
음악도 플레이
*/
public class Mp3PhoneImp implements I_Phone, I_Mp3Phone{

	@Override // I_Mp3Phone 에있는 메소드
	public void playMusic() {
		// TODO Auto-generated method stub
		
	}

	@Override // I_Phone 에있는 메소드
	public void view() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveSMS() {
		// TODO Auto-generated method stub
		
	}

}
