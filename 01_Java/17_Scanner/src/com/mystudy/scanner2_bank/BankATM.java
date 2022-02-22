package com.mystudy.scanner2_bank;

import java.util.Scanner;

//[실습] 은행의 ATM
// 1.입금   2.출금   3.통장확인    0.종료
public class BankATM {
	private int money; // 통장계좌(금액)
	private Scanner scan = new Scanner(System.in);
	private final String LINE = "---------------------------";
	private final String MENU = "1.입금  2.출금  3.통장확인   0.종료";
	
	public void startBank() {
		System.out.println(">>> 어서오세요(ATM기 사용)");
		while (true) {
			if (!isRunningATM()) {
				break;
			}
		}
		System.out.println(">> ATM 사용을 종료했습니다.");
	}
	
	private boolean isRunningATM() {
		boolean isContinue = true;
		
		showMenu();
		int select = -1;
		try {
			select = scan.nextInt();
		} catch (Exception e) {
			System.out.println("[예외발생] 잘못된 값이 입력되었습니다. "
					+ "메뉴(0~3) 숫자만 선택하세요.");
		}
		scan.nextLine();
		
		if (select == 0) {
			isContinue = false;
		} else {
			processJob(select);
		}
		return isContinue;
	}
	
	private void processJob(int select) {
		if (select == 1) {
			//System.out.println("입금 작업 처리~~");
			inputMoney();
			showMoney();
		} else if (select == 2) {
			//System.out.println("출금 작업 처리~~");
			outputMoney();
			showMoney();
		} else if (select == 3) {
			//System.out.println("통장 확인 처리~~");
			showMoney();
		} else {
			System.out.println("[안내] 메뉴(0~3) 숫자만 선택하세요");
		}
	}

	//출금처리
	private void outputMoney() {
		while (true) {
			System.out.print(">>출금액 : ");
			try {
				money -= Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("[예외발생] 잘못된 값이 입력되었습니다."
						+ "숫자(0~9)만 입력하세요.\n"
						+ "다시 입력하세요~");
				continue;
			}
			break;
		}
	}

	private void showMoney() {
		System.out.println(":: 통장잔액 : " + money);
	}

	//입금 처리
	private void inputMoney() {
		//System.out.println("입금 작업 처리~~");
		while (true) {
			System.out.print(">>입금액 : ");
			try {
				money += Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("[예외발생] 잘못된 값이 입력되었습니다."
						+ "숫자(0~9)만 입력하세요.\n"
						+ "다시 입력하세요~");
				continue;
			}
			break;
		}
	}

	//메뉴 표시 메소드
	private void showMenu() {
		System.out.println(LINE);
		System.out.println(MENU);
		System.out.println(LINE);
		System.out.print(">>작업선택 : ");
	}
	
	
}



/* *********************
>> 어서오세요
----------------------------------
1.입금  2.출금  3.통장확인  0.종료
----------------------------------
>>작업선택 : 1
>>입금액 : 10000
::통장금액 : 10000원

----------------------------------
1.입금  2.출금  3.통장확인  0.종료
----------------------------------
>>작업선택 : 2
>>출금액 : 5000
::통장금액 : 5000원

----------------------------------
1.입금  2.출금  3.통장확인  0.종료
----------------------------------
>>작업선택 : 3
::통장금액 : 5000원

----------------------------------
1.입금  2.출금  3.통장확인  0.종료
----------------------------------
>>작업선택 : 0
>>작업을 종료했습니다.
******************************/