package mock_Interview.practice_2;

import java.util.Arrays;
import java.util.Scanner;

public class Integer_sort {
	
	static void arr_disp(int a[])
	{
		System.out.println(Arrays.toString(a));
	}
	
	static void int_sort1_asc(int a[])
	{
		int temp;
		System.out.println("Before sort: ");
		arr_disp(a);
		
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
		System.out.println("After sort: ");
		arr_disp(a);
	}
	
	static void int_sort1_desc(int a[])
	{
		int temp;
		System.out.println("Before sort: ");
		arr_disp(a);
		
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
		System.out.println("After sort: ");
		arr_disp(a);
		
	}

	public static void main(String[] args) {
		
	int a[]= {23,1,4,0,53,36,10,16,45,99,88,100,25};
	
	int_sort1_asc(a);
	int_sort1_desc(a);
	
		
	}

}
