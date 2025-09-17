package String;

public class IsPalindrome {
	public static void main(String args[])
	{
		String s="madam";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			rev+=c;
		}
		if(s.equals(rev))
		{
			System.out.println("Is Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}
}
