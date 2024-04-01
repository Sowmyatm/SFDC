package programs;

import java.util.Arrays;

public class Integer_Sort {
	
	public static void disp_arr(int num[])
	{
		System.out.println(Arrays.toString(num));
		
	}
	public static void asc_sort(int num[])
	{
		int temp;
		System.out.println("Before sort: ");
		disp_arr(num);
		
		for(int i=0;i<num.length-1;i++)
		{
			for(int j=0;j<num.length-1;j++)
			{
				if(num[j]>num[j+1])
				{
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		System.out.println("After sort: ");
		disp_arr(num);
	}
	
	public static void dsc_sort(int num[])
	{
		int temp;
		System.out.println("Before sort: ");
		disp_arr(num);
		
		for(int i=0;i<num.length-1;i++)
		{
			for(int j=0;j<num.length-1;j++)
			{
				if(num[j]<num[j+1])
				{
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		System.out.println("After sort: ");
		disp_arr(num);
	}
	
	public static void main(String[] args) {
		
		int num[]= {12,45,0,2,0,-1,4};
		
		
		asc_sort(num);
		dsc_sort(num);

	}
}
