package String;

public class RemoveADuplicateCharInAString {
	public static void main(String args[])
	{
		String s="java";
		String res="";
		char [] c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='\u0000');
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j]) {
					c[j]='\u0000';
				}
			}
			res+=c[i];
		}
		System.out.println(res);
	}
}
