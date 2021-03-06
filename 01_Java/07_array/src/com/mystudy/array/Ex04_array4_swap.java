package com.mystudy.array;

public class Ex04_array4_swap {

	public static void main(String[] args) {
		// 변수값 서로 교환하기
		int a = 100;
		int b = 200;
		System.out.println("교환 전 a : " + a);
		System.out.println("교환 전 b : " + b);
		
		System.out.println("-----------");
		//(실습) a 와 b의 값을 서로 교환하기
		int temp;
		temp = a; //a 값 복사본 만들기
		a = b;
		b = temp;
		
		System.out.println("교환 후 a : " + a);
		System.out.println("교환 후 b : " + b);
		System.out.println("교환 후 temp : " + temp);
		System.out.println("=====================");

		//            0    1    2    3    4
		int[] nums = {100, 200, 300, 400, 500, 600};
		System.out.println("배열의 크기 : " + nums.length);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		//저장된 값 교환하기 : 첫번째 <-> 마지막
		//nums[0] <---> nums[4] 교환
		//System.out.println("--- nums[0] <-> nums[4] 교환 ---");
		System.out.println("--- 첫번째 <-> 마지막 교환 ---");
		temp = nums[0];
		nums[0] = nums[nums.length - 1];
		nums[nums.length - 1] = temp;
		
		printArray(nums); //메소드 호출(실행)해서 화면출력
		
		//nums[1] <---> nums[3] 교환
		//System.out.println("--- nums[1] <-> nums[3] 교환 ---");
		System.out.println("--- 2번째 <-> 마지막 이전 교환 ---");
		temp = nums[1];
		nums[1] = nums[nums.length - 2];
		nums[nums.length - 2] = temp;
		printArray(nums); //메소드 호출(실행)해서 화면출력
		
		System.out.println();
		
		//=================================
		System.out.println("===배열의 데이터 갯수와 관계없이 데이터를 뒤집는 로직 작성===");
		//(개인적으로 실습)배열의 데이터 갯수와 관계없이 데이터를 뒤집는 로직 작성
		
		System.out.println();
		
		int[] abc = {10, 20, 30, 40, 50};
		
		System.out.println("배열의 크기 : " + abc.length);
		
		printArray(abc);
		
		int ll; // 값을 바꿔주기 위한 임의의 저장공간
		int kk = 1;
		
		for (int i = 0; i <= (abc.length / 2)-1; i++) {
			ll = abc[i];
			abc[i] = abc[abc.length-kk];
			abc[abc.length-kk] = ll;
			kk++;
		}
		
		printArray(abc);
		
		
		
		
		
		
		
		
		
		
		
	}//main 끝
	
	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
	
	

}// class 끝



