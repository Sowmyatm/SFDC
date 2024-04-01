package mock_Interview.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Move_Zeros_To_end {
	
	public static void zeros_at_end(int a[]) {
		 
		int temp[]=new int [a.length];//declaring a new obj  which is of type int and it is an array/ array declaration
		 
		 
		for(int i=0, j=0; i<a.length;i++)
		 {
			 if(a[i]!=0)
			 {
				 temp[j++]=a[i];
				 
			 }
		 }
		for(int i=0; i<a.length;i++)
		{
			a[i]=temp[i];
		}
		 	
	}
	
	public static void main(String[] args) {
		
		int a[] = {0,5,0,0,3,0};
	
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number of elements: ");
//		int num =sc.nextInt();
//		
//		int a[]  = new int[10];
//		System.out.println("Enter the elements: ");
//		for(int i=0;i<num;i++)
//		{
//			a[i]=sc.nextInt();
//		}
			zeros_at_end(a) ;
			System.out.println(Arrays.toString(a));
			
		//sc.close();
	
	}

}
