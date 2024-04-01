package mock_Interview.practice_1;

import java.util.Arrays;

public class Sum_ShowArray_Index {
	
	static int[] two_Sum(int [] num, int target)
	{
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num.length;j++)
			{
				if(num[i]+num[j]==target)
				{
					
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1}; //if the target is 0, this line works
		
	}

	public static void main(String[] args) {
		
		int [] num = {1,2,3,4,5};
		int target = 5;
		
		System.out.println(Arrays.toString(two_Sum(num,target)));
	}

}
