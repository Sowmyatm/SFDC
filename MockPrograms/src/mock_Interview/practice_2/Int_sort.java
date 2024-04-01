package mock_Interview.practice_2;

import java.util.Arrays;

public class Int_sort {

	public static void disp_arr(int a[])
	{
		System.out.println(Arrays.toString(a));
	}
	
	public static void asc_sort(int a[])
	{
		int temp;
		System.out.println("Before sort");
		disp_arr(a);
		
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
		disp_arr(a);
		
	}
	
	public static void desc_sort(int a[])
	{
		int temp;
		System.out.println("Before sort");
		disp_arr(a);
		
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
		disp_arr(a);
	}

	public static void main(String[] args) {
		
		int a[]= {123,3,9,87,100,56,54,1};
		
		asc_sort(a);
		desc_sort(a);
		
		
	}

}
