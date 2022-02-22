package com.mystudy.scanner1;

import java.util.Scanner;

public class Scanner_Exam3_caffe {

	public static void main(String[] args) {
		//음료의 종류 : 
		//1.아메리카노   2.카페라떼   3.카페모카    4.과일주스
		// 3000      3500     4000     5000
		//-------------------------------------
		// 입력값 : 메뉴번호, 주문수량, 입금액(고객이 낸 돈)
		// 출력값 : 입금액, 판매액(단가 * 수량), 잔돈(입금액 - 판매액)
		//----------------------------------------
		/*
		while (true) {
			1.아메리카노   2.카페라떼   3.카페모카    4.과일주스   0.종료
			> 메뉴를 선택하세요(1~4): 1
			> 주문수량 : 3
			> 입금액 : 10000
			===============
			입금액 : 10000
			판매액 : 9000
			잔돈 : 1000
		}
		*/
		Scanner scan = new Scanner(System.in);
		
		
		int aaa = 0; // 단가
		int lll = 0; // 계산
		
		int today = 0; // 오늘 판매 가격
		
		while (true) {
			System.out.println("1.아메리카노   2.카페라떼   3.카페모카   4.과일주스   0.종료");
			System.out.print("> 메뉴를 선택하세요(1~4): ");
			int k1 = scan.nextInt(); // 메뉴 선택
			if (k1 == 0) {
				System.out.println("# 실행 종료 #"); 
				System.out.println("금일 판매 가격: " + today);
				break;
			}
			System.out.print("> 주문수량 : ");
			int sou = scan.nextInt();
			System.out.print("> 입금액 : ");
			int mmm = scan.nextInt();
			System.out.println("--------------");
			System.out.println("> 입금액 : " + mmm);
			
			switch (k1) {
			// 아메리카노
			case 1: aaa = 3000 * sou;
					today += aaa;
					lll = mmm - aaa;
					break;
			// 카페라떼		
			case 2: aaa = 3500 * sou;
					today += aaa;
					lll = mmm - aaa;
					break;
			// 카페모카
			case 3: aaa = 4000 * sou;
					today += aaa;
					lll = mmm - aaa;
					break;
			// 과일주스
			case 4: aaa = 5000 * sou;
					today += aaa;
					lll = mmm - aaa;
					break;
			default:
					System.out.println("메뉴 잘못 입력"); break;
			}
			System.out.print("> 판매액 : " + aaa);
			System.out.println("> 잔돈 : " + lll);
			System.out.println();
		}
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
