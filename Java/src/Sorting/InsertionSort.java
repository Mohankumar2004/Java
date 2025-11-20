package Sorting;

public class InsertionSort {
	public static void main(String args[])
	{
		int a[]= {5,4,3,2,1};
		insertionSort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	private static void insertionSort(int[] a) {
		
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;//index of the last element in the sorted part of the array
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];//shifting the elements to right to make space for the key
				j--;
			}
			a[j+1]=key;//inserting the key at its correct position
		}
	}
}
