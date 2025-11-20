package NumberAndString;

public class NumberTOString {
	public static void main(String args[])
	{
		int num=22254321;//Two Crore twenty two lakh fifty four thousand three hundred twenty one
		convert(num/10000000,"Crore");
		convert((num/1000000)%100,"Lakh");
		convert((num/1000)%100,"Thousand");
		convert((num/100)%10,"Hundred");
		convert(num%100,"");
		
}

	private static void convert(int i, String string) {
		String one[]={"","One ","Two ","Three ","Four ","Five ","Six ","Seven ","Eight ","Nine ","Ten ",
				"Eleven ","Twelve ","Thirteen ","Fourteen ","Fifteen ","Sixteen ","Seventeen ","Eighteen ","Nineteen "};
		String ten[]={"","","Twenty ","Thirty ","Forty ","Fifty ","Sixty ","Seventy ","Eighty ","Ninety "};
		if(i<=19)
		{
			System.out.print(one[i]);
			
		}
		else
		{
			System.out.print(ten[i/10]+one[i%10]);
		}
		if(i!=0)
		{
			System.out.print(string+" ");
		}
		
	}
}