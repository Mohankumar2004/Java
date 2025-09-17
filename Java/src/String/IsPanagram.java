package String;

public class IsPanagram {
	public static void main(String args[])
	{
		String s="A Quick Brown Fox Jumps Over The Lazy Dog";
		System.out.println(isPanagram(s));
	}

	private static boolean isPanagram(String s) {
		s=s.toLowerCase();
		if(s.length()<25)
			return false;
		for(char c='a';c<='z';c++)
		{
			if(!s.contains(c+""));
			return true;
		}
		return false;
	}
}
