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
	
}
