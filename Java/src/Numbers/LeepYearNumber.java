package Numbers;

public class LeepYearNumber {
	public static void main(String[] args) {
		int year=2024;
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			System.out.println("Leep Year");
		}
		else
		{
			System.out.println("Not a Leep Year");
		}
	}
}
