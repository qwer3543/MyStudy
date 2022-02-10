
public class Ex04_if_sungjuk {

	public static void main(String[] args) {
		// 성적처리
		// 국어(kor), 영어(eng), 수학(math)
		// 총점(tot) = 국어 + 영어 + 수학
		// 평균(avg) = 총점 / 3
		//------------------------
		// 평균점수의 구간에 따라 평가
		// 90 ~ 100 : A
		// 80 ~ 89 : B
		// 70 ~ 79 : C
		// 60 ~ 69 : D
		// 60미만(0~59) : F 재수강하세요
		//=============================
		/* 결과 출력
		국어 : 100
		영어 : 90
		수학 : 80
		---------
		총점 : 270
		평균 : 90
		평가결과 : A
		*/
		
		int kor = 8;   // -국어 (double로 써도 됨)
		int eng = 13;   // -영어
		int math = 90;  // -수학
		//--------------------------------
		int tot = 0;    // -총점
		int avg = 0;    // -평균
		String mm = ""; // -결과
		//--------------------------------
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("----------");
		tot = kor + eng + math;
		System.out.println("총점 : " + tot);
		avg = tot / 3;
		System.out.println("평균 : " + avg );
		//--------------------------------
		if (avg >= 90 && avg <= 100) {
			mm = "A";
		}else if (avg >= 80 && avg <= 89) {
			mm = "B";
		}else if (avg >= 70 && avg <= 79) {
			mm = "C";
		}else if (avg >= 60 && avg <= 69) {
			mm = "D";
		}else if (avg >= 0  && avg <= 59) {
			mm = "F";
		}else { mm = "재수강 하세요";} 
		//---------------------------------
		System.out.println("평가결과 : " + mm);
		
		
		
		
		
		
		
		
		
	}

}
