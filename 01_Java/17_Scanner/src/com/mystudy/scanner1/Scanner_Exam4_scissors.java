package com.mystudy.scanner1;

import java.util.Scanner;

public class Scanner_Exam4_scissors {

	public static void main(String[] args) {
		/* Scanner를 이용한 가위, 바위 , 보 게임 *******
		컴퓨터와 함께하는 가위,바위,보 게임
		0. 컴퓨터가 가위(1),바위(2),보(3) 선택(Math.random())
		1. 1.가위, 2.바위, 3.보   0.종료   선택 메뉴 출력 
		2. 선택값 입력
		3. 결과 비교 후 승자, 패자 결정
		(반복) 게임 반복 진행 - 0 선택시 종료 처리
		=============================== */
		Scanner in = new Scanner(System.in);
		//-------------------------------------------- 컴퓨터
		
		int com = 0;
		
		while (true) {
			com =(int)(Math.random() * 3 + 1);
			
			//-------------------------------------------- 인간
			
			System.out.println("1.가위, 2.바위, 3.보   0.종료");
			
			System.out.print("> 당신의 선택 : ");
			int me = in.nextInt();
			System.out.print("> 컴퓨터 선택 : " + com);
			System.out.println();
			//--------------------------------------------- 비교
			if (me == 0) {
				System.out.println("종료"); break;
			}
			
			switch (me) {
			
			// 
			case 1: if (me == com) {
						System.out.println("비겼습니다");
					}else if (me == 1 && com == 2) {
							System.out.println("패배");
					}else if (me == 1 && com == 3) {
								System.out.println("승리");
					}
						
					
					break;
			// 		
			case 2: if (me == com) {
						System.out.println("비겼습니다");
						if (me == 2 && com == 3) {
							System.out.println("패배");
							if (me == 2 && com == 1) {
								System.out.println("승리");
							}
						}
					}
					break;
			// 
			case 3: if (me == com) {
						System.out.println("비겼습니다");
						if (me == 3 && com == 1) {
							System.out.println("패배");
							if (me == 3 && com == 2) {
								System.out.println("승리");
							}
						}
					}
					break;
			default:
				System.out.println("잘못 입력"); break;
			
			}	
			System.out.println("=============");
		}
		
		
		
	
		
	}

}
/*
1.가위, 2.바위, 3.보   0.종료 
> 당신의 선택 : 1
결과 : 비겼습니다

1.가위, 2.바위, 3.보   0.종료 
> 당신의 선택 : 1
결과 : 내가 이겼다, 컴퓨터 패!
*/