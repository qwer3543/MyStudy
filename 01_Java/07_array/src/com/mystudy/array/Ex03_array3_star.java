package com.mystudy.array;

public class Ex03_array3_star {

	public static void main(String[] args) {
		/* 별찍기
		    *
		    **
		    ***
		    ****
		    ***** 
		     배열 5개 안에 별을 넣는다 
		     위 모양대로 벼열을 이용하여 꺼내 나열하라(순차적으로)
		 */
		
		char[] star = {'*','!','@','#','$'};
	
		for (int i = 0; i < star.length; i++) {
			for (int v = 0; v <= i; v++) {
				System.out.print(star[v]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
