package pct;

import java.util.Scanner;

public class CreditCheck {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String cc=scan.next();
		
		int encoded=0;
		
		for (int i=0;i<cc.length();i++)
		{
			if(i%2==0)
			{
				encoded = encoded+Integer.parseInt(cc.charAt(i)+"");
			}
			else
			{
				int median = (Integer.parseInt(cc.charAt(i)+""))*2;
				int r = median/10;
				int mod = median%10;
				encoded = encoded+(r+mod);
			}
		System.out.println(encoded);
			
		}
		
		//System.out.println(encoded);
		
		if(encoded%10==0)
			System.out.println("VALID");
		else
			System.out.println("INVAID");
		
	}

}
