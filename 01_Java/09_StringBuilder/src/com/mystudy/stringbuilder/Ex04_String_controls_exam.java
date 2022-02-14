
package com.mystudy.stringbuilder;

import java.util.StringTokenizer;

public class Ex04_String_controls_exam {

	public static void main(String[] args) {
		/* 문자열 다루기
		0.문자열 데이터
		  String str1 = "홍길동 이순신   이순신 Tom 홍길동";
		  String str2 = "    TOM    을지문덕 김유신 연개소문";
		1. 위의 문자열을 StringBuilder 변수 sb를 이용해서 하나의 문자열로 만들고,
		2-1. sb의 문자열을 빈칸(" ")을 구분자로 잘라서(이름만 추출) 화면 출력(데이터확인)
		     (String.split() 또는 StringTokenizer 클래스 사용)
		      예) 홍길동 이순신 이순신 Tom 홍길동 TOM...
		2-2. 문자열을 저장할 수 있는 배열변수(names)에 저장
		3. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		      예) 홍길동,이순신,이순신,Tom,홍길동,TOM...   
		4. 데이터의 첫글자만 추출해서 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		      예) 홍,이,이,T,홍,T,을... 
		5. 배열의 문자열중 이름의 글자수가 4 이상인 값을 "인덱스번호:이름" 출력
		      예) 인덱스번호:을지문덕
		********************************/
		System.out.println("=================1================");
		
		String str1 = "홍길동 이순신   이순신 Tom 홍길동";
		
		String str2 = "    TOM    을지문덕 김유신 연개소문";
		
		//1. 위의 문자열을 StringBuilder 변수 sb를 이용해서 
		//   하나의 문자열로 만들고
		
		String str = str1 + str2;
		
		StringBuilder sb = new StringBuilder(str);
		
		// sb.append(str) // 뒤에 문자열을 붙인다
		
		System.out.println("1]> " + sb);
		
		System.out.println();
		
		//2-1. sb의 문자열을 빈칸(" ")을 구분자로 잘라서(이름만 추출) 
		//     화면 출력(데이터확인)
	    //     (String.split() 또는 StringTokenizer 클래스 사용)
	    //     예) 홍길동 이순신 이순신 Tom 홍길동 TOM...
		
		// sb는 StringBuilder타입 이므로 사용할수 없다 하지만 sb.toString()을 통해서
		// String으로 인식 시켜준다
		StringTokenizer zxc = new StringTokenizer(sb.toString(), " ");
		
		// StringTokenizer zxc = new StringTokenizer(str, " ");
		
		//System.out.println(zxc.countTokens());
		
		System.out.print("2]> ");
		
		String[] name = new String[9];
		
		int g = 0;
		
		while (zxc.hasMoreTokens()) {
			name[g] = zxc.nextToken();
			System.out.print(name[g] + " ");
			g++;
		}
		System.out.println();
		
		//while (zxc.hasMoreTokens()) {
			// name 변수에 넣고 써줌으로 나중에 재사용가능
			//String name = zxc.nextToken();
			//System.out.print(name + " ");
		//}
		//System.out.println();
		
		//2-2. 문자열을 저장할 수 있는 배열변수(names)에 저장
		
		
		StringTokenizer asd = new StringTokenizer(str, " ");
		
		String[] names = new String[asd.countTokens()];
		
		for (int i = 0; i < names.length; i++) {
			 names[i] = asd.nextToken();
			 //System.out.print(names[i] + " ");
		}
		System.out.println();
		
		
		
		//3. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
	    //   예) 홍길동,이순신,이순신,Tom,홍길동,TOM... 
		System.out.print("3]> ");
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
			if (i < names.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println();
		
		System.out.println();
		//4. 데이터의 첫글자만 추출해서 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
	    //   예) 홍,이,이,T,홍,T,을...
		System.out.print("4]> ");
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i].charAt(0));
			if (i < names.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println();
		
		System.out.println();
		//5. 배열의 문자열중 이름의 글자수가 4 이상인 값을 "인덱스번호:이름" 출력
	    //   예) 인덱스번호:을지문덕
		System.out.print("5]> ");
		
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() >= 4) {
				System.out.print(i + " : " + names[i] + "  ");
			}
			
		}
		System.out.println();
		
		
		System.out.println("=================2================");
		
		String[] abc = str.split(" ");
		String[] vvv = new String[9];
		int m = 0;
		
		for (int i = 0; i < abc.length; i++) {
			
			if (abc[i].length() > 2) {
				vvv[m] =abc[i];
				System.out.print(vvv[m] + " ");
				m++;
			}
		}
		System.out.println();
		
		//System.out.println(vvv.length);
		
		//==========================================
		
		for (int i = 0; i < vvv.length; i++) {
			System.out.print(vvv[i]);
			if (i < vvv.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println();
		
		//============================================
		
		for (int i = 0; i < vvv.length; i++) {
			System.out.print(vvv[i].charAt(0));
			if (i < vvv.length - 1) {
				System.out.print(",");
			}
		}
		System.out.println();
		
		//=======================================
		
		for (int i = 0; i < vvv.length; i++) {
			if (vvv[i].length() >= 4) {
				System.out.print(i + " : " + vvv[i] + "  ");
			}
			
		}
		System.out.println();
		
	}

}
