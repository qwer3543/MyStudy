package com.mystudy.map2_exam_vo;

public class StudentVO {
	
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	int avg;
	
	public StudentVO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		totavg();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
			return kor;
		
	}

	public void setKor(int kor) {
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;
			totavg();
		} else {
			System.out.println("잘못된 정보 입력");
		}
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if (eng >= 0 && eng <= 100) {
			this.eng = eng;
			totavg();
		} else {
			System.out.println("잘못된 정보 입력");
		}
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if (math >= 0 && math <= 100) {
			this.math = math;
			totavg();
		} else {
			System.out.println("잘못된 정보 입력");
		}
	}

	public int getTot() {
		return tot;
	}

	public int getAvg() {
		return avg;
	}
	
	private void totavg() {
		tot = kor + eng + math;
		avg = (int) (tot * 100 / 3 / 100.0);
	}

//	@Override
//	public String toString() {
//		return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + tot
//				+ "\t" + avg;
//	}
	
	
	
}
