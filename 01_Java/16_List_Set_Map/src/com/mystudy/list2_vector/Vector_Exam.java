package com.mystudy.list2_vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Vector_Exam {

	public static void main(String[] args) {
		// Vector 클래스: List 계열
		
		Vector<String> v = new Vector<String>(5);
		
		v.add("1");
		v.add("2");
		v.add("3");
		System.out.println(v);
		System.out.println("v.size: " + v.size()); // 크기
		System.out.println("v.capacity: " + v.capacity()); // 저장 공간
		
		System.out.println("=== 복사 ===");
		// 복사
		String temp = v.toString();
		System.out.println(temp);
		
		System.out.println("=== 삭제 ===");
		// 삭제
		v.remove(2);
		System.out.println(v);
		System.out.println("v.size: " + v.size()); // 크기
		System.out.println("v.capacity: " + v.capacity()); // 저장 공간
		
		
		// 크기와 저장 공간을 일치 시켜준다
		System.out.println("=== trimToSize ===");
		
		v.trimToSize();
		System.out.println("v.size: " + v.size()); // 크기
		System.out.println("v.capacity: " + v.capacity()); // 저장 공간
		
		System.out.println("===  ===");
		
		v.add("AAA");
		System.out.println(v);
		
		v.add(2, "BBB"); //인덱스 위치에 데이터 추가 후 값을 밀어낸다
		System.out.println(v);
		
		Vector<String> v2 = (Vector) v.clone(); // 복사
		System.out.println("v : " + v);
		System.out.println("v2 : " + v2);
		
		System.out.println("====== Enumeration ======");
		
		Enumeration<String> enu = v.elements();
		
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		
		System.out.println("======= Iterator =======");
		
		Iterator<String> ite = v.iterator();
		
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("=======  =======");
		
		// == 숙제: 주소값 복사 인지 물리적으로 분리된 복사본인지 확인하기 == \\
		
		
		
		
		

	}

}
