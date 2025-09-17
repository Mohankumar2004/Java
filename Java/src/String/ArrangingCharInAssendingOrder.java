package String;

public class ArrangingCharInAssendingOrder {
	
		public static void main(String args[])
		{
			String s="Java developer me";
			
			char[] c=s.toCharArray();
			for(int i=0;i<c.length;i++)
			{
				int count=0;
				if(c[i]==' ') continue;
				for(int j=i+1;j<c.length;j++)
				{
					if(c[i]>c[j])
					{
						char temp=c[i];
						c[i]=c[j];
						c[j]=temp;
					}
				}
				
			}
			System.out.println(c);
		}


}
