package com.mystudy.ex02_extends;

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
		
		mp3ph.view(); // Phone 타입의 view()
		mp3ph.call(); // Phone 타입의 call()
		mp3ph.receivecall(); // Phone 타입
		
		mp3ph.playMusic();  // Mp3Phone 타입
		
		System.out.println("==== WebPhone1 ====");
		
		WebPhone sss = new WebPhone("010-3693-9658");
		
		sss.view(); 
		sss.call(); 
		sss.receivecall(); 
		sss.webSearch();
		
		System.out.println("==== WebPhone2 ====");
		
		WebPhone sss1 = new WebPhone("아이폰","010-3693-9658");
		
		sss1.view(); 
		sss1.call(); 
		sss1.receivecall(); 
		sss1.webSearch();
		
		
		System.out.println("==== WebMp3Phone ====");
		
		WebMp3Phone aaa = new WebMp3Phone("010-8000-3983");
		
		aaa.view(); 
		aaa.call(); 
		aaa.receivecall(); 
		aaa.webSearch();
		aaa.playMusic();
	}

}
