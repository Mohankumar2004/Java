package Sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String args[])
	{
		int [] a= {2,5,1,5,3};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	private static void sort(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			int SmallElementIndex=i;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>a[SmallElementIndex])
				{
					SmallElementIndex=j;
				}
				int temp=a[i];
				a[i]=a[SmallElementIndex];
				a[SmallElementIndex]=temp;
			}
		}	
	}
}
