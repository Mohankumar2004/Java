package Numbers;

public class NeonNumber {
	public static void main(String[] args) {
		int n=9;
		int sq=n*n;
		int sum=0;
		while(sq>0)
		{
			int r=sq%10;
			sum=sum+r;
			sq=sq/10;
		}
		if(sum==n)
		{
			System.out.println("Neon Number");
		}
		else
		{
			System.out.println("Not a Neon Number");
		}
	}
}
// 9 is a Neon Number because 9^2 = 81 and 8 + 1 = 9