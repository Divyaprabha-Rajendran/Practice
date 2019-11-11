package GeekForGeeks;

import java.util.Scanner;

public class SubarraySum 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int times = Integer.parseInt(sc.nextLine().trim());
		
		for(int time=0;time<times;time++)
		{
		
		String ip = sc.nextLine().trim();
		
		int size = Integer.parseInt(ip.split(" ")[0]);
		int find = Integer.parseInt(ip.split(" ")[1]);
		
		String dig[]=sc.nextLine().trim().split(" ");
		
		int num[] = new int[size];
		for(int i=0;i<size;i++)
		{
			//System.out.println(i);
			num[i]=Integer.parseInt(dig[i]);
		}
		boolean got=false;
		int current_sum=0;
		int pointer =0;
		for(int i=0;i<size;i++)
		{
			
			current_sum=current_sum+num[i];
			while(current_sum>find)
			{
				current_sum=current_sum-num[pointer];
				if(current_sum==find)
				{	
					got = true;
					pointer++;
					break;
				}
				else {
					pointer++;
				}
				//System.out.println("incrementing pointer "+pointer);
				
			}
			if(current_sum==find)
			{	
				got = true;
				System.out.println((pointer+1)+" "+(i+1));
				break;
			}
			//System.out.println(current_sum);
		}
		if(!got)
		{
			//System.out.println((pointer+1)+" "+(i+1));
			System.out.println(-1);
		}
		
		}
		
	}
}
