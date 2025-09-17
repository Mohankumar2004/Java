package String;

public class OccuranceOfEachChar {
	public static void main(String args[])
	{
		String s1="Java Dev";
		String s2="";
		while(s1.length()>0)
		{
			char c=s1.charAt(0);
			s2=s1.replace(c+"","");
			System.out.println(c+"="+(s1.length()-s2.length()));
			s1=s2;
		}
	}
}
