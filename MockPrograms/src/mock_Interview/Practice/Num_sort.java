package mock_Interview.Practice;

import java.util.Arrays;
import java.util.Scanner;
public class Num_sort {
	
public static void display_array(int a[])
{
		System.out.println( Arrays.toString(a));
}

public static void bubble_sort_asc(int a[])
{
	//int len = a.length;
	System.out.println( "Before Sort");
	display_array(a);
	for(int i=0; i<a.length-1; i++) {//passes
		for(int j=0; j<a.length-1; j++) {//iterations
			if(a[j]>a[j+1]) {
				int temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			
		}
		
	}
	System.out.println( "After Sort");
	display_array(a);
}

public static void bubble_sort_des(int a[])
{
	//int len = a.length;
	System.out.println( "Before Sort");
	display_array(a);
	for(int i=0; i<a.length-1; i++) {//passes
		for(int j=0; j<a.length-1; j++) {//iterations
			if(a[j]<a[j+1]) {
				int temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			
		}
		
	}
	System.out.println( "After Sort");
	display_array(a);
	}

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
		int a[]= {2,10,1,44,13,99,103,34};
//		
		bubble_sort_asc(a);
		bubble_sort_des(a);
	}
}


		
		

	
		




		