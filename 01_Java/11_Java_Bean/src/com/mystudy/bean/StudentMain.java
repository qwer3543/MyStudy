package com.mystudy.bean;

public class StudentMain {

	public static void main(String[] args) {
		Student stu = new Student();
		System.out.println(stu);
		//System.out.println("name: " + stu.name);
		stu.setName("홍길동");
		String name = stu.getName();
		System.out.println("name : " + name);
		System.out.println("name : " + stu.getName());
		//stu.kor = 999;
		stu.setKor(100);
		stu.setEng(90);
		System.out.println(stu);
		stu.setMath(81);
		
//		int tot = stu.getKor() + stu.getEng() + stu.getMath();
//		stu.setTot(tot);
//		
//		double avg = tot * 100 / 3 / 100.0;
//		stu.setAvg(avg);
		
		//stu.computeTotAvg();
		//stu.setKor(10);
		System.out.println(stu);
		
		System.out.println("=== 생성자 사용 데이터 입력 ====");
		
		Student stu2 = new Student("김유신", 999, 90, 82);
		
		System.out.println("stu2 : " + stu2);
	}

}






