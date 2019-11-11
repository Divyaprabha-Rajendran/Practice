package sorting;

import java.util.Scanner;

public class InsertionSort {
	
	int array[];
	int size;
	
	public InsertionSort(int size)
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
		for (int i=1;i<this.size;i++)
		{
			int key = this.array[i];
			int j=i-1;
			
			while(j>=0 && this.array[j]>key)
			{
				this.array[j+1] = this.array[j];
				j=j-1;
				displayArray();
			}
			this.array[j+1]=key;
			System.out.println("after round "+i);
			displayArray();
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
		InsertionSort sort =  new InsertionSort(size);
		sort.populateArray();
		sort.displayArray();
		sort.sorting();
		sort.displayArray();
		scan.close();
	}

}
