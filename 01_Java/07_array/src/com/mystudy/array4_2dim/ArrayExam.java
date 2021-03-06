package com.mystudy.array4_2dim;

import java.util.Arrays;

public class ArrayExam {
	
	// 인터프린터? 구역
	
	// 전역 변수

	public static void main(String[] args) {
		
		/* 배열 문제
		   문제1: int 타입의 데이터 3개를 저장할수 있는 배열(num1)
		   1. 10, 20, 30 숫자를 입력하고 화면 출력
		   2. 세번째 대이터(30을) 100으로 바꾸고 화면 출력
		 */
		System.out.println("===== 1번 문제 =====");
		
		int[] num1 = {10, 20, 30};
		
		// 단축키
		System.out.println(Arrays.toString(num1)); // 대괄호 안에 문자 형식으로 출력 된다
		
		asd(num1);
		
		System.out.println("=값 바꿈="); // num1[2] = 100; 이걸 써도 됨 
		
		int p = 100; // 빈 저장공간
		
		for (int i = 0; i < num1.length; i++) {
			if( i == 2) {
				num1[i] = p;	
			}
			System.out.print(num1[i] + " ");
		}
		System.out.println();
		
		
		
		/* 배열문제
		  문제2: num1과 크기가 같은 배열 num1 Copy를 만들고
		  num1 Copy에 num1 데이터를 복사하고 화면 출력
		  (번외) 깊은 복사인지 앝은 복사인지 확인 하기
		 */
		System.out.println("===== 2번 문제 =====");
		
		int[] num1Copy = new int[num1.length];
		
		System.arraycopy(num1, 0, num1Copy, 0, num1.length);
		
		//1]
		asd("num1:", num1);
		
		//2]
		asd("num1Copy:", num1Copy);
		
		System.out.println("[독립된 배열로 인식]" + (num1 == num1Copy));
		
		
		/* 배열문제
		  문제3: 2차원 배열을 사용하여
		  int[][] num2dim = { {10, 20}, {30, 40}, {50, 60} };
		  Q1. 2차원 배열인 num2dim 값을 화면 출력: 10 20 30...
		  Q2. num2dim 의 세번째 값인 30을 100으로 변경하고 화면 출력
		  Q3. num2dim 의 크기만큼 num2 Copy 배열 선언 하고
		      num2dim ---> num2 Copy 데이터 복사 후 화면 출력
		 */
		System.out.println("===== 3번 문제 =====");
		
		int[][] num2dim = { {10, 20}, 
						    {30, 40},
						    {50, 60} };
		
		for (int k = 0; k < num2dim.length; k++) {
			for (int i = 0; i < num2dim[k].length; i++) {
				System.out.print(num2dim[k][i] + " ");
			}
			System.out.println();
		}
		System.out.println("=값 바꿈=");
		
		p = 100;
		
		for (int k = 0; k < num2dim.length; k++) {
			for (int i = 0; i < num2dim[k].length; i++) {
				if(k == 1 && i == 0) {
					num2dim[k][i] = p;
				}
				System.out.print(num2dim[k][i] + " ");
			}
			System.out.println();
		}
		
		System.out.println("= 카피 확인 =");
		
		int[][] num2Copy = num2dim.clone();
		
		// 1]
		for (int k = 0; k < num2dim.length; k++) {
			for (int i = 0; i < num2dim[k].length; i++) {
				System.out.print(num2dim[k][i] + " ");
			}
			System.out.println(); 
		}
		
		System.out.println("--------");
		
		// 2]
		for (int k = 0; k < num2Copy.length; k++) {
			for (int i = 0; i < num2Copy[k].length; i++) {
				System.out.print(num2Copy[k][i] + " ");
			}
			System.out.println();
		}
		
		// 확인 해보기
		
		System.out.println("[2차원 배열은 독입적 인식/ 하지만 1차원 배열은 같은 주소을 가지고 있다 ]" + (num2dim == num2Copy));
		
		System.out.println(Arrays.toString(num2dim));  // 둘의 주소값은 같은곳을 가지고 있다
		System.out.println(Arrays.toString(num2Copy)); 
		
		System.out.println(" 1차원 배열까지 클론처리 해야함");
		
		
		for (int i = 0; i < num2Copy.length ; i++) {
			num2Copy[i] = num2dim[i].clone();
		}
		
		System.out.println(Arrays.toString(num2dim));  
		System.out.println(Arrays.toString(num2Copy));
		
		
		
		
	} // --------
	// 메소드 구역
	
	static void asd(int[] qwe) {
		
		for (int i = 0; i < qwe.length; i++) {
			System.out.print(qwe[i] + " ");
		}
		System.out.println();
	}
	
	// 메소드 오버로딩
	static void asd(String name, int[] qwe) {
		System.out.print(name + " ");
		for (int i = 0; i < qwe.length; i++) {
			System.out.print(qwe[i] + " ");
		}
		System.out.println();
	}

}
