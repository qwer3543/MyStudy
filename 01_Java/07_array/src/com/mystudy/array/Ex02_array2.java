
package com.mystudy.array;

public class Ex02_array2 {

	public static void main(String[] args) {
		// 1~10까지의 수를 배열에 저장(저장할때 반복문사용)

		int[] qwer = new int[10];

		for (int i = 0; i < qwer.length; i++) {
			qwer[i] = 1 + i;
			System.out.println("qwer[" + i + "] : " + qwer[i]);
		}
		
		System.out.println("==============방법 1===============");
		
		// 1~10 까지의 수중 홀수의 합 (배열)
		// 저장공간(odd) 5개 만 있다 해서 먼저 홀수값을 구하고 배열에 넣기(반복문 사용)
	
		// 마지막으로 배열에 저장된 값을 모두 합하여 출력

		int[] odd = new int[5];
		int k = 0;
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				odd[k] = i;
				sum += odd[k];
				k++;
			}
		}
		System.out.println(sum);
		
		System.out.println("==============방법 2===============");
		
		sum = 0;
		
		for (int i = 0; i < odd.length; i++ ) {
			odd[i] = 1 + (2 * i);
			sum += odd[i];
		}
		System.out.println(sum);
		
		System.out.println("==============10개 저장공간중 홀수, 짝수만 합하여 구하라==============");
		
		// 1~10 까지의 수중 짝수, 홀수 합 (배열)
				// 저장공간(odd) 10개 중
				// 홀수값을,짝수값을  각자 따로 합산하여 출력한다(반복문 사용)
		
		int aaa = 0; // 짝수
		int ddd = 0; // 홀수
		
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				aaa += num[i];
			} else {
				ddd += num[i];
			}
		}
		
		System.out.println("짝수의 합 " + aaa);
		
		System.out.println("홀수의 합 " + ddd);
		
		System.out.println("===============================");
		
		
		
		
	}

}
