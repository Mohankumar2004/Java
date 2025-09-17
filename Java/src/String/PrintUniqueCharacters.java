package String;

public class PrintUniqueCharacters {
	public static void main(String args[])
	{
		String s="Java developer me";
		String res="";
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			int count=0;
			if(c[i]=='\u0000') continue;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					
					count++;
					c[j]='\u0000';
				}
			}
			if(count==0)
			System.out.println(c[i]);
		}
	}
}
