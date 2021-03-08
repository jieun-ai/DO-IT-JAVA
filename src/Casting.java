//8.3

public class Casting {

	public static void main(String[] args) {
		
		double a=1.1;
		double b=1;
		System.out.println(b);
		
		//int C=1.1;  -->오류
		double d=1.1;  
		int e=(int) 1.1; //강제로 정수로 바꿈
		System.out.println(e);
		
		// 1 to String (1을 문자로 변경하기)
		String f =Integer.toString(1); //정수인 1을 문자(string)으로 변경
		System.out.println(f.getClass()); 
		                 // f.getClass(): f가 어떤 타입인지 알려준다.
	}

}
