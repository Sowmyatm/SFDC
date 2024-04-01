package mock_Interview.practice_2;

public class Min_Max_Nos {
	
	public static void min_max(int min, int max, int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		
		else
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Max no is :" + max);
		System.out.println("Min no is :" + min);
	}

	

	public static void main(String[] args) {
		
		int arr[]= {56,0,1,-9,80,4,-10};
		int min=arr[0];
		int max=arr[0];
		min_max(min, max,arr);
		
	}

}
