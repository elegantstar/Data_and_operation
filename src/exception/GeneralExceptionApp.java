package exception;

public class GeneralExceptionApp {

	public static void main(String[] args) {

		/**
		 * 1. 컴파일 에러 : 자바 문법 오류 (IDE가 도와줘서 찾기 쉬움)
		 * 2. 런타임 에러 : 프로그램 실행 도중에 발생하는 오류(찾기 어려움)
		 * 	- 대부분의 런타임 에러들은 Exception(예외)으로 관리한다.
		 * 	- 대부분의 예외들을 미리 정의해두고 대처 방법을 구현해 놓는다.
		 */
		
		/**
		 * If문과 try-catch 중 어느 것을 사용하는 것이 좋을까?
		 * if문을 사용할 수 있다면 if문을 사용하는 것이 좋다.
		 * 	- 코스트가 적다.
		 * 	- try-catch는 들여쓰기가 되기 때문에 코드의 가독성이 떨어진다.
		 */
		
		
		int result = divide(3,2);
		System.out.println(result);
		
		result = divide(5,0);
		System.out.println(result);
		
	}

	public static int divide(int num1, int num2) {
		int result = 0;
		try {
			result = num1/num2;
		} catch(ArithmeticException e) { //예외가 발생했을 때의 동작을 정의
			System.out.println("ArithmeticException 발생");
			result = 0;
		}
		return result;
	}
	
}
