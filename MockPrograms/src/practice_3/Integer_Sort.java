package practice_3;

import java.util.Arrays;

public class Integer_Sort 
{
	static void display_sort(int arr[])
	{
		System.out.println(Arrays.toString(arr));
	}
	
	static void asc_sort(int arr[])
	{
		int temp;
		System.out.println("Before sort");
		display_sort(arr);
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
					
			}
		}
		System.out.println("After sort");
		display_sort(arr);
		
	}
	static void desc_sort(int arr[])
	{
		int temp;
		System.out.println("Before sort");
		display_sort(arr);
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
					
			}
		}
		System.out.println("After sort");
		display_sort(arr);
	}	

	public static void main(String[] args) 
	{
		int arr[]= {0,12,100,89,05,900,45,69};
		
		asc_sort(arr);
		desc_sort(arr);

	}

}
