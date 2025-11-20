package String;

public class IsAnagram {
	public static void main(String args[]) {
		
	System.out.println(isanagram("Keep","Peek"));
	}
	public static boolean isanagram(String s1, String s2) {
		while(true)
		{
			if(s1.length() != s2.length()) {// if lengths are not equal then they are not anagram
				return false;
			}
			if(s1.length()==0&&s2.length()==0) {// if both strings are empty then they are anagram
				return true;
			}
			char ch1=s1.charAt(0);//taking first char
			char ch2=s2.charAt(0);//taking first char
			for(int i=0;i<s1.length();i++) {
				if(ch1==ch2) {//comparing both chars
					
					s1=s1.replace(ch1+"", "");//" " is used to replace with nothing
					s2=s2.replace(ch2+"", "");//" " is used to replace with nothing
				}
				if(i==s1.length()-1) {//if we reached end of string and char not found then they are not anagram
					return false;
				}
			}
		}
		
	}
}
