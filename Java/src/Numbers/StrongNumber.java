package Numbers;

public class StrongNumber {
	public static void main(String[] args) {
		int n=145;
		int sum=0;
		int temp=n;
		while(n>0)
		{
			int r=n%10;
			int fact=1;
			for(int i=1;i<=r;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not a Strong Number");
		}
	}
}
//145 = 1! + 4! + 5! = 1 + 24 + 120 = 145