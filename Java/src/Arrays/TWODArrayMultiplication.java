package Arrays;

public class TWODArrayMultiplication {
	public static void main(String args[])
	{
		int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int arr2[][]= {{9,8,7},{6,5,4},{3,2,1}};
		int mul[][]=new int[3][3];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				mul[i][j]=0;
				for(int k=0;k<arr1[i].length;k++)
				{
					mul[i][j]+=arr1[i][k]*arr2[k][j];
				}
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
	}
}