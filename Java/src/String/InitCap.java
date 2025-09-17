package String;

public class InitCap {
	public static void main(String args[])
	{
		String s="java developer";
		char [] c=s.toCharArray();
		for(int i=0;i<c.length-1;i++)
		{
			
			if(i==0||c[i-1]==' ')
			{
				c[i]-=32;
			}
		}
		System.out.println(c);
	}
}
