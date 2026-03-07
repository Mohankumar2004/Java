package StreamAPI;

public class CountCharactersinaString {
	public static void main(String[] args) {

        String str = "java";

        long count = str.chars().count();

        System.out.println(count);
    }
}
