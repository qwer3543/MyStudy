package com.mystudy.array;

public class SungjukManagerExam {

	public static void main(String[] args) {
		// 2차워 배열 사용한 성적 처리
		
		// 국어,영어,수학 점수 3개를 저장한 2차원 배열(sungjuk) 만들기
		
		// 성적을 입력하고 개인별 총점과 평균을 계산하여 화면에 데이터 출력
		
		//  국어 \t 영어  수학   총점    평균    [타이틀]
		//  100    90  80  271  90.0
		//  100    90  81  272  90.33
		//  100    90  80  271  90.0
		System.out.println("국어\t영어\t수학\t총점\t평균");
		
		int[][] sungjuk = { {100, 90, 80},
							{100, 90, 81},
							{100, 90, 80} };
		Float f = 0.0f;
		Integer tp = 0;
		
		
		for (int i = 0; i < sungjuk.length; i++) {
			for(int k = 0; k < sungjuk.length; k++) {
				
				tp = tp + sungjuk[i][k];
				
			}
			f = tp.floatValue();
			f = f / 3;
			System.out.print(sungjuk[i][0] + "\t" +
					 sungjuk[i][1] + "\t" +
					 sungjuk[i][2] + "\t" +
					 tp + "\t" + f);
			tp = 0;
			f = 0.0f;
			System.out.println();
		}
		
		
		
		//==========================================
		System.out.println("=== 선생님 풀이 ===");
		
		int[][] jjj = { {100, 90, 80},
						{100, 90, 81},
						{95, 85, 77} };
		
		int kor = 0; // jjj[0][0] 국어 점수 영역
		int eng = 0; // 영어
		int math = 0; // 수학
		int tot = 0; // 총점
		double avg = 0; // 평균
		
		
		
		System.out.println("첫번째 사람 데이터 처리");
		
		kor = jjj[0][0];
		eng = jjj[0][1];
		math = jjj[0][2];
		
		// 계산처리
		
		tot = kor + eng + math;
		//System.out.println(tot);
		
		avg = tot * 100 / 3 / 100.0;
		//System.out.println(avg);
		
		// 출력
		System.out.println(kor + "\t" + eng +
						   "\t" + math + "\t" + 
				           tot + "\t" + avg);
		
		System.out.println(" 반복문으로 풀기 ");
		//====================================\
		System.out.println("===============================");
		
		System.out.println("국어\t영어\t수학\t총점\t평균");
		
		
		for (int i = 0; i < jjj.length; i++) {
			kor = jjj[i][0];
			eng = jjj[i][1];
			math = jjj[i][2];
			tot = kor + eng + math;
			avg = tot * 100 / 3 / 100.0;
			System.out.println(kor + "\t" + eng +
					   "\t" + math + "\t" + 
			           tot + "\t" + avg);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
