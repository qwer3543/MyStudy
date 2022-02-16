package com.mystudy.generic1;

//제너릭 적용된 박스
class BoxT<T>{
	T obj;
	void setObj(T obj) {this.obj = obj;}
	T getObj() {return obj;}
}
public class GenericWildcardExam {

	public static void main(String[] args) {
		// 제너릭: 와일드카드(wildcard - 대표문자)
		// 1. <?> : 모든타입(객체) 자료형에 대한 대표문자
		// 2. <? extends 자료형> : 자료형 표함, 상속받은 자녀(sub) 타입만 가능
		// 3. <? super 자료형> : 자료형 포함, 부모(super) 타입 사용
		//-------------------------
		
		// 1. <?> : 모든타입(객체) 자료형에 대한 대표문자
		BoxT<?> box = new BoxT<String>();
		box = new BoxT<Integer>();
		box = new BoxT<StringBuilder>();
		
		// 2. <? extends 자료형> : 자료형 표함, 상속받은 자녀(sub) 타입만 가능
		BoxT<? extends Number> box2 = null;
		//box2 = new BoxT<String>(); // 쓸수 없다
		box2 = new BoxT<Number>();
		box2 = new BoxT<Integer>();
		box2 = new BoxT<Double>();
		
		// 3. <? super 자료형> : 자료형 포함, 부모(super) 타입 사용
		BoxT<? super Number> box3 = null;
		//box3 = new BoxT<Integer>(); // 쓸수 없다 
		//box3 = new BoxT<String>(); // 쓸수 없다
		box3 = new BoxT<Number>();		
		box3 = new BoxT<Object>();		
				
				
	}

}
