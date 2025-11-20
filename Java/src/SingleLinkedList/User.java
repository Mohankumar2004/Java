package SingleLinkedList;

public class User {
	public static void main(String args[])
	{
	SingleLinkedlist l=new SingleLinkedlist();
	l.add(10);
	l.add("Hello");
	l.add(30);
	System.out.println(l.size());
	
	for(int i=0;i<l.size();i++)
	{
		System.out.println(l.get(i));
	}
}
}
