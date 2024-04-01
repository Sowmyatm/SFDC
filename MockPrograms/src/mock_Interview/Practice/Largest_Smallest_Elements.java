package mock_Interview.Practice;

import java.util.Arrays;

public class Largest_Smallest_Elements {
	
	public static void main(String[] args) {
		
		int arr[]= {04,10,69,54,8,100,1};
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("large no " + max);
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			
		}
		System.out.println("min no " + min);
	}	
}
