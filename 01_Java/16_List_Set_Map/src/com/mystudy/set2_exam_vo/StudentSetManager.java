package com.mystudy.set2_exam_vo;

import java.util.HashSet;

public class StudentSetManager {

	public static void main(String[] args) {
		/* (실습) Set 중 HashSet 사용
		 사용클래스명 : StudentVO, StudentSetManager - main() 메소드
		1. 3명의 학생데이터(성명,국어,영어,수학)를 
		   StudentVO 클래스를 이용해서 만들고(저장하고)
		   "홍길동", 100, 90, 81
		   "이순신", 95, 88, 92
		   "김유신", 90, 87, 77
		   ---------------------
		2. HashSet<StudentVO> 타입의 변수(set)에 저장하고
		3. set에 있는 데이터를 사용해서 화면출력
		   성명    국어   영어  수학    총점     평균
		   --------------------------
		   홍길동   100  90  81  270  90.33
		   ...
		   -----------------------------
		4. 저장된 set에 있는 김유신 학생의 국어 점수를 95점으로 수정
		5. "김유신" 학생의 성적만 화면 출력
		=================================================== */
		
		StudentVO k1 = new StudentVO("홍길동", 100, 90, 81);
		StudentVO k2 = new StudentVO("이순신", 95, 88, 92);
		StudentVO k3 = new StudentVO("김유신", 90, 87, 77);
		
		HashSet<StudentVO> set = new HashSet<StudentVO>();
		
		set.add(k1);
		set.add(k2);
		set.add(k3);
		
		for (StudentVO name : set) {
			System.out.println(name);
		}
		
		System.out.println("===========================================");
		
		for (StudentVO name : set) {
			if (name.getName().equals("김유신")) {
				name.setKor(95);
				System.out.println(name);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
