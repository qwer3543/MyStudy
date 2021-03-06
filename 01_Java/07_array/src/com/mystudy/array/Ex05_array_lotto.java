package com.mystudy.array;

public class Ex05_array_lotto {

	public static void main(String[] args) {
		
		/* 로또 번호 생성기
		// 1] int 타입의 숫자 45개 저장할수 있는 배열 선언(balls)
		// 2] 초기화: 1 ~ 45 까지의 숫자를 배열에 저장
		// 3] 많이 섞고
		// 4] 6개 번호를 추출(앞에서 부터 6개)
		// 5] 정렬하여 비교
		*/ 
		
		// 1]>
		int[] balls = new int[45];
	
		// 2]>
		for (int i = 0 ; i < balls.length ; i++ ) {
			balls[i] = i + 1;	
			System.out.print(balls[i] + " ");
		}
		System.out.println();
		
		// 섞기 방법
		
		// 첫번째 숫자와 임의의 위치에 있는 숫자를 교환
		// Math.random: 0.0000 ~ 0.9999999999... (0.0 <= 값 < 1)
		// (int)(Math.random() * 45): 0 ~ 44 까지으 숫자 램덤하게 생성
		//System.out.println((int)(Math.random() * 45));
		
		System.out.println("======== Math.random() ========");
		
		// 3]>
		int temp; // 빽업용 저장공간
		
		for (int i = 1; i <= 10000; i++) {
			int rNum = (int)(Math.random() * 45);
			temp = balls[0];
			balls[0] = balls[rNum];
			balls[rNum] = temp;	
		}
		
		// 4]>
		for (int i = 0 ; i <= 5 ; i++ ) {
			System.out.print(balls[i] + " ");
		}
		System.out.println();
		
		// 5]> 정렬 하여 출력하기 ??
		
		for (int i = 0 ;i <= 6 ; i++ ) { 
			
		}		
		
		
		
	}
	

	
	
}
