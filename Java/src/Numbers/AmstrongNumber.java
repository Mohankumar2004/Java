package Numbers;

public class AmstrongNumber {
	public static void main(String[] args) {
		int n=153;
		int temp=n;
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;	
		}
		n=temp;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			int mul=1;
			for(int i=1;i<=count;i++)
			{
				mul=mul*r;
			}
			sum=sum+mul;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("Amstrong Number");
		}
		else
		{
			System.out.println("Not a Amstrong Number");
		}
		
	}
}
//1*1*1 + 5*5*5 + 3*3*3 = 153
