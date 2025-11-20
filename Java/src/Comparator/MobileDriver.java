package Comparator;

import java.util.Arrays;

public class MobileDriver {
	public static void main(String args[])
	{
		Mobile m1=new Mobile("Redmi",6,64,"Red");
		Mobile m2=new Mobile("Samsung",8,512,"White");
		Mobile m3=new Mobile("Micromax",4,256,"Black");
		Mobile m4=new Mobile("OnePlus",8,128,"Silver");
		Mobile[] m= {m1,m2,m3,m4};
		Arrays.sort(m,new MobileSortByColor());
		
        
		System.out.println(Arrays.toString(m));
	}
}
