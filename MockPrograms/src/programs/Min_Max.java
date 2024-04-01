package programs;

import java.util.Scanner;

public class Min_Max {
	
	public static void min_max(int arr[], int min, int max)
	{
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(min + " is min ");
		System.out.println(max + " is max ");
	}
	
	public static void main(String[] args) {
		
		int arr[] = {90, -1, 0, 38, 78};
		int min=arr[0];
		int max=arr[0];
		min_max(arr, min, max);
		
		
		
		
		
	}

}
