package Search;

public class BinarySeach {
	public static void main(String arhs[])
	{
		int [] a= {10,20,30,40};
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Element "+a[i]+" found at index: "+binarySearch(a,a[i]));
		}
		
		
	}

	private static String binarySearch(int[] a, int i) {
		int left=0;
		int right=a.length-1;
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(a[mid]==i)
			{
				return String.valueOf(mid);
			}
			else if(a[mid]<i)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		return "Not Found";
	}
	
}
