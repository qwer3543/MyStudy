package com.mystudy.ex06_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectInputOutputStream2_List {

	public static void main(String[] args) {
		//(실습) StudentVO 객체들을 ArrayList에 담아서 파일에 저장하고
		// 파일에서 읽어들인 ArrayList 객체에 담긴 VO 정보를 화면에 출력
		// 사용할 파일 : file/object_io_list.data
		//----------------------------------------------
		
		StudentVO stu1 = new StudentVO("김유신", 100, 90, 81);
		StudentVO stu2 = new StudentVO("홍길동", 95, 85, 75);
		
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		
		list.add(stu1);
		list.add(stu2);
		
		//파일에 쓰기 위한 용도
		File file = new File("file/ObjectInputOutputStream2_List.data");
		FileOutputStream out1 = null;
		ObjectOutputStream out2 = null;
		
		
		try {
			
			out1 = new FileOutputStream(file);
			out2 = new ObjectOutputStream(out1);
			
			out2.writeObject(list);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (out2 != null) out2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		File file1 = new File("file/ObjectInputOutputStream2_List.data");
		FileInputStream int1 = null;
		ObjectInputStream int2 = null;
		
		try {
			
			int1 = new FileInputStream(file1);
			int2 = new ObjectInputStream(int1);
			
			ArrayList<StudentVO> kkk = (ArrayList<StudentVO>) int2.readObject();
			
			for (int i = 0; i < kkk.size(); i++) {
				StudentVO rrr = kkk.get(i);
				System.out.println(rrr.getKor() + rrr.getEng());
			}
			
			System.out.println(kkk);
			System.out.println(kkk.get(0).getKor());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (int2 != null) int2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

	
	

}
