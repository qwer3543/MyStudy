package com.mystudy.ex07_object;

public class StudentManager_Test {

	public static void main(String[] args) {
		//(개인실습) StudentManager 기능을 구현하고 동작여부 테스트
		StudentManager manager = new StudentManager();
		int result = manager.insertData(new StudentVO("2022001", "김유신", 100, 90, 81));
		StudentVO stu = manager.selectData(new StudentVO("2022001", "", 0, 0, 0));
		System.out.println("stu: " + stu);
		
		
		
	}

}
