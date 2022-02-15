package com.mystudy.ex04_interface;

// Phone 기능(정보보기, 전화걸고, 받고, 메시지전송, 받고)
// Mp3Phone 기능(음악플레이)
// 웹검색기능
interface I_WebPhone extends I_Phone, I_Mp3Phone{
	
	// Phone 기능
//	public abstract void view(); //전화정보 확인
//	public void call(); //전화걸기
//	void receiveCall(); //전화받기
//	void sendSMS(); //메시지 보내기
//	void receiveSMS(); //메시지 받기
//	
//	// Mp3Phone 기능
//	void playMusic();
	
	// web 검색 기능
	void searchWeb();
	
}
