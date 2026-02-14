package Arrays;

public class SpiralMatrix2 {
	public static void main(String args[])
	{
		int n=3;
		int a[][]=new int[n][n];
		int row=0;
		int col=-1;
		char dir='R';
		for(int i=1;i<=n*n;i++)
		{
			switch(dir)
			{
			case 'R':
				col++;
				a[row][col]=i;
				if(col==a.length-1 || a[row][col+1]!=0)
					dir='D';
				break;
		
			case 'D':
				row++;
				a[row][col]=i;
				if(row==a.length-1 || a[row+1][col]!=0)
					dir='L';
				break;
			case 'L':
				col--;
				a[row][col]=i;
				if(col==0 || a[row][col-1]!=0)
					dir='U';
				break;
			case 'U':
				row--;
				a[row][col]=i;
				if(row==0 || a[row-1][col]!=0)
					dir='R';
				break;
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
}
}