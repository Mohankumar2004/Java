package Patterns;

public class SnakeNumber {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(i%2 != 0) {
					System.out.print((i*n)-(n-j)+" ");
				}
				else {
					System.out.print((i*n)-j+1+" ");
				}
			}
			System.out.println();
		}		
	}
}
