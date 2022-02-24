package com.mystudy.ex06_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOutputStream_Exam_TWR {

	public static void main(String[] args) {
		// ObjectInputStream, ObjectOutputStream
		// Object 타입의 데이터를 사용해서 입출력(I/O)
		// ------------------
		// Object 타입의 데이터를 파일에 저장하고 읽어오기(StudentVO)

		//파일에 저장할 데이터 준비
		System.out.println("--- 저장할 데이터 준비 ---");
		StudentVO stu1 = new StudentVO("김유신", 100, 90, 81);
		StudentVO stu2 = new StudentVO("홍길동", 95, 85, 75);
		System.out.println("stu1: " + stu1);
		System.out.println("stu2: " + stu2);
		System.out.println("======================");
		
		File file = new File("file/object_io_TWR.data");
		
		//Java7 부터 제공된 try~with~resources 구문으로 작성
		// try (사용 선언 및 생성구문){} catch(){};
		try (FileOutputStream fos = new FileOutputStream(file);
			 ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			
			System.out.println(">>> 파일에 쓰기(ObjectOutputStream 사용)");
			//NotSerializableException : Serializable 아님 예외
			oos.writeObject(stu1); //StudentVO 타입 데이터 하나 출력
			oos.writeObject(stu2);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		//========= 파일에 저장된 StudentVO 타입 데이터 읽어서 화면출력 =====
		// try (사용 선언 및 생성구문){} catch(){};
		try (ObjectInputStream ois 
				= new ObjectInputStream(new FileInputStream("file/object_io_TWR.data"));) {
			
			System.out.println(">> 파일로 부터 StudentVO 타입 데이터 읽어서 화면 출력");
			StudentVO stuInput1 = (StudentVO) ois.readObject();
			StudentVO stuInput2 = (StudentVO) ois.readObject();
			
			System.out.println("stuInput1 : " + stuInput1);
			System.out.println("stuInput2 : " + stuInput2);
			
			System.out.println(stuInput1.getName() + ", " + stuInput1.getTot() 
			         + ", " + stuInput1.getAvg());
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
	}

}








