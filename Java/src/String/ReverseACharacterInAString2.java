package String;

public class ReverseACharacterInAString2 {
	
	    public static void main(String[] args) {
	        String str = "Hello World Java";
	        String result = "";
	        String word = "";

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if (ch != ' ') {
	                word = word + ch;  // forming each word manually
	            } else {
	                // reverse the word
	                for (int j = word.length() - 1; j >= 0; j--) {
	                    result = result + word.charAt(j);
	                }
	                result = result + " ";
	                word = ""; // reset for next word
	            }
	        }
	        // reverse the last word
	        for (int j = word.length() - 1; j >= 0; j--) {
	            result = result + word.charAt(j);
	        }

	        System.out.println(result);
	    }
	}


