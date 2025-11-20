package Numbers;

public class SpyNumber {
	public static void main(String[] args) {
		int n=123;
		int sum=0;
		int pro=1;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r;
			pro=pro*r;
			n=n/10;
		}
		if(sum==pro)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("Not a Spy Number");
		}
	}
}
// A Spy number is a number in which the sum of its digits is equal to the product of its digits.