
public class Note {

	public static void main(String[] args) {
		int[] scores = {30, 20, 50, 40, 70, 60, 50, 30, 20, 80};
		for(int i = 0; i < scores.length-1; i++) {
			if(scores[i] + scores[i+1]>= 100) {
				System.out.println(i+", "+ (scores[i] + scores[i+1]) + ", PASS");
			}
		}

	}

}
