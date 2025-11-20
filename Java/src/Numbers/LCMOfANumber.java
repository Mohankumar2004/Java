package Numbers;

public class LCMOfANumber {
	public static void main(String[] args) {
		int num1=56;
		int num2=98;
		int lcm=(num1>num2)?num1:num2;
		while(true)
		{
			if(lcm%num1==0 && lcm%num2==0)
			{
				System.out.println("LCM: "+lcm);
				break;
			}
			lcm++;
		}
	}
}
//LCM = Least Common Multiple