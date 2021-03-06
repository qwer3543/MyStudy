package com.mystudy.array4_2dim;

public class ArrayTwoDimesion {

	public static void main(String[] args) {
		
		// 2차원 배열 선언 및 객체 생성
		
		// [같은 변수 탑입으로 묶어야 한다 int면  int 타입]
		// 타입[][] 변수명 = new 타입[크기값][크기값];
		// 타입 변수명 [][] = new 타입[크기값][크기값];
		// 타입[][] 변수명 = { {0층 배열}, {1층 배열}, {2층 배열} };
		
		// int[] nums = {100,200,300}; //  기존 1차원 배열
		
		// 2차원 배열
		int[][] nums = { {10, 20},    // 10 -> nums[0][0]
				         {30, 40},    // 40 -> nums[1][1]
				         {50, 60}, 
				         {70, 80},
				         {90, 100, 200} }; // 90 -> nums[4][0]
		
	//  2차원 배열은 []하나만으론 접근 할수 없다
	//	System.out.println("nums[0] : " + nums[0]); 
				
		System.out.println("nums[0][0] : " + nums[0][0]); 
		
		System.out.println("==============배열 출력==============");
		
		//배열 모두 출력
		
		// {10, 20}
		System.out.println("nums[0][0] : " + nums[0][0]);
		System.out.println("nums[0][1] : " + nums[0][1]);
		System.out.println();
		
		// {30, 40}
		System.out.println("nums[1][0] : " + nums[1][0]);
		System.out.println("nums[1][1] : " + nums[1][1]);
		System.out.println();
		
		System.out.println("===============반복문==============");
		
		// 반복문 써보기
		
		// 1]줄
		for (int i = 0; i < 2; i++) {
			System.out.print(nums[0][i] + " ");
		}
		System.out.println();
		
		// 2]줄
		for (int i = 0; i < 2; i++) {
			System.out.print(nums[1][i] + " ");
		}
		System.out.println();
		
		System.out.println("==========length 값 써보기============");
		
		System.out.println("nums.length" + nums.length); // 배열의 층수를 알수있다
		
		System.out.println("nums[0].length" + nums[0].length); // 배열의 갯수을 알수있다
		System.out.println("nums[4].length" + nums[4].length); 
		
		System.out.println("==========length 반복문============");
		
		// 1]줄
		for (int i = 0; i < nums[0].length; i++) {
			System.out.print(nums[0][i] + " ");
		}
		System.out.println();
		
		// 2]줄
		for (int i = 0; i < nums[1].length; i++) {
			System.out.print(nums[1][i] + " ");
		}
		System.out.println();
				
				
		System.out.println("==========2중 반복문============");		
				
				
		for (int k = 0; k < nums.length; k++) {   // nums.length값으로 몇번 반복할지 알수있다
			for (int i = 0; i < nums[k].length; i++) { // nums[k].length 각 층의 배열 수만큼 반복한다
				System.out.print(nums[k][i] + " ");
			}
			System.out.println();
		}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	}

}
