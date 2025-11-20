package String;

public class CountAWordInAString {
	public static void main(String args[])
	{
		String s="Java  Developer me";
		String s1=s.trim(); //removes space before and after the string
		System.out.println(s1);
		int count=1;
		int j=0;
		while(j<s1.length())
		{
			if(s1.charAt(j)==' '&&s1.charAt(j+1)!=' ')
			{
				count++;
			}
			j++;
		}
		System.out.println(count);
	}
}
