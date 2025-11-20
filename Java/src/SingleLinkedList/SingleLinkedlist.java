package SingleLinkedList;

public class SingleLinkedlist {
	private Node first=null;
	private Node last=null;
	private int count=0;
	void add(Object e)
	{
		if(first==null) {
			first=new Node(e,null);
			last=first;
			count++;
			return;
		}
		last.next=new Node(e,null);
		last=last.next;
		count++;
	}
	public int size()
	{
		return count;
	}
	public Object get(int index)
	{
		if(index<0 || index>=count)
		{
			throw new IndexOutOfBoundsException("Index: "+index+", Size: "+count);
		}
		Node current=first;
		for(int i=0;i<index;i++)
		{
			current=current.next;
		}
		return current.ele;
	}
	void insert(int index,Object e)
	{
		if(index<0 || index>count)
		{
			throw new IndexOutOfBoundsException("Index: "+index+", Size: "+count);
		}
		if(index==0)
		{
			first=new Node(e,first);
			if(count==0)
			{
				last=first;
			}
			count++;
			return;
		}
		else if(index==count)
		{
			last.next=new Node(e,null);
			last=last.next;
			count++;
		}
		else
		{
			Node current=first;
			for(int i=0;i<index-1;i++)
			{
				current=current.next;
			}
			current.next=new Node(e,current.next);
			count++;
		}
		
		
	}
	void remove(int index)
	{
		if(index<0 || index>=count)
		{
			throw new IndexOutOfBoundsException("Index: "+index+", Size: "+count);
		}
		if(index==0)
		{
			first=first.next;
			count--;
			if(count==0)
			{
				last=null;
			}
		}
		else if(index==count-1)
		{
			Node current=first;
			for(int i=0;i<index-1;i++)
			{
				current=current.next;
			}
			current.next=null;
			last=current;
			count--;
		}
		else
		{
			Node current=first;
			for(int i=0;i<index-1;i++)
			{
				current=current.next;
			}
			current.next=current.next.next;
			count--;
		}
	}
	
}
