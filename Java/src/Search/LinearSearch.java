package Search;

public class LinearSearch {
	int a []= {10,20,30,40,50};
	public static void main(String args[])
	{
		LinearSearch ls=new LinearSearch();
		for(int i=0;i<ls.a.length;i++)
		{
			System.out.println("Element "+ls.a[i]+" found at index: "+ls.linearSearch(ls.a,ls.a[i]));
		}
		
		
	}
	private int linearSearch(int[] a, int key) {
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
	
}
