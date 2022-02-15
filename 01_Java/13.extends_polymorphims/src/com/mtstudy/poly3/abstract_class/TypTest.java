package com.mtstudy.poly3.abstract_class;

public class TypTest {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Pig pig = new Pig();
		cat.sound();
		dog.sound();
		pig.sound();
		
		System.out.println("=========");
		
		sound(cat);
		sound(dog);
		sound(pig);
		
		
	}
	
	// 부모클래스인 추상클래스 타입으로 받아서 처리
	static void sound(AbstractAnimal animal) {
		animal.sound();
	}
	
}
