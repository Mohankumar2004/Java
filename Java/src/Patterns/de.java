package Patterns;



public class de {
	public static void main(String[] args) {
		int rows = 5; // Number of rows for the upper half of the diamond

		// Upper half of the diamond
		for (int i = 1; i <= rows; i++) {
			// Print leading spaces
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			// Print stars
			for (int k = 1; k <= (2 * i - 1); k++) {
				// Print star only at the borders
				if(k==1 || k==(2*i-1)) {
				
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			// Move to the next line after each row
			System.out.println();
		}

		// Lower half of the diamond
		for (int i = rows - 1; i >= 1; i--) {
			// Print leading spaces
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			// Print stars
			for (int k = 1; k <= (2 * i - 1); k++) {
				// Print star only at the borders
				if(k==1 || k==(2*i-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			// Move to the next line after each row
			System.out.println();
		}
	}
}
