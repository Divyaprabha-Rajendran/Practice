package pct;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class FindFrequency {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int size = Integer.parseInt(sc.nextLine().trim());
		
		String dig[] = sc.nextLine().trim().split(" ");
		
		LinkedList<Integer> num = new LinkedList<Integer>();
		
		LinkedList<Integer> freq = new LinkedList<Integer>();
		
		for(int i=0;i<size;i++)
		{
			num.add(Integer.parseInt(dig[i]));
		}
		
		Collections.sort(num);
		//System.out.println(num);
		int i=0;
		int count=1;
		while(i<size-1)
		{
			//System.out.println(i);
			System.out.println(num.get(i)+"  "+num.get(i+1));
			if(num.get(i)==num.get(i+1))
			{
				count++;
			}
			else
			{
				freq.add(count);
				count=1;
			}
			i++;
		}
		freq.add(count);
		System.out.println(num);
		System.out.println(freq);
		
	}

}
