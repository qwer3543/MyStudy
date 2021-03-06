package com.mystudy.array;

public class Ex01_array1 {

	public static void main(String[] args) {
		//배열(array) : 동일한 데이터 타입들의 연속된 저장 공간
		//배열의 선언 : 자료형[] 변수명
		//변수에 값 저장 : 배열변수명[인덱스번호] = 값;
		/* 배열의 선언 및 생성
		1. 자료형[] 변수명 = new 자료형[갯수];
		      자료형 변수명[] = new 자료형[갯수];
		2. 자료형[] 변수명 = new 자료형[] {값1, 값2, 값3, ..., 값n};
		3. 자료형[] 변수명 = {값1, 값2, 값3, ..., 값n}; //n개의 저장공간 생성 + 데이터입력
		*/
		int[] arr = new int[6]; //int 타입값 6개 저장할 수 있는 배열 arr 선언 
		//int arr[] = new int[6];
		System.out.println("arr : " + arr);
		arr[0] = 100; //배열의 첫번째 위치(인덱스번호 0번)에 100 설정(저장)
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		arr[1] = 200; //두번째
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		arr[5] = 600; //마지막 데이터(크기 - 1)
		//arr[6] = 700; //ArrayIndexOutOfBoundsException
		//System.out.println("arr[6] : " + arr[6]);
		
		int sum = 0;
		sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4] + arr[5];
		System.out.println("sum : " + sum);
		
		System.out.println("------------");
		//     인덱스시작값      배열의 크기값(보다 작은 동안)
		for (int i = 0; i < 6; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		sum = 0;
		for (int idx = 0; idx < 6; idx++) {
			sum = sum + arr[idx];
		}
		System.out.println("for sum : " + sum);
		System.out.println("----------------");
		
		//배열의 크기값 확인(조회)
		System.out.println("arr.length : " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		//============================
		//2. 자료형[] 변수명 = new 자료형[] {값1, 값2, 값3, ..., 값n};
		System.out.println("=== 배열선언 형태 2번 ===");
		//                     0    1    2    3    4 : 인덱스 번호
		int[] num = new int[] {100, 101, 102, 103, 104};
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		//3. 자료형[] 변수명 = {값1, 값2, 값3, ..., 값n}; //n개의 저장공간 생성 + 데이터입력
		System.out.println("=== 배열선언 형태 3번 ===");
		int[] arr3 = {10, 11, 12, 13, 14, 15};
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
		//================================
		System.out.println("=======배열 값 자동으로 넣기=======");
		
		int[] nums = new int[10];
		//초기값 설정
		
		int qwe = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[qwe] = qwe + 1;
			qwe++;
		}
		//배열값 확인
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		System.out.println("==== 영어 알파벳 저장 출력(A~Z) ====");
		char[] ch = new char[26];
		ch[0] = 'A'; //65
		System.out.println("ch[0] : " + ch[0]);
		ch[1] = 'B'; //65 + 1 --> 66
		System.out.println("ch[1] : " + ch[1]);
		ch[2] = 'B' + 1; //66 + 1 --> 67
		System.out.println("ch[2] : " + ch[2]);
		System.out.println("------------");
		
		ch[0] = 'A' + 0; //A
		ch[1] = 'A' + 1; //B
		ch[2] = 'A' + 2; //C
		ch[3] = 'A' + 3; //D
		System.out.println("ch[3] : " + ch[3]);
		
		//데이터 A~Z 일괄입력 
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) ('A' + i); // int 타입으로 강제형변환 후 저장
		}
		
		//배열에 저장된 값 출력
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();
	}

}










