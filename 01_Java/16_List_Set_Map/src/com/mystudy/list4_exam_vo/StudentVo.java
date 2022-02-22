package com.mystudy.list4_exam_vo;


public class StudentVo {
	
	//=== 전역 변수
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private int avg;
	
	//=== 생성자 영역
	
	public StudentVo(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		calculation(); // 입력받고 바로 총합, 평균 계산
	}
	
	//=== 메소드 get / set
	
	// ]> 이름
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	// ]> 국어
	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;
			calculation(); // 입력받고 바로 총합, 평균 계산
		} else {
			System.out.println("입력 오류");
		}
		
	}

	// ]> 영어
	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		if (eng >= 0 && eng <= 100) {
			this.eng = eng;
			calculation(); // 입력받고 바로 총합, 평균 계산
		} else {
			System.out.println("입력 오류");
		}
	}

	// ]> 수학
	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		if (math >= 0 && math <= 100) {
			this.math = math;
			calculation(); // 입력받고 바로 총합, 평균 계산
		} else {
			System.out.println("입력 오류");
		}
	}

	// ]> 총합
	public int getTot() {
		return tot;
	}

	// ]> 평균
	public int getAvg() {
		return avg;
	}
	
	// ]> 총합, 평균 다른 곳에서 값 수정 X
	private void calculation() {
		tot = kor + eng + math;
		avg = (int) (tot * 100 / 3 / 100.0);
	}
	
	// toString 만들기
	@Override
	public String toString() {
		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot
				+ "\t" + avg;
	}
	
	
	

}
