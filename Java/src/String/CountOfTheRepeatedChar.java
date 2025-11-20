package String;

public class CountOfTheRepeatedChar {

	public static void main(String args[]) {
		String s = "Java developer me";
		String res = "";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int count = 1;
			if (c[i] == ' ')
				continue;
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					count++;
				}
			}

			System.out.println(c[i] + "=" + count);
		}
	}

}