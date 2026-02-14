package Queue;

public class ArrayListQueue {
	private Object [] a=new Object[5];
	private int p=0;
	public void enqueue(Object e)
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
	public Object dequeue()
	{
		if(p==0)
			throw new IllegalStateException("Queue is empty");
		Object e=a[0];
		for(int i=0;i<p-1;i++)
		{
			a[i]=a[i+1];
		}
		p--;
		return e;
	}
	
	public int size()
	{
		return p;
	}
	public boolean isEmpty()
	{
		return p==0;
	}
	public Object peek()
	{
		if(p==0)
			throw new IllegalStateException("Queue is empty");
		return a[0];
	}
	public Object pull()
	{
		if(isEmpty())
			throw new IllegalStateException("Queue is empty");
		Object e=a[0];
		for(int i=0;i<p-1;i++)
		{
			a[i-1]=a[i];
		}
		a[--p]=null;
		return e;
	}
	public static void main(String[] args) {
		ArrayListQueue queue=new ArrayListQueue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		System.out.println(queue.dequeue());
		System.out.println(queue.peek());
		System.out.println(queue.size());
	}
}
