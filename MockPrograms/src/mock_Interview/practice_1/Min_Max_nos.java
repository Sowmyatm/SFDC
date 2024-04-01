package mock_Interview.practice_1;

public class Min_Max_nos {
	
	static void min_max(int min, int max, int arr[])
	{
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
			if(arr[i]<min)
			{
				min=arr[i];
				
			}
		}
		System.out.println("Max number is:" +max);
		System.out.println("Min number is:" +min);
		
	}

	public static void main(String[] args) {
		
		int arr[]= {69,54,24,8,23,04,10,99};
		int max=arr[0];
		int min=arr[0];
		min_max(min,max,arr);
		

	}

}
