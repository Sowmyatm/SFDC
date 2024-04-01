package practice_1;

public class sums_running_array {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int temp=0;
		
		for(int i=0;i<arr.length;++i)
		{
			temp=temp+arr[i];
			System.out.println(temp);
		}
	}

}
