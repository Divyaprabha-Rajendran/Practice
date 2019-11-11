package GeekForGeeks;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class DecodeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int times = Integer.parseInt(sc.nextLine().trim());
		
		for(int time=0;time<times;time++)
		{
			
			String ip = sc.nextLine().trim();
			
			char[] arr = ip.toCharArray();
			
			
			String op = "";
			int newStr=0;
			String curr = "";
			for(int i=arr.length-1;i>=0;i--)
			{
				if(arr[i]==']')
				{
					newStr++;
					continue;
				}
				
				if(arr[i]=='[')
				{
					newStr--;
					continue;
				}
				
				if(newStr>0  && Character.isAlphabetic(arr[i]))
				{
					curr = curr+arr[i];
				}
				if(newStr>0  && Character.isDigit(arr[i]) )
				{
					String temp = curr;
					for(int j=1;j<=Integer.parseInt(arr[i]+"")-1;j++)
						{
							curr=curr+temp;
							
						}
					op=op+curr;
					curr="";
				}
				
				if(newStr==0 && Integer.parseInt(arr[i]+"")>=1)
				{
					op=op+curr;
					String temp=op;
					for(int j=1;j<=Integer.parseInt(arr[i]+"")-1;j++)
					{
						//System.out.println(op);
						op=op+temp;
						//System.out.println(op);
					}
				}
				System.out.println(arr[i]);
				System.out.println(op);
			}
			
			StringBuilder strb = new StringBuilder();
			
			strb.append(op);
			
			System.out.println("op  "+strb.reverse());
		}

	}

}

//if(arr[i]=='[' || arr[i]==']')
//	continue;
//else
//{
//	
//	if(Character.isDigit(arr[i])==true)
//	{
//		String temp = op;
//		for(int j=1;j<=Integer.parseInt(arr[i]+"")-1;j++)
//		{
//			op=op+temp;
//			System.out.println(j);
//			System.out.println(op);
//		}
//	}
//	else
//	{
//		System.out.println(arr[i]);
//		op=op+arr[i];
//	}
//}
//System.out.println(op);
