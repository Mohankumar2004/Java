package String;

public class UpperToLowerCase {
	public static void main(String args[])
	{
		String s="DhOnI";
		char [] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='A'&&c[i]<='Z')
			{
				c[i]+=32;
			}
			else if(c[i]>='a'&&c[i]<='z')
			{
				c[i]-=32;
			}
		}
		System.out.println(c);
	}
}
