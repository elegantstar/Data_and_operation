
public class TwoDimensionArray {

	public static void main(String[] args) {
		int[][] numbers = {
			{3, 7, 2},
			{9, 5, 7},
			{1, 8, 4},
			{6, 6, 0}
		};
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[0].length; j++) {
				if((i + j) % 2 == 0) {
					sum1 = sum1 + numbers[i][j];
				}
				else {
					sum2 = sum2 + numbers[i][j];
				}
			}
		}
		if(sum1 > sum2) System.out.println(sum1 - sum2);
		else System.out.println(sum2 - sum1);
	}
}