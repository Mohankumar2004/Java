package Recursion;

public class Perfectnumber {
	
	public static  boolean isperfect(int n,int i,int sum)
	{
		if(i>n/2) {
			return sum==n;}
		if(n%i==0) {
			sum+=i;}
		return isperfect(n , i+1 , sum);
	}
	public static void main(String args[])
	{
		System.out.println(isperfect(1,1,0));
	}
}
