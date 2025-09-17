package String;

public class RemoveDuplicate2 {
	public static void main(String args[])
	{
		String s="newwe";
		String res=" ";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(!res.contains(c+""))
			res+=c;
		}
		System.out.println(res);
	}
}
