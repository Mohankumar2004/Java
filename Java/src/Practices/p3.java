package Practices;

public class p3 {
	public static void main(String args[])
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=0;l<=i-1;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<n;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
