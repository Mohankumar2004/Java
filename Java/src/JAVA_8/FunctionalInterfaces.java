package JAVA_8;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {
	int arr []= {1,2,3,4,5,6,7,8,9,10};
	Predicate <Integer> i1=i->i%2==0;
	Function <Integer,Integer> f1=i->i*i;
	
	public static void main(String[] args) {
		for(int n: arr) {
			if(i1.test(n)) {
				System.out.println(f1.apply(n));
			}
		}
	}
}