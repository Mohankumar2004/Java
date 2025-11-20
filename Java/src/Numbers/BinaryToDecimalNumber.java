package Numbers;

public class BinaryToDecimalNumber {
	public static void main(String args[])
	{
		int n=1011;
		int i=2;
		int decimal=0;
		while(n>0)
		{
			int r=n%10;
			decimal=(i*r)+decimal;
			n=n/10;
			i*=2;
		}
		System.out.println("Decimal Number: "+decimal);
	}
}
