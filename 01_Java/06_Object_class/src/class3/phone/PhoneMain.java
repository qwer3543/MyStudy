package class3.phone;

public class PhoneMain {


	public static void main(String[] args) {
		
		// class phone의 (기본) 생성자 값을 이용한 
		// 인스턴스  myp 생성
		Phone myp = new Phone();
		
		// class Phone (기본)생성자의 변수값을 메소드->
		// void check(){...}에 대입하여 값을 가져온다
		myp.check();
		
		System.out.println("===================");
		
		// class phone의 (입력받아 정의 하는)생성자 값을 이용한
		// 인스턴스 freindP 생성
		Phone freindP = new Phone("iPhone12", "Pro", true);
		
		// class Phone의 입력하여 정의된 생성자의 변수값을 메소드->
		// void check(){...}에 대입하여 값을 가져온다
		freindP.check();
		
		System.out.println("===================");
		
		// class phone의 메소드-> sendSms을 실행한다
		myp.sendSms("안녕");
		
		// class phone의 메소드-> receiveSms을 실행한다
		// ==return문==
		System.out.println(myp.receiveSms("안녕"));
		
	}
	
}
