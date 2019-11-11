package sorting;

import java.util.Scanner;

public class SelectionSort {

	int array[];
	int size;
	
	public SelectionSort(int size)
	{
		this.size = size;
		this.array = new int[size];
	}
	
	public void populateArray()
	{
		for (int i=0;i<size;i++)
		{
			this.array[i]=(int) (Math.random()*100);
		}
	}
	
	public void sorting()
	{
		int start=0;
		while(start!=size-1)
		{
			int min_index=-1;
			for (int i=start;i<this.size;i++)
			{
				if(this.array[i]<this.array[i+1])
					min_index=i;
			}
			int temp=this.array[min_index];
			this.array[start] = this.array[min_index];
			this.array[min_index]=temp;
			
			start++;
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
