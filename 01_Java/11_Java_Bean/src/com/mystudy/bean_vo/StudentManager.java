package com.mystudy.bean_vo;

import com.mystudy.bean.Student;

public class StudentManager {

	public static void main(String[] args) {
		/* 3명의 성적처리
		"김유신", 100, 90, 81
		"이순신", 95, 88, 92
		"홍길동", 90, 87, 77
		==============================
		김유신	100	90	81	271	90.33
		이순신	95	88	92	275	91.66
		홍길동	90	87	77	254	84.66
		*********************************/
		StudentVo stu1 = new StudentVo("김유신", 100, 90, 81);
		System.out.println(stu1);
		
		StudentVo stu2 = new StudentVo("이순신", 95, 88, 92);
		System.out.println(stu2);
		
		StudentVo stu3 = new StudentVo("홍길동", 90, 87, 77);
		System.out.println(stu3);
		
		System.out.println("==============================================");
		//==============================
		// StudentVO 타입의 배열(kkk)에도 저장해서 사용
		// 배열데이터에 있는 학생정보를 사용해서
		// 출력예) 김유신   271 90.33
		
		StudentVo[] kkk = new StudentVo[3];
		
		kkk[0] = stu1;
		kkk[1] = stu2;
		kkk[2] = stu3;
		
		for (int i = 0; i < kkk.length; i++) {
			System.out.print(kkk[i].getName() + "\t");
			System.out.print(kkk[i].getTot() + "\t");
			System.out.print(kkk[i].getAvg());
			System.out.println();
		}
		
	}

}






