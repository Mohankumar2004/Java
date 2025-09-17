package Recursion;

public class Spynumber {
	public static void main(String args[])
	{
		System.out.println(isSpy(1124,0,1));
	}

	private static boolean isSpy(int n, int sum, int mul) {
		if(n==0)
		{
			return sum==mul;
		}
		int temp=n%10;
		sum+=temp;
		mul*=temp;
		n/=10;
		return isSpy(n,sum,mul);
		
		
	}
}
