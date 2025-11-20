package Numbers;

public class PalindromeNumber {
	public static void main(String[] args) {
		int n=121;
		int r,sum=0,temp;    
		temp=n;    
		while(n>0){    
			r=n%10;  //getting remainder  
			sum=(sum*10)+r;    
			n=n/10;    
		}    
		if(temp==sum)    
			System.out.println("Palindrome Number ");    
		else    
			System.out.println("Not a Palindrome Number");    
	}
}
//121 = 1*100 + 2*10 + 1*1 = 121