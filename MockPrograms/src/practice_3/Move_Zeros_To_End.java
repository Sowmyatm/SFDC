package practice_3;

import java.util.Arrays;

public class Move_Zeros_To_End 
{
	
	static void zeros_to_end(int a[])
	{
		int temp[]=new int[a.length];
		for(int i=0,j=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				temp[j++]=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			a[i]=temp[i];
		}
		
	}


	public static void main(String[] args) 
	{
		int a[] = {0,5,0,0,3,0};
		
		zeros_to_end(a);
		System.out.println(Arrays.toString(a));
	}

}
