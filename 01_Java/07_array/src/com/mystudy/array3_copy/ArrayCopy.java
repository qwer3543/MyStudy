package com.mystudy.array3_copy;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열의 복사 
		
		int[] num1 = new int[5];
		int[] num2 = new int[5]; // num1과 num2가 다른 배열이다
		//int[] num2 = num1; // num1과 num2가 공유되는 배열이다
		
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		num1[3] = 40;
		num1[4] = 50;
		
		printData(num1);
		printData(num2);
		
		System.out.println();
		
		
		
		
		System.out.println("======== 배열(앝은 복사) =========");
		
		num2 = num1; // 복사
		
		num1[0] = 99999; // -> num1값을 바꾸었지만 공유된 num2의 값도 변경됨
		
		printData("num1" , num1);
		printData("num1" , num2);
		
		System.out.println("[같은 배열로 인식]" + (num1 == num2)); // [같은 배열로 인식]
		
		System.out.println();
		
		
		
		
		System.out.println("========= 배열(깊은 복사) ========");
		
		int[] num3 = new int[5];
		printData("num3" , num3);
		
		for (int i = 0; i < num3.length; i++) {
			num3[i] = num1[i];
		}
		printData("num3" , num3);
		
		System.out.println("[독립된 배열로 인식]" + (num1 == num3)); // [독립된 배열로 인식]
		
		System.out.println();
		
		
		
		
		
		
		System.out.println("== (깊은 복사) 단축키 ==");
		
		// 1]
		int[] num4 = new int[num1.length];
		printData("num4" , num4);
		
		//System.arraycopy(src, srcPos, dest, destPos, length);
		//System.arraycopy(소스객체, 시작위치, 타겟객체, 대상시작위치, 갯수);
		System.arraycopy(num1, 0, num4, 0, num1.length);
		
		printData("num4" , num4);
		
		System.out.println("[독립된 배열로 인식]" + (num1 == num3));
		
		System.out.println();
		
		
		
		
		
		System.out.println("=== 배열객체.clone() 복사 ===");
		
		// 2]
		int[] num5 = num4.clone();
		
		printData("num5" , num5);
		
		System.out.println("[독립된 배열로 인식]" + (num5 == num4));
		
		
		
		
	}
	
	static void printData(int[] num) { //원본 데이터 가져오기
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();

	}
	
	static void printData(String name, int[] num) { //원본 데이터 가져오기
		System.out.print(name + " : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();

	}
}