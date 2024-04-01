package mock_Interview.Practice;

public class Sum_Matrix_Diagonal{
	
	static void Diagonal_Sum(int a[][], int n) {
	
		int diagonal_sum=0;
		int below_diagonal_sum=0;
		int sum=0;
		for(int i=0; i<n; i++) 
		{
		
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					diagonal_sum = diagonal_sum+a[i][j];
				}	
				
				if(i>j) //(i!=j)&&
				{
					below_diagonal_sum=below_diagonal_sum+a[i][j];
					
				}
				
				sum=below_diagonal_sum+diagonal_sum;
						
			}
		
		}
		System.out.println("Sum of diagonal is " + diagonal_sum);
		System.out.println("Sum of below_diagonal is " + below_diagonal_sum);
		System.out.println("Sum of diagonal and below value is " +sum);
	}
	
	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},
				    {4,5,6},
				    {7,8,9}};
		
		Diagonal_Sum(a,3);
		
	
	}

}