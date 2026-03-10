package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringsbyLength {
	
	    public static void main(String[] args) {

	        List<String> list = Arrays.asList("Java","C","Python","Go");

	        list.stream()
	            .sorted(Comparator.comparing(String::length))
	            .forEach(System.out::println);
	    }
	
}
