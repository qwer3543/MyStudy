package com.mystudy.thread01;


//쓰레드로 동작하는 클래스 만들기
//Thread 클래스를 상속확장(extends)해서 만들기
class MyThread extends Thread {
	int num = 10;
	public MyThread(int num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		//Thread 클래스의 run() 메소드를  오버라이딩(Overriding)해서 
		//쓰레드로 하려는 작업을 작성
		System.out.println(this.getId() + ":" + this.getName() + " - run() 시작" );
		
		for (int i = 1; i <= num; i++) {
			System.out.println(">" + this.getName() +" : "+ i);
			try {
				Thread.sleep(500); //0.5초동안 멈추기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this.getId() + ":" + this.getName() + " - run() 끝" );
	}
}


public class ThreadExtendsExam {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("--- main() 시작 ----");
		Thread mainThread = Thread.currentThread();
		System.out.println("main 쓰레드: " + mainThread);
		
		MyThread th1 = new MyThread(10);
		th1.setName("MyThread-1");
		th1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("th1 : " + th1);
		//th1.run(); //단순 메소드 호출 - 쓰레드로 동작하지 않음
		
		th1.start(); //쓰레드로 동작시키려면 start() 호출
		
		//쓰레드를 하나 더 만들어서 실행
		MyThread th2 = new MyThread(20);
		th2.setName("MyThread-2");
		th2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("th2 : " + th2);
		th2.start();
		//-------------------------
		
		th1.join(); //th1 종료 후 main 쓰레드 종료
		
		
		System.out.println("--- main() 끝 ----");

	}

}
