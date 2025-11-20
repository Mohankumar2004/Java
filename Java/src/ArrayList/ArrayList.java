package ArrayList;

public class ArrayList {
	private Object [] a=new Object[5];
	private int p=0;
	public void add(Object e)
	{
		if(p==a.length)
		{
			Object [] b=new Object[a.length*2];
			for(int i=0;i<a.length;i++)
			{
				b[i]=a[i];
			}
			a=b;
		}
		a[p]=e;
		p++;
	}
}
