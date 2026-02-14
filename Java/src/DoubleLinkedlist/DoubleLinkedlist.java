package DoubleLinkedlist;

public class DoubleLinkedlist {
	private Node first=null;
	private Node last=null;
	private int count=0;
	void add(Object e)
	{
		if(first==null) {
			first=new Node(e,null,null);
			last=first;
			count++;
			return;
		}
		last.Next=new Node(e,null,last);
		last=last.Next;
		count++;
	}
	public Object get(int index) {
		if(index<0 || index>=count)
		{
			throw new IndexOutOfBoundsException("Index: "+index+", Size: "+count);
		}
		Node current=first;
		for(int i=0;i<index;i++)
		{
			current=current.Next;
		}
		return current.ele;
	}
	public int size() {
		return count;
	}
	public void remove(int index) {
		if(index<0 || index>=count)
		{
			throw new IndexOutOfBoundsException("Index: "+index+", Size: "+count);
		}
		Node current=first;
		for(int i=0;i<index;i++)
		{
			current=current.Next;
		}
		if(current.Previous!=null)
		{
			current.Previous.Next=current.Next;
		}
		else
		{
			first=current.Next;
		}
		if(current.Next!=null)
		{
			current.Next.Previous=current.Previous;
		}
		else
		{
			last=current.Previous;
		}
		
		count--;
		
	}
	public void display() {
		Node current=first;
		while(current!=null)
		{
			System.out.print(current.ele+" ");
			current=current.Next;
		}
		System.out.println();
	}
	public void displayReverse() {
		Node current=last;
		while(current!=null)
		{
			System.out.print(current.ele+" ");
			current=current.Previous;
		}
		System.out.println();
	}
	
	public void update(int index,Object e) {
		if(index<0 || index>=count)
		{
			throw new IndexOutOfBoundsException("Index: "+index+", Size: "+count);
		}
		Node current=first;
		for(int i=0;i<index;i++)
		{
			current=current.Next;
		}
		current.ele=e;
		
	}
	
}
