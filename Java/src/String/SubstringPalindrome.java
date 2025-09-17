package String;

public class SubstringPalindrome {
	public static void main(String args[]) {
		String s = "malayalam";
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 3; j < s.length(); j++) {
				String str = s.substring(i, j);
				if (ispal(str)) {
					System.out.println(str);
				}
			}
		}
	}

	private static boolean ispal(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}
