package String;

public class MissingVowels {
	public static void main(String args[])
	{
		String s="pen";
		String v="AEIOUaeiou";
		for(int i=0;i<v.length();i++)
		{
			char c=v.charAt(i);
			if(!s.contains(c+""))
			{
				System.out.println(c);
			}
		}
	}
}
