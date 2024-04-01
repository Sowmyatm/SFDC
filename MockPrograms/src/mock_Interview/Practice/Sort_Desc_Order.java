package mock_Interview.Practice;

import java.util.Arrays;

public class Sort_Desc_Order {

	public static void main(String[] args) {
		
//		int arr[]= {1,2,3,4,5,6};
//		Arrays.toString(arr);
//		
//		int len = arr.length;
//		System.out.println("Before Sort");
//		System.out.println(Arrays.toString(arr));
//		
//		for(int i=0; i<len-1;i++)
//		{
//			for(int j=0;j<len-1;j++)
//			{
//				if(arr[j]<arr[j+1]) 
//				{
//					
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//					
//					
//				}
//				
//			}
//		}System.out.println("After Sort");
//		System.out.println(Arrays.toString(arr));
//	}
//}
		
//		int len = a.length;
//		System.out.println( "Before Sort");
//		display_array(a);
//		for(int i=0; i<len-1; i++) {//passes
//			for(int j=0; j<len-1; j++) {//iterations
//				if(a[j]<a[j+1]) {
//					int temp = a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//				
//			}
//			
//		}
//		System.out.println( "After Sort");
//		display_array(a);
//		}

	int a[]= {1,2,3,4,5};
	int len=a.length;
	for(int i=0;i<len-1;i++)
		for(int j=0;j<len-1;j++)
		{
			if(a[j]<a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}System.out.println(Arrays.toString(a));

		}

}
	
	