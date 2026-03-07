package StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElementsinaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1,2,3,2,4,5,3);

        Set<Integer> set = new HashSet<>();

        list.stream()
            .filter(n -> !set.add(n))
            .forEach(System.out::println);

	}

}
