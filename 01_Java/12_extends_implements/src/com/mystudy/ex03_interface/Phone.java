package com.mystudy.ex03_interface;

/* 전화기 클래스 만들기
   속성: 타입(type), 전화번호(phoneNo)
   기능: 전화 정보 확인(view) / 전화걸기(call) / 전화 받기(receiveCall) / 메시지 보내기(sMessage) / 메시지 받기(rMessage)
 */


public class Phone {
	
	//-------------------------------------------------------------- 필드(속성)
	String type;
	String phoneNo;
	
	
	//-------------------------------------------------------------- 생성자
	public Phone(String type, String phoneNo) {
		super();
		this.type = type;
		this.phoneNo = phoneNo;
	}
	
	public Phone(String phoneNo) {
		super();
		this.phoneNo = phoneNo;
	}

	//--------------------------------------------------------- 메소드
	public String getType() {
		return type;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	//------------------------------------------------------------------------ 기능
	public void view() {
		System.out.println("타입: " + type + ", 전화번호: " + phoneNo);
	}
	
	public void receivecall() {
		System.out.println(">> 전화 받기");
	}
	
	public void call() {
		System.out.println(">> 전화 걸기");
	}
	
	public void sMessage() {
		System.out.println(">> 메시지 보냄");
	}
	
	public void rMessage() {
		System.out.println(">> 메시지 받기");
	}

}
