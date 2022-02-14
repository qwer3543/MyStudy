package com.mystudy.bean_vo;

/*
    자바빈(JavaBean) 형태의 클래슬 작성
  Vo(Vaiue Object) : 값(데이터)을 저장하기 위한 클래스(객체) -xxxVo, xxxVo
  DTO(Data Transfer Object) : 값(데이터)을 저장해서 전달하기 위한 클래스(객체)
  xxxDTO, xxxDto
 */
public class StudentVo {
	// 필드선언================
	
	// 성명 - name : String
	// 국어 - Kor : int
	// 영어 - eng : int
	// 수학 - math : int
	// 총점 - tot : int
	// 평균 - avg : double
	                     // private 이란 현제 클래스 에서만 사용 한다는 뜻
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	// 생성자 작성==============
	
	// 생성자 - 성명, 국어, 영어, 수학 점수를 입력받는 생성자
	// 총점, 평균 계산 저리 computeTotAvg() 사용
	
	public StudentVo(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}
	
	public StudentVo(String name) {
		;
		
	}
	
	// setter[외부에서 입력한 값을 적용한다], getter[값을 보낸다] 메소드 작성==============
	
	// 국어, 영어, 수학 점수 변경되면 총점, 평균 재계산 처리
	// 국어, 영어, 수학 점수는 0~100 까지만 값이 입력되도록 처리

	// 이름----------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// 국어----------
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;
			computeTotAvg();
		} else {
			System.out.println("입력 오류");
		}
	}
	
	// 영어
	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if (eng >= 0 && eng <= 100) {
			this.eng = eng;
			computeTotAvg();
		} else {
			System.out.println("입력 오류");
		}
	}
	
	// 수학
	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if (math >= 0 && math <= 100) {
			this.math = math;
			computeTotAvg();
		} else {
			System.out.println("입력 오류");
		}
	}
	
	// 총합
	public int getTot() {
		return tot;
	}
	
	// 평균 
	public double getAvg() {
		return avg;
	}
	
	// 총점, 평군 계산 메소드
	private void computeTotAvg() {
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
	}
	
	// toString() 작성=====================
	
	@Override
	public String toString() {
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot
				+ "\t" + avg;
	}
	
}
