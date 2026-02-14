package ArrayList;

public class ArrayList {
	private Object [] a=new Object[5];
	private int p=0;
	public void add(Object e)
	{
		if(p==a.length)
		increasearraysize();
		a[p]=e;
		p++;
	}
	private void increasearraysize() {
		Object [] b=new Object[a.length+2];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		a=b;
		
	}
	public void add(int index,Object e)
	{
		if(p==a.length)
			increasearraysize();
		for(int i=p-1;i>=index;i--)
		{
			a[i+1]=a[i];
		}
		a[index]=e;
		p++;
	}
	public Object get(int index)
	{
		if(index<0 || index>=p)
			throw new IndexOutOfBoundsException("Index: "+index+", Size: "+p);
		return a[index];
	}
	public int size()
	{
		return p;
	}
	public void remove(int index)
	{
		if(index<0 || index>=p)
			throw new IndexOutOfBoundsException("Index: "+index+", Size: "+p);
		for(int i=index;i<p-1;i++)
		{
			a[i]=a[i+1];
		}
		p--;
	}
	public boolean contains(Object e)
	{
		for(int i=0;i<p;i++)
		{
			if(a[i].equals(e))
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("A");
		list.add("B");
		list.add("C");
		
		list.add(1,"D");  //insert D at index 1
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("Size: "+list.size());  //print size
		
		list.remove(2);  //remove element at index 2
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("Contains B: "+list.contains("B")); //check if B is present false
		System.out.println("Contains C: "+list.contains("C")); //check if C is present true
	}
}
