package com.mystudy.set1_hashset;

import java.util.HashSet;

class Person {
	String name; // 이름
	int age; //나이
	String jumin; // 주민번호
	
	
	public Person(String name, int age, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}

	
	
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jumin=" + jumin + "]";
	}

	@Override // 오른쪽 마우스 -> Source -> hashCode and equals 들어가서 만들기
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jumin == null) ? 0 : jumin.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (jumin == null) {
			if (other.jumin != null)
				return false;
		} else if (!jumin.equals(other.jumin))
			return false;
		return true;
	}
	
}

public class HashSet_Exam2_equals {

	public static void main(String[] args) {
		
		Person p1 = new Person("홍길동", 27, "901010-1234567"); 
		Person p2 = new Person("홍길동", 27, "901010-1234567");
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode()); // 동일 데이터로 인식
		
		System.out.println(p1.equals(p2)); // 둘은 같다
		
		HashSet<Person> set = new HashSet<>();
		set.add(p1); 
		set.add(p2);
		System.out.println(set); // 하나만 출력됨 이유는 둘은 같기때문(기준:민증 번호)
		
		set.add(new Person("홍경래", 30, "901010-1234567")); // 주민 번호가 달라서 동일 데이터로 인식
		set.add(new Person("김유신", 30, "951010-1234567")); // 추가됨
		
		System.out.println(set);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
