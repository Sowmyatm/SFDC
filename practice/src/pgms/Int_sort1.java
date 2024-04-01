package pgms;

import java.util.Arrays;

public class Int_sort1 {
	
	public static void disp_arr(int a[])
	{
		System.out.println(Arrays.toString(a));
	}
	
	public static void int_sort_asc(int a[]) {
		
		int temp;
		System.out.println("before sort");
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
		System.out.println("after sort");
		disp_arr(a);
	}
	
		public static void int_sort_dsc(int a[]) {
		
		int temp;
		System.out.println("before sort");
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
		System.out.println("after sort");
		disp_arr(a);
	}

	public static void main(String[] args) {
		
		int a[]= {2,5,1,3,99,80,6};
		int_sort_asc(a);
		int_sort_dsc(a);
	}
}
