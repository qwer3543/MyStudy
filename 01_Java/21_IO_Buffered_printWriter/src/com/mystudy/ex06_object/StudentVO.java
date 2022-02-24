package com.mystudy.ex06_object;

import java.io.Serializable;

// 자바빈(JavaBean) 형태의 클래스로 작성
// VO(Value Object) : 값(데이터)을 저장하기 위한 클래스(객체) -xxxVO, xxxVo  
// DTO(Data Transfer Object) : 값(데이터)을 저장해서 전달하기 위한 클래스(객체)
//   xxxDTO, xxxDto
public class StudentVO implements Serializable {
	//필드(변수)선언 ------------------
	//성명 - name : String
	//국어 - kor : int
	//영어 - eng : int
	//수학 - math : int
	//총점 - tot : int
	//평균 - avg : double
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	//transient : 데이터 전송시 값 전달 제외
	transient private String phoneNo;
	
	//생성자 작성 ----------------------
	//생성자 - 성명, 국어, 영어, 수학 점수를 입력받는 생성자
	//(나중에) 총점, 평균 계산 처리 computeTotAvg() 사용
	public StudentVO(String name, int kor, int eng, int math) {
		super(); //부모클래스의 기본 생성자 호출(실행)
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}	

	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	//setter, getter 메소드 작성 ----------------------
	//(나중에) 국어, 영어, 수학 점수는 0~100 까지 값만 입력되도록 처리
	//(나중에) 국어, 영어, 수학 점수 변경되면 총점, 평균 재계산 처리
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
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if (eng >= 0 && eng <= 100) {
			this.eng = eng;
			computeTotAvg();
		} else {
			System.out.println("[데이터오류] 0~100 이 아님");
		}
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if (isDataOk(math)) {
			this.math = math;
			computeTotAvg();
		} else {
			System.out.println("[데이터오류] 0~100 이 아님");
		}
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	//총점, 평균 계산처리 메소드 
	private void computeTotAvg() {
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
	}	
	
	//=========================
	public void printData() {
		System.out.println(name + "\t" 
				+ kor + "\t" + eng + "\t" + math + "\t" 
				+ tot + "\t" + avg );
		
	}
	
	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
				+ ", avg=" + avg + ", phoneNo=" + phoneNo + "]";
	}

	private boolean isDataOk(int num) {
		if (num >= 0 && num <= 100) {
			return true;
		} else {
			return false;
		}
	}
}









