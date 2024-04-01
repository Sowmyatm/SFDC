package practice_3;

public class Min_Max_nos {
	
	static void min_max_nos(int max, int min, int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Max no is: "+max);
		System.out.println("Min no is: "+min);
	}

	public static void main(String[] args) {
		
		int arr[]= {69,54,24,8,23,04,109,99};
		int max=arr[0];
		int min=arr[0];
		
		min_max_nos(max, min, arr);
		

	}

}
