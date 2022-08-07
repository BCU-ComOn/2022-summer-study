import java.util.Scanner;

public class Bj10039_kmg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = 0;
		
		int tot = 0;
		
		for(int i=0; i<5; i++) {
			score = sc.nextInt();
			
			if(score < 40) {
				score = 40;
			}
			
			tot += score;
		}
		
		System.out.println(tot/5);

	}

}
