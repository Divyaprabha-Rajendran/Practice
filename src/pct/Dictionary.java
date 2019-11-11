package pct;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dictionary 
{
	public static void print(LinkedList<String> list)
	{
		for (String str : list)
		{
			System.out.println(str);
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		int total = sc.nextInt();
		LinkedList<String> ip_list  = new LinkedList<String>();
		LinkedList<String> q_list  = new LinkedList<String>();
		for(int i=0;i<total;i++)
		{
			ip_list.add(sc.nextLine());
		}
		
		for(int i=0;i<5;i++)
		{
			q_list.add(sc.nextLine());
		}
		
		print(ip_list);
		print(q_list);
		
		String curr = q_list.get(3);
		System.out.println("exp "+curr);
		
		for (String str : ip_list)
		{
		Pattern p = Pattern.compile(str);
		
		System.out.println(str);
		
		Matcher m = p.matcher(curr);
		
		System.out.println(m.find());
		}
	}
}
