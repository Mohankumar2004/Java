package String;

public class ContainsKeyword {
	public static void main(String args[])
	{
		String s="Java developer me";
		System.out.println(s.contains("developer"));
		System.out.println(s.contains("developer1"));
		System.out.println(s.contains("Java"));
		System.out.println(s.contains("java"));
		System.out.println(s.contains("me"));
		System.out.println(s.contains("Me"));
		System.out.println(s.contains(" "));
		System.out.println(s.contains(""));
		System.out.println(s.contains("a"));
		System.out.println(s.contains("A"));
		System.out.println(s.contains("Java developer me"));
		
		
	}
}
