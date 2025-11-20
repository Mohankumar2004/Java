package Comparator;

import java.util.Comparator;

public class MobileSortByColor implements Comparator<Mobile> {

	
	@Override
	public int compare(Mobile o1, Mobile o2) {
		
		return o1.color.compareTo(o2.color);
	}

}
