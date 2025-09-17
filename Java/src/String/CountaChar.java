package String;

public class CountaChar {
	public static void main(String args[])
	{
		String s="javaDeveloper";
		int UC=0,LC=0,NC=0,SC=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='A'&&c<='Z') UC++;
			else if(c>='a'&&c<='z') LC++;
			else if(c>='0' && c<='9') NC++;
			else SC++;
			
		}
		System.out.println("UC "+UC+"\nLC "+LC+"\nNC "+NC+"\nSC "+SC);
	}
}
