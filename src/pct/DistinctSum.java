package pct;

import java.util.LinkedList;
import java.util.Scanner;

public class DistinctSum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int sum = Integer.parseInt(sc.nextLine().trim());
		
		int size = Integer.parseInt(sc.nextLine().trim());
		
		String dig[] = sc.nextLine().trim().split(" ");
		
		LinkedList<Integer> num = new LinkedList<Integer>();
		
		for(int i=0;i<size;i++)
		{
			num.add(Integer.parseInt(dig[i]));
		}	
		
		int count=0;
		int pointer=0;
		int curr_sum=0;
		int i=0;
		while(pointer<size-1 && i<size-1)
		{
			if(num.get(i)==sum)
			{
				count++;
				System.out.println("increments here ");
				pointer++;
				i=pointer;
				System.out.println(i);
				continue;
			}
			curr_sum=curr_sum+num.get(i);
			if(curr_sum>sum)
			{
				System.out.println("remove "+num.get(i));
				curr_sum=curr_sum-num.get(i);
			}
			else if(curr_sum==sum)
			{
				curr_sum=0;
				count++;
				System.out.println("increments here ");
				pointer++;
				i=pointer;
				System.out.println(i);
				continue;
			}
			i++;
			if(i==size-1)
			{
				curr_sum=0;
				i=pointer+1;
			}
			System.out.println(i);
		}
		System.out.println("count "+count);
	}

}
