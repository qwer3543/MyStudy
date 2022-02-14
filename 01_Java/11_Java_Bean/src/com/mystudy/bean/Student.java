package com.mystudy.bean;

/*
자바빈(JavaBean)
- 멤버변수(property)의 접근제한자(제어자)는 private으로 선언
- 멤버변수(property) 마다 get/set 메소드 제공(선택적으로 get만 제공)
- get/set 메소드는 public 으로 선언
- get 메소드는 파라미터 없고, set 메소드는 하나 이상의 파라미터 존재
- 멤버변수(property)가 boolean 타입이면 get 메소드 대신 is 메소드 사용가능
- 외부에서 멤버변수(property) 접근시에는 get/set 메소드를 통해 접근
*/
//public class Student extends Object {
public class Student { //extends Object 작성 안하면 컴파일러가 자동 삽입
	private String name; //private 선언시 외부에서 직접 접근불가
	private int kor; 
	private int eng;
	private int math;
	private int tot;
	private double avg;
	
	private boolean ok;
	
	public Student() {
		//super : 부모클래스 객체(인스턴스)
		//super() : 부모클래스 객체(인스턴스)의 기본생성자 호출
		super(); //생략시 컴파일러가 자동 삽입해서 처리함
	}
	
	public Student(String name) {
		super();//Constructor call must be the first statement in a constructor
		this.name = name;
	}

	public Student(String name, int kor, int eng, int math) {
		//현재객체(인스턴스)의 생성자 호출
		//생성자의 재사용
		this(name); //생성자 코드 중 맨처음 작성되어 실행되어야함
		//this.name = name;
		
		//this.kor = kor;
		setKor(kor);
		this.eng = eng;
		this.math = math;
		computeTotAvg();
	}

	//==== 메소드 작성 ===========================
	//외부에서 사용할 수 있도록 메소드 제공(public)
	//외부에서 데이터를 전달받아 필드(멤버변수)에 데이터 저장
	//명칭(호칭) : set메소드, setter, set property(속성값 설정-쓰기)
	public void setName(String name) {
		this.name = name;
	}

	//외부에서 데이터를 읽어 가기 위한 get 메소드
	//명칭(호칭) : get메소드, getter, get property(속성값 가져가기-읽기)
	public String getName() {
		return name;
	}
	
	//kor : setter, getter
	public void setKor(int kor) {
		//적절한 데이터 여부 확인
		if (kor >= 0 && kor <= 100) {
			this.kor = kor;
			computeTotAvg();
		} else {
			System.out.println("[예외발생] 국어 0~100 값이 아님");
		}
	}
	
	public int getKor() {
		return kor;
	}
	
	//======================================
	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		if (eng >= 0 && eng <= 100) {
			this.eng = eng;
			computeTotAvg();
		} else {
			System.out.println("[예외발생] 영어 0~100 값이 아님");
		}
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if (math >= 0 && math <= 100) {
			this.math = math;
			computeTotAvg();
		} else {
			System.out.println("[예외발생] 수학 0~100 값이 아님");
		}
	}

	public int getTot() {
		return tot;
	}

//	public void setTot(int tot) {
//		this.tot = tot;
//	}

	public double getAvg() {
		return avg;
	}

//	public void setAvg(double avg) {
//		this.avg = avg;
//	}

	//총점, 평균 계산처리 메소드 
	private void computeTotAvg() {
		tot = kor + eng + math;
		avg = tot * 100 / 3 / 100.0;
	}
	
	
	


	
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot + ", avg="
				+ avg + "]";
	}
	
	
}









