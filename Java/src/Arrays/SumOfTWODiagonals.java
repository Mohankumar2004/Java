package Arrays;

public class SumOfTWODiagonals {
	public static void main(String args[])
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j||i+j==a.length-1)
				{
					sum+=a[i][j];
				}
			}
			System.out.println(sum);
		}
		
		
		//another type
		
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1+=a[i][i];
			if(i!=a.length-1-i)
				sum1+=a[i][a.length-1-i];
			System.out.println(sum1);
		}
	}
}
