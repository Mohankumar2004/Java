package String;

public class CountAVowels {
	public static void main(String args[]) {
		
	String s="Java";
	String s1=s.toLowerCase();
	int count=0 ;
	for(int i=0;i<s1.length();i++)
	{
		char c=s1.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			count++;
		}
	}
	System.out.println(count);
	}
}
