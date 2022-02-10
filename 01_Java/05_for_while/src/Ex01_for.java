
public class Ex01_for {

	public static void main(String[] args) {
		
		// 제어문 - 반복문(for, while, do ~ while)
		// for(반복 횟 수 정할수 있다), while(참이 될때까지 반복하기)
		
		// for문 안에 실행된 변수 값은 for문 안에서만 쓸수 있다
		// for ( 1.초기값 설정 ; 2.실행(종결)조건 ; 4.증감 설정 ) { 3.작동 }
		// for (;;) {}  => 계속 반복하기
		
		for (int i = 1; i <= 3; i++) { 
			System.out.println("*");
			
		}
		
		System.out.println("====================================");
		//==========================================
		
		// i값이 1부터 10까지 1씩 증가하면서 반복 처리
		for (int i = 1; i <= 10; i++) { // +1
			System.out.println(i);
		}
		
		System.out.println("====================================");
		//==========================================
		
		for (int i = 1; i <= 10; i +=2) {  // +2
			System.out.println(i);
		}
		
		System.out.println("====================================");
		//==========================================
		
		for (int i = 0; i < 5; i++) {   //별 5개
			System.out.println("*****");
		}
		
		System.out.println("====================================");
		//==========================================
		
		//##########################################################
		
		
		
		// while (조건식) {
        //    조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;}
		
		int i = 0;

		while (i < 0) {

		    i++; // 이 부분을 삭제하면 무한 루프에 빠지게 됨.

		}

		System.out.println("while 문이 종료된 후 변수 i의 값은 " + i + "입니다.");
		
		
		System.out.println("====================================");
		//==========================================
		
		// 1. do / while 문은 먼저 실행하고자 하는 명령문을 한 번 실행한 후에 
		//    조건식을 검사합니다.
		// # 자바에서 do / while 문의 문법은 다음과 같습니다.
		// -문법-
		// do {
		//     조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문;(시작시 1번은 조건 없이 실행됨)
		// } while (조건식);
		
		int j = 0;
		
		do {

		    j++; // 이 부분을 삭제하면 무한 루프에 빠지게 됨.

		} while (j < 0);

		System.out.println("do / while 문이 종료된 후 변수 j의 값은 " + j + "입니다.");
		
		// while문 이었을 경우 j의 값은 0로 끝났을 것이다 하지만 do/while 값을 쓰면
		// j 값은 1로 끝난다 
		
		
		
		
		
		
	}

}
