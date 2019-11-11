package GeekForGeeks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = Integer.parseInt(sc.nextLine().trim());
		
		for(int time=0;time<times;time++)
		{
			int size = Integer.parseInt(sc.nextLine().trim());
			
			String arr[] = sc.nextLine().trim().split(" "); ;
			
			LinkedList<String> values = new LinkedList<String>(Arrays.asList(arr)); 
			
			boolean unique=false;
			
			int i=0;
			
			while( i<values.size()-1)
			{
				if(values.get(i).equals(values.get(i+1)))
				{
					//System.out.println(i);
					values.remove(i);
					values.remove(i);
					i=0;
					
				}
				else
				{
					i=i+1;
				}
				//System.out.println(values);
			}
			
			System.out.println(values.size());
		}

	}

}
