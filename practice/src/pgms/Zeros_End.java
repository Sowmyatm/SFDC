package pgms;

import java.util.Arrays;

public class Zeros_End {
	
	public static void zero_end(int a[])
	{
		int temp[]=new int[a.length];
		
		for(int i=0, j=0;i<a.length;i++)
		{
			if(a[i]!=0)
				temp[j++]=a[i];
		}
		for(int i=0;i<a.length;i++)
			a[i]=temp[i];
	}


	public static void main(String[] args) {
		int a[]= {0,9,0,1,0,2,0,0,4,6};

		zero_end(a);
		System.out.println(Arrays.toString(a));
	}
}
