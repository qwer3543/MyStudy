package com.mystudy.ex03_interface;

// 인터페이스에는 final 속성값, 추상메소드가 있다.
public interface I_Phone { 

	// {} 없음 : 추상 메소드(abstract 메소드)
	public abstract void view();
	public void call(); // public abstract / 전화걸기
	void receiveCall(); // public abstract / 전화 받기
	void sendSMS(); // public abstract / 메시지 보내기
	void receiveSMS(); // public abstract / 메시지 받기
	
	
	
	
}
