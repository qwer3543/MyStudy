package com.mystudy.ex03_sungjuk;

public class SungjukTest {

	public static void main(String[] args) {
		System.out.println("--- main() 시작 ---");
		
		StudentVo stu = new StudentVo("김동욱", 100, 90, 80);
		
		try {
			stu.setKor(999);
		} catch (JumsuOutValueException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} catch(sungjukProcessException e) {
			
		}
		System.out.println("stu: " + stu);
		
		
		System.out.println("--- main() 끝 ---");

	}

}
