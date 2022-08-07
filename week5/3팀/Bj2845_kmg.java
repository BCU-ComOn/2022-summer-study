import java.util.Scanner;

public class Bj2845_kmg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int p = sc.nextInt();
		
		int news[] = new int[5];
		
		for(int i=0; i<news.length; i++) {
			news[i] = sc.nextInt();
		}
		
		int tot = l*p;
		
		for(int i=0; i<news.length; i++) {
			
			System.out.print((news[i]-tot)+" ");
		}
		

	}

}
