package pgms;

import java.util.Arrays;

public class Zero_Starting {

	public static void zero_start(int a[]) {
		
		int temp[]=new int [a.length];
		
		for(int i=0,j=a.length-1; i<a.length;i++)
		{
			if(a[i]!=0)
			temp[j--]=a[i];
		}
		for(int i=0;i<a.length;i++)
			a[i]=temp[i];
		
	}
	public static void main(String[] args) {

		int a[] = {9,0,4,0,8,0,6,1};
		zero_start(a);
		System.out.println(Arrays.toString(a));

	}

}
