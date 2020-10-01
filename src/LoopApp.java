
public class LoopApp {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 1;
		while(num2<20) {
			if(num1*num2 % 3 == 0) {
				System.out.println(num1 + "*" + num2 + "=" + num1*num2);
			}
			num2 = num2 + 1;
		}
		
		for(int i=1;i<20;i++) {
			if(num1*i % 3 == 0) {
				System.out.println(num1 + "*" + i + "=" + num1*i);
			}
		}
			
	}
}
 