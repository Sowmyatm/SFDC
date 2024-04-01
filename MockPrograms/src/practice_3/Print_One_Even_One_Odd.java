package practice_3;

import java.util.Arrays;

public class Print_One_Even_One_Odd {
	
	static void display_arr(int a[])
	{
		System.out.println(Arrays.toString(a));
	}

	static int arr_sort(int a[])
	{
		int temp=0;
		System.out.println("Before sort");
		display_arr(a);
		
		for(int i=0;i<a.length-1;i++)//passes
		{
			for(int j=0;j<a.length-1;j++)//iterations
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		System.out.println("After sort" );
		display_arr(a);
		return temp;
	}
	
	static void print_odd_even(int a[])
	{
		int find_element_type=0;
		int temp1[]=new int[a.length];
		//int sorted array=arr_sort(a)
		
		for(int i=0,j=0;i<a.length;i++)
		{
			if(find_element_type==0)
			{
				if(a[i]%2==0)//even
				{	
					temp1[j]=a[i];
					
					find_element_type=1;
					System.out.println(temp1[j]);
					j++;
				}
			}
				if(find_element_type==1)
				{
					if(a[i]%2!=0)//odd
					{
						temp1[j]=a[i];
						System.out.println(temp1[j]);
						j++;
						find_element_type=0;
					}
				}
				
		}
				System.out.println(temp1.toString());
	}
	
	public static void main(String[] args)
	{
		int a[] = {7,4,8,3,2,10,6,5};
		arr_sort(a);
		print_odd_even(a);
	}

}
