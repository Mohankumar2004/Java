package TypeCasting;
class A{
	void m1() {
		System.out.println("m1 method of class A");
	}
}
class B extends A{
	void m1() {
		System.out.println("m2 method of class B");
	}
}
class C extends A{
	void m1() {
		System.out.println("m3 method of class C");
	}
}
public class Upcasting {
	public static void main(String args[])
	{
		B b1=new B();
		A a1=b1; // upcasting
		a1.m1();// m1 method of class A
		//a1.m2(); // compile time error
		C c1=new C();
		A a2=c1; // upcasting
		a2.m1();// m1 method of class A
		
		
		
	}
}
