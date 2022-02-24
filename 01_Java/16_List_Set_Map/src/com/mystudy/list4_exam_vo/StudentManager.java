package com.mystudy.list4_exam_vo;

import java.util.ArrayList;

public class StudentManager {

	public static void main(String[] args) {
		/* (실습) List를 사용한 성적 처리
		사용클래스명 : StudentVO, StudentListManager - main() 메소드
		1. 3명의 학생데이터(성명,국어,영어,수학)를 
		   StudentVO 클래스를 이용해서 만들고
		   "홍길동", 100, 90, 81
		   "이순신", 95, 88, 92
		   "김유신", 90, 87, 77
		2. ArrayList 타입의 변수(list)에 저장하고
		3. list에 있는 데이터를 사용해서 화면출력
		     성명    국어   영어  수학    총점     평균
		   --------------------------
		    홍길동   100  90  81  270  90.33
		   ...
		4. 김유신 국어 점수를 95 점으로 수정
		    김유신 학생 데이터를 화면에 출력
		========================================== */
		// ]> 1
		StudentVo stu1 = new StudentVo("홍길동", 100, 90, 81);
		StudentVo stu2 = new StudentVo("이순신", 95, 88, 92);
		StudentVo stu3 = new StudentVo("김유신", 90, 87, 77);
		
		// ]> 2
		ArrayList<StudentVo> list = new ArrayList<StudentVo>();
		
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		
		// ]> 3
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
			
		System.out.println("========================");
		// ]> 4
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals("김유신")) {
				list.get(i).setKor(95);;
			}
			
		}
		System.out.println(list.get(2));
		
		
		
	}

}
