package String;

public class ArrangeTheCharInCaseOrder {
	public static void main(String args[])
	{
		String s="javaDeveloper";
		int UC=0,LC=0,NC=0,SC=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='A'&&c<='Z') UC=UC+c;
			else if(c>='a'&&c<='z') LC+=c;
			else if(c>='0' && c<='9') NC+=c;
			else SC+=c;
			
		}
		System.out.println("UC "+UC+"\nLC "+LC+"\nNC "+NC+"\nSC "+SC);
	}
}
