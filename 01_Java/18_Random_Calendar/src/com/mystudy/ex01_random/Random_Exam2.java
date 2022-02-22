package com.mystudy.ex01_random;

import java.util.Random;

public class Random_Exam2 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		System.out.println("=== nextInt ===");
		
		for (int i = 0; i < 30; i++) {
			int ranint = ran.nextInt(5); // nextInt(5) => 0~4까지 랜덤으로 나옴
			//int ranint = ran.nextInt(5) + 1; // nextInt(5) + 1 => 1~5까지 랜덤으로 나옴
			System.out.print(ranint + " ");
		}
		System.out.println();
		
		System.out.println("=======================");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(ran.nextDouble() + " - Random nextDouble()");
			System.out.println(Math.random() + " - Math.random()");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
