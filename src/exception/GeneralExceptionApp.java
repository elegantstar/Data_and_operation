package exception;

public class GeneralExceptionApp {

	public static void main(String[] args) {

		/**
		 * 1. ������ ���� : �ڹ� ���� ���� (IDE�� �����༭ ã�� ����)
		 * 2. ��Ÿ�� ���� : ���α׷� ���� ���߿� �߻��ϴ� ����(ã�� �����)
		 * 	- ��κ��� ��Ÿ�� �������� Exception(����)���� �����Ѵ�.
		 * 	- ��κ��� ���ܵ��� �̸� �����صΰ� ��ó ����� ������ ���´�.
		 */
		
		/**
		 * If���� try-catch �� ��� ���� ����ϴ� ���� ������?
		 * if���� ����� �� �ִٸ� if���� ����ϴ� ���� ����.
		 * 	- �ڽ�Ʈ�� ����.
		 * 	- try-catch�� �鿩���Ⱑ �Ǳ� ������ �ڵ��� �������� ��������.
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
		} catch(ArithmeticException e) { //���ܰ� �߻����� ���� ������ ����
			System.out.println("ArithmeticException �߻�");
			result = 0;
		}
		return result;
	}
	
}
