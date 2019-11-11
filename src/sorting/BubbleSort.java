package sorting;

import java.util.Scanner;

public class BubbleSort 
{
	int array[];
	int size;
	
	public BubbleSort(int size)
	{
		this.size = size;
		this.array = new int[size];
	}
	
	public void populateArray()
	{
		for (int i=0;i<size;i++)
		{
			this.array[i]=(int) (Math.random()*1000);
		}
	}
	
	public void sorting()
	{
		boolean isSorted = false;
		while(!isSorted)
	{
	   isSorted = true;
	   for (int i=0;i<this.size-1;i++)
	   {
		   if (this.array[i]>this.array[i+1])
		   {
			   int temp = this.array[i];
			   this.array[i]=this.array[i+1];
			   this.array[i+1] = temp;
			   isSorted=false;
		   }
	   }
	}
	}
	
	public void displayArray()
	{
		String display_str="";
		for (int i=0;i<size;i++)
		{
			display_str=display_str+this.array[i]+",";
		}
		System.out.println(display_str);
	}
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		BubbleSort sort =  new BubbleSort(size);
		sort.populateArray();
		sort.displayArray();
		sort.sorting();
		sort.displayArray();
		scan.close();
	}
}
