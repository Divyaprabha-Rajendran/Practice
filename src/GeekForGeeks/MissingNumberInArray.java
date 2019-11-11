package GeekForGeeks;

import java.util.Scanner;

public class MissingNumberInArray {
	
	public static void main(String args[])
	{
Scanner sc = new Scanner(System.in);
		
		int times = Integer.parseInt(sc.nextLine().trim());
		
		for(int time=0;time<times;time++)
		{
		
		int size = Integer.parseInt(sc.nextLine().trim());
		
		String dig[]=sc.nextLine().trim().split(" ");
		
		int num[] = new int[size];
		for(int i=0;i<size-1;i++)
		{
			//System.out.println(i);
			num[i]=Integer.parseInt(dig[i]);
		}
		
		boolean found = false;
		int begin = 0;
		int end = size;
		while(found==false)
		{
			int temp = (end-begin)/2+begin;
			System.out.println(temp);
			if(num[temp]==temp+1)
			{
				begin=(end/2)+1;
			}
			else
			{
				for(int i=temp;i<size-1;i++)
				{
					if(num[temp]==temp+1)
					{
						continue;
					}
					else
					{
						System.out.println(temp+1);
						found = true;
						break;
					}
				}
			}
		}
		
		
		}
		
	}

}
