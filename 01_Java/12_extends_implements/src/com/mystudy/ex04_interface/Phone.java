package com.mystudy.ex04_interface;

//인터페이스(interface) 구현(implements)하는 방식으로 클래스 만들기
public class Phone implements I_Phone {
	//필드(속성) ---------
	private String type; //전화타입(형태)
	private String phoneNo; //전화번호
	
	//생성자
	public Phone(String phoneNo) {
		this.type = "Phone 타입";
		this.phoneNo = phoneNo;
	}
	
	public Phone(String type, String phoneNo) {
		super();
		this.type = type;
		this.phoneNo = phoneNo;
	}

	//메소드 -----------------
	public String getType() {
		return type;
	}

	public String getPhoneNo() {
		return phoneNo;
	}
	
	//=============================================
	//기능(메소드) 구현 : 인터페이스에 정의된 메소드 구현
	@Override
	public void view() {
		System.out.println("타입: " + type + ", 전화번호: " + phoneNo);
	}

	@Override
	public void call() {
		System.out.println(">> 전화걸기");
	}

	@Override
	public void receiveCall() {
		System.out.println(">> 전화받기");
	}

	@Override
	public void sendSMS() {
		System.out.println(">> 메시지 보냄");
	}

	@Override
	public void receiveSMS() {
		System.out.println(">> 메시지 받음");
	}

}
