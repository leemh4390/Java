package step02;

	import java.util.Scanner;
	
public class _06 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int H = sc.nextInt();
	int M = sc.nextInt();
	int C = sc.nextInt();
	
	int A = H*60 + M+ C; 
	
	H = A / 60;
	M = A % 60;
	
	if (H >= 24) {
		H = H - 24; }
	System.out.println(H + " " + M);
	sc.close();
	
	}
}
