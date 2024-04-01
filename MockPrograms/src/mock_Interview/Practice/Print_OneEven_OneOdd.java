package mock_Interview.Practice;

import java.util.Arrays;

public class Print_OneEven_OneOdd {
	
	static void display_array(int a[]) {
		
		System.out.println(Arrays.toString(a));
		//return 0;
	}
	
	static int array_sort(int a[])
	{
		int temp=0;
		System.out.println( "Before Sort: " );
		display_array(a);
		
		
		for(int i=0; i<a.length-1; i++) {//passes
			for(int j=0; j<a.length-1; j++) {//iterations
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}System.out.println("After sort: ");
		display_array(a);
		return temp;
		
	}
	
	static void print_even_odd(int a[]) {
		
		int find_element_type=0;
		int temp1[]= new int[a.length];
		//int sorted_array = array_sort(a);
		
		for(int i=0,j=0;i<a.length;i++)
		{
			if(find_element_type==0)
			{
				if(a[i]%2==0)
				{	
					temp1[j]=a[i];
					
					find_element_type=1;
					System.out.println(temp1[j]);
					j++;
				}
			}
				if(find_element_type==1)
				{
					if(a[i]%2!=0)
					{
						temp1[j]=a[i];
						System.out.println(temp1[j]);
						j++;
						find_element_type=0;
					}
				}
				
		}//end of for
				System.out.println(temp1.toString());
		
		
	}
	
	public static void main(String[] args) {
		
		int a[] = {7,4,8,3,2,10,6,5};
		array_sort(a);
		print_even_odd(a);
		


	}

}
