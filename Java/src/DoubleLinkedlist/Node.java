package DoubleLinkedlist;

public class Node {
	Object ele;
	Node Next;
	Node Previous;
	public Node(Object e,Node n,Node p)
	{
		ele=e;
		Next=n;
		Previous=p;
	}
}
