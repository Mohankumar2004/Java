package TypeCasting;
class AA{
	void m1() {
		System.out.println("m1 method of class A");
	}
}
class BB extends AA{
	
	void m2() {
		System.out.println("m2 method of class B");
	}
}
class CC extends AA{
	void m2() {
		System.out.println("m2 method of class C");
	}
	void m1() {
		System.out.println("m1 method of class C");
	}
}
class DD{
	void m4() {
		System.out.println("m4 method of class D");
	}
}
public class Upcasting {
	public static void main(String args[])
	{
		BB b1=new BB();
		b1.m1();                            // m1 method of class A
		AA a1=b1; // upcasting               
		a1.m1();// m1 method of class A     // late binding
		//a1.m3(); // compile time error
		CC c1=new CC();
		AA a2=c1; // upcasting               
		a2.m1();// m1 method of class A      // late binding
		//AA a3=new DD(); 
		
		
	}
}
