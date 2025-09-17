package Patterns;

public class TriangleStar {
	public static void main(String[] args) {
		int rows = 5; // Number of rows for the triangle

		for (int i = 1; i <= rows; i++) {
			// Print leading spaces
			for (int j = rows; j > i; j--) {
				System.out.print(" ");
			}
			// Print stars
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			// Move to the next line after each row
			System.out.println();
		}
	}
}
//	  *
//	 ***
//	*****
// *******