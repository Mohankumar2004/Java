package String;

public class NumberToWord {
	public static void main(String args[])
	{
		String[] units= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
				"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		String[] tens= {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
		
		int number= 45600000;
		
		String word="";
		
		if(number>=10000000)
		{
			word+=units[number/10000000]+" Crore ";
			number=number%10000000;
		}
		
		if(number>=1000000)
		{
			word+=units[number/1000000]+" lakh ";
			number=number%1000000;
		}
		if(number>=1000)
		{
			word+=units[number/1000]+" Thousand ";
			number=number%1000;
		}
		
		if(number>=100)
		{
			word+=units[number/100]+" Hundred ";
			number=number%100;
		}
		if(number>=20)
		{
			word+=tens[number/10]+" ";
			number=number%10;
		}
		if(number>0)
		{
			word+=units[number]+" ";
		}
		
		System.out.println(word.trim());
	}
}
