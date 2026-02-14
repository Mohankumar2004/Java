package Sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String args[])
	{
		int [] a= {10,4,5,3,2,7};//4,10,5,3,2,7
		                        //4,5,10,3,2,7
		                        //4,5,3,10,2,7
		                        //4,5,3,2,10,7
		                        //4,5,3,2,7,10
		                        
		                        //4,3,5,2,7,10
		                        //4,3,2,5,7,10
		                        //4,3,2,5,7,10
		                        
		                        //3,4,2,5,7,10
		                        //3,2,4,5,7,10
		                        
		                        //2,3,4,5,7,10
		sort(a);
		System.out.println(Arrays.toString(a));
	}

	private static void sort(int[] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
}
