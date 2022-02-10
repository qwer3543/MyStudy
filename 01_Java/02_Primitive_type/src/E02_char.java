
public class E02_char {

	public static void main(String[] args) {
		// 자바의 문자 처리 방식은 유니코드 형태
		//문자형(char): '작은 따움표을 사용, 문자는 한글자만 허용)
		char k1 = 'A';  //알파벳 A는 숫자로 봤을 때 65이다 
		
		System.out.println("k1 : " + k1);
		// -> A
		
		System.out.println("k1의 다음 문자 : " + (k1 + 1));
		// A는 65의 숫자 값을 가지고 있다 여기에 1을 더해서 
		// -> 강제적으로 형이 변환되고 값이 더해진 66이 출력됨
		
		System.out.println("k1의 다음 문자 : " + (char)(k1 + 1)); 
		// 더한 66 값을 (char)다시 형을 변환 해준다 -> B가 출력됨 
		
		char k2 = '한';
		System.out.println("k2 : " + k2);
		System.out.println("k2 : " + (char)(k2 + 1));
		
		
		char k3 = '\uAC00'; //(유니코드 값으로 설정)
		System.out.println("k3 : " + k3);
		System.out.println("k3 : " + (char)(k3 + 1));
		
		System.out.println("============================");
		
		System.out.println("k1 : " + k1);
		//k1 = k1 + 1; // k1(char)타입에 바로 int타입 숫자1을 더할수 없다
		
		k1 = (char)(k1 + 1); // int타입을 -> char 타입으로 변환한 후 더한다
		System.out.println("k1의 다음값  : " + k1); 
		// 타입 변환 후 더해서 값이 잘 출력 된다
		
		
		//문자형(String): "쌍따움표을 사용, 여러글자 허용)
		
		
		
		

	}

}
