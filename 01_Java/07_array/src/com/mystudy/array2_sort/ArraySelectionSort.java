package com.mystudy.array2_sort;

import java.util.Arrays;

public class ArraySelectionSort {

	public static void main(String[] args) {
		/* 배열 숫자 데이터 정렬(오름차순: ASC, 내림차순: DSC)
		   
		 */
		 //          0   1   2   3   4
		Integer num[] = {30, 20, 50, 40, 10};
		//int[] nums = num; // 좌표 값을 공유한다는 뜻으로 값이 같이 바뀐다
		//int[] nums = num.clone(); // 재사용을 위한 복사본 만들기 값은 따로 따로
		
		// 데이터 확인 
		
		System.out.println("=== num의 원본 데이터 ===");
		
		//printData(num);
		
		//System.out.println("=== nums의 원본 데이터 ===");
		
		
		//printData(num);
		
		System.out.println("=== 정렬 시작 ===");
		// 첫번째 값 기준으로 비교작업
		
		int kkk; // 교환용 저장공간
		
		for (int i = 0; i <= num.length-1; i++) {
			for (int j = 0 ; j <= num.length-1 ; j++ ) {
				if (num[j] > num[i]) {
					kkk = num[i];
					num[i] = num[j];
					num[j] = kkk;
				}		
			}
				
		}
		printData(num);
		
		//=======================================================
		for (int i = 0; i <= 4; i++) {
			for (int j = 0 ; j <= 4; j++ ) {
				if (num[j] < num[i]) {
					kkk = num[i];
					num[i] = num[j];
					num[j] = kkk;
				}		
			}
				
		}
		printData(num);
		
		System.out.println("=========정렬 2=========");
		//===============================================
		
		Integer nums[] = {30, 20, 50, 40, 10}; 
		// 단축키 쓰고싶으면 객체로 정이 해야한다 int -> Integer
		
		printData(nums);
		
		Arrays.sort(nums); // 오름차순
		//Arrays.sort(nums,Collections.reverseOrder()); // 정렬 단축 코드(내림차순)
		
		System.out.println("=========정렬 후=========");
		
		printData(nums);
		
		
		
		
	}
	// 단축키 쓰고싶으면 객체로 정이 해야한다 int -> Integer
	static void printData(Integer num[]) { 
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}

}
