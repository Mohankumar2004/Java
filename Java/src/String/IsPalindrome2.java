package String;

public class IsPalindrome2 {
	public static void main(String args[])
	{
		System.out.println(isPalindrome("malayalam"));
	}

	private static boolean isPalindrome(String s) {
		
		int i=s.length();
		int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			return false;
			i++;
			j--;
		}
		return true;
		
	}
}
