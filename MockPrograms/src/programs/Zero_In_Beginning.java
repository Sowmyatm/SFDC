package programs;

import java.util.Arrays;

public class Zero_In_Beginning {
	
	public static void zero_starting(int a[])
	{
		int temp[]=new int[a.length];// array declaration
		
		for(int i=0,j=a.length-1;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				temp[j--]=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			a[i]=temp[i];
		}
	}
	public static void main(String[] args) {
		
		int a[]= {7,0,8,0,9,6,0,5,0};
		
		zero_starting(a);
		System.out.println(Arrays.toString(a));
	}

}
