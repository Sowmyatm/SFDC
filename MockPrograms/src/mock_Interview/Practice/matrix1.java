package mock_Interview.Practice;

public class matrix1 {
	
	static void sum_dia_matrix(int a[][], int n)
	{
		int sum_dia_matrix=0, sum_below_matrix=0, total_sum = 0;
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==j)
				{
					sum_dia_matrix=sum_dia_matrix+a[i][j];
				}
				if(i>j)
				{
					sum_below_matrix=sum_below_matrix+a[i][j];
				
				}
				total_sum=sum_dia_matrix+sum_below_matrix;
			}	
		}
		System.out.println("Diagonal sum: "+ sum_dia_matrix);
		System.out.println("Below diagonal sum: "+ sum_below_matrix);
		System.out.println("Total sum: "+ total_sum);
		
		
	}
	

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},
					{4,5,6},
					{7,8,9}};
		
		sum_dia_matrix(a,3);
		}
}
