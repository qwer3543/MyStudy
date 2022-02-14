package com.mystudy.ex01_class;

class PhoneTest {

	public static void main(String[] args) {
		// Phone 객체 생성 후 기능 테스트
		
		System.out.println("==== Phone ====");
		
		Phone ph1 = new Phone("010-8000-3983");
		
		ph1.view();
		ph1.call();
		ph1.receivecall();
		
		
		System.out.println("================");
		
		Phone ph2 = new Phone("삼성 노트10+","010-8000-3983");
		
		ph2.view();
		ph2.call();
		ph2.receivecall();
		
		System.out.println("==== Mp3Phone ====");
		
		Mp3Phone mp3ph = new Mp3Phone("010-8000-3983");
		
		mp3ph.view();
		mp3ph.call();
		mp3ph.receivecall();
		mp3ph.playMusic();

	}

}
