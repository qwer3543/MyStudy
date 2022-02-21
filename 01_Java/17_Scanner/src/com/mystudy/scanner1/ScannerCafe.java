package com.mystudy.scanner1;

import java.util.Scanner;

public class ScannerCafe {
	private Scanner scan = new Scanner(System.in);
	private final int AMERICANO = 3000;
	private final int CAFE_LATTE = 3500;
	private final int CAFE_MOCA = 4000;
	private final int JUICE = 5000;
	private int income = 0;
	private int totMoney = 0; //메뉴당 판매액 = 단가 * 수량;
	private int inMoney; //고객이 낸 금액
	private int change; //계산 후 잔액(거스름 돈)
	
	public void caffeOpen() {
		while (true) {
			showMenu();
			int select = scan.nextInt();
			if (select == 0) {
				System.out.println(">>>>> 영업을 종료합니다~~~");
				System.out.println(":::: 오늘 판매총액 : " + income);
				break;
			}
			System.out.print("> 주문수량(개) : ");
			int count = scan.nextInt();
			
			System.out.print("> 입금액(원) : ");
			inMoney = scan.nextInt();
		
			totMoney = computeMoney(select, count);
			
			//잔액 계산
			change = inMoney - totMoney;
			income += totMoney; //총 매출액 구하기
			
			displayResult();
		}
	}

	private void displayResult() {
		//계산결과 출력 ---------
		System.out.println("=========");
		System.out.println("입금액 : " + inMoney);
		System.out.println("판매액: " + totMoney);
		System.out.println("잔액: " + change);
		System.out.println();
	}

	private int computeMoney(int select, int count) {
		int result = 0;
		switch (select) {
			case 1: result = AMERICANO * count; break;
			case 2: result = CAFE_LATTE * count; break;
			case 3: result = CAFE_MOCA * count; break;
			case 4: result = JUICE * count; break;
		}
		return result;
	}

	private void showMenu() {
		System.out.println("1.아메리카노   2.카페라떼   3.카페모카    4.과일주스   0.종료");
		System.out.print("> 메뉴를 선택하세요(1~4): ");
	}
}
