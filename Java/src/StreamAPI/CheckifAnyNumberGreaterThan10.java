package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class CheckifAnyNumberGreaterThan10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(2,5,8,12);

        boolean result =
                list.stream()
                .anyMatch(n -> n > 10);

        System.out.println(result);
	}

}
