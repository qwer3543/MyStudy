package com.mystudy.ex04_interface;

public class PhoneTest {

	public static void main(String[] args) {
		System.out.println("=== Phone ===");
		Phone ph1 = new Phone("010-1111-1111");
		ph1.view();
		ph1.call();
		ph1.receiveCall();
		ph1.sendSMS();
		ph1.receiveSMS();
		System.out.println("getPhoneNo() : " + ph1.getPhoneNo());
		
		System.out.println("== Mp3Phone ==");
		
		Mp3Phone ph2 = new Mp3Phone("010-8000-7980");
		
		ph2.view();
		ph2.call();
		ph2.receiveCall();
		ph2.sendSMS();
		ph2.receiveSMS();
		ph2.playMusic();
		
	}

}
