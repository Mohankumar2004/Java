package Sorting;

public class QuickSort {
	public static void main(String args[])
	{
		int [] a= {10,7,8,9,1,5};
		sort(a,0,a.length-1);
		for(int num:a)
		{
			System.out.print(num+" ");
		}
	}

	private static void sort(int[] a, int st, int end) {
		if(st>end)
			return;
		int i=st;
		int j=end;
		if(i<j) {
			int p=(st+end)/2;
			while(a[i]<a[p])
			{
				i++;
			}
			while(a[j]>a[p])
			{
				j--;
			}
		}
		if(i<=j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
			sort(a,st,j);
			sort(a,i,end);
		}
	}
}
