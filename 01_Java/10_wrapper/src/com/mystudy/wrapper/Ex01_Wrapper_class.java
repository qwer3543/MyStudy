package com.mystudy.wrapper;

public class Ex01_Wrapper_class {

	public static void main(String[] args) {
		// wrapper class : 기본 데이터 타입의 기능확장한 클래스 총칭
		// 기본데이터 타입 : 전체 소문자, char, int, ...
		//   boolean, char, byte, short, int, long, float, double
		// wrapper class : 기본 데이터 타입의 첫글자를 대문자로 
		//    예외: char -> Character, int -> Integer
		//   Boolean, Character, Byte, Short, Integer, Long, Float, Double
		int num = 100;
		System.out.println("num : " + num);
		
		Integer intNum = new Integer(100);
		System.out.println("Integer intNum : " + intNum);
		
		String strNum = intNum.toString();
		System.out.println("String strNum : " + strNum);
		
		intNum = 900; // Integer <- int : 자동형변환
		num = intNum; // int <- Integer : 자동형변환
		
		System.out.println("int 최대값 : " + Integer.MAX_VALUE);
		System.out.println("int 최소값 : " + Integer.MIN_VALUE);
		
		num = Integer.parseInt("999"); //int <- String
		intNum = Integer.valueOf("999"); //Integer <- String
		
		System.out.println("int num + 1 : " + (num + 1));
		System.out.println("Integer intNum + 1 : " + (intNum + 1));
				 
		String str = String.valueOf(9999); // String <- int	
		
		System.out.println("---- Boolean ----");
		Boolean bool = true;
		bool = new Boolean(true);
		bool = new Boolean("true"); //true, TRUE, TRue --> true
		bool = new Boolean("TRUE"); //true, TRUE, TRue --> true
		bool = new Boolean("TRue"); //true, TRUE, TRue --> true
		System.out.println("bool true : " + bool);
		
		bool = new Boolean("false");
		bool = new Boolean("FALSE");
		bool = new Boolean("FALse");
		bool = new Boolean("true1"); //true 가 아닌 문자열
		bool = new Boolean("abadfas");
		System.out.println("bool false : " + bool);
		
		System.out.println("Boolean.TRUE : " + Boolean.TRUE);
		System.out.println("Boolean.FALSE : " + Boolean.FALSE);
		
		System.out.println("---- String -> Boolean ---");
		bool = Boolean.valueOf("true"); // Boolean <- String
		boolean bool1 = Boolean.parseBoolean("true");
		
		System.out.println("===== Float, Double 동일 ====");
		Float f = 10.5f; //Float <- float
		f = new Float(12.5f);
		f = new Float("12.5f");
		f = new Float("12.5");
		System.out.println("f : " + f);
		
		//str = 12.5f; //Type mismatch: cannot convert from float to String
		str = String.valueOf(f); //String <- Float
		System.out.println("String str : " + str);
		
		//f = "12.5f"; //Type mismatch: cannot convert from String to Float
		f = Float.valueOf("12.5f"); //Float <- String
		System.out.println("Float f : " + f);
		
		//--------------------
		System.out.println("-------------");
		Double d = 10.5D; //Double <- double;
		d = new Double(12.5d);
		d = new Double("12.5d");
		System.out.println("Double d : " + d);
		
		str = String.valueOf(d); //String <- Double
		System.out.println("String str : " + str);
		
		d = Double.valueOf("12.5d"); //Double <- String
		d = Double.valueOf("12.5");
		d = Double.valueOf("10.5f");
		//d = Double.valueOf("10.5W"); //NumberFormatException
		System.out.println("Double d : " + d);
		//==============================
		
	}

}
