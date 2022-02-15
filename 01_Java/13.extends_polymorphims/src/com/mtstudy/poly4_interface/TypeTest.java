package com.mtstudy.poly4_interface;

public class TypeTest {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Pig pig = new Pig();
		
		cat.sound();
		dog.sound();
		pig.sound();
		pig.sound();
		
		
		System.out.println("=== Animal 인터페이스 사용 ===");
		
		soundPoly(cat);
		soundPoly(dog);
		soundPoly(pig);
		
		
		

	}
	
	// interface Animal타입으로 데이터를 받아서
	// interface 타입에 저장된 데이터에있는 void sound(); 메소드를 실행시키고
	// 메소드 오버라이딩에 의해 저장된 객체의(Cat이면 Cat class에있는 메소드)메소드가 실행된다
	static void soundPoly(Animal animal) {
		animal.sound();
	}

}
