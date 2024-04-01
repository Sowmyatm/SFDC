package mock_Interview.practice_1;

import java.util.Arrays;

public class Int_Sort {
	
	
	static void display_arr(int a[])
	{
		System.out.println(Arrays.toString(a));
	}
	
	static void int_sort_asc(int a[])
	{
		int temp;
		System.out.println("Before sort");
		display_arr(a);
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		System.out.println("After sort");
		display_arr(a);
		
		
	}
	
	static void int_sort_desc(int a[])
	{
		System.out.println("Before sort");
		display_arr(a);
		int temp;
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
			
		}
		System.out.println("After sort");
		display_arr(a);
		
	}

	public static void main(String[] args) {
		
		int a[]= {12,3,9,87,100,56,54};
		
		//display_arr(a);
		int_sort_asc(a);
		int_sort_desc(a);
		
		
		
	}

}
