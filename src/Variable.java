
public class Variable {

	public static void main(String[] args) {
//		int a = 1574;
//		int b = 575;
//		// 결과 = a + b, if (결과 % 2 = 0) "짝수입니다.", if (결과 % 2 = 1),  "홀수입니다."
//		int sum = a + b;
//		if (sum % 2 == 0) {
//			System.out.println("짝수입니다.");
//		}
//		else {
//			System.out.println("홀수입니다.");
//		}
		
		int a = -10;
		int b = 1;
		int times = a * b;
		if (times >= 1000) {
			System.out.println("1000이상");
		}
		else if (times >= 100) {
			System.out.println("100이상");
		}
		else if (times >= 10) {
			System.out.println("10이상");
		
		}
		else {
			System.out.println("10미만");
		}
	}
 
}
