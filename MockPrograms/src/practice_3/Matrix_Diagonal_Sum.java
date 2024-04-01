package practice_3;

public class Matrix_Diagonal_Sum {
	
	static void diagonal_sum(int a[][],int n)
	{
		int dia_sum=0;
		int bel_dia_sum=0;
		int total_sum=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					dia_sum=dia_sum+a[i][j];
				}
				if(i>j)
				{
					bel_dia_sum=bel_dia_sum+a[i][j];
				}
				total_sum=dia_sum+bel_dia_sum;
				
			}
		}
		System.out.println("Dia sum : "+dia_sum);
		System.out.println("Below dia sum: " +bel_dia_sum);
		System.out.println("Total sum : "+ total_sum);
		
	}

	public static void main(String[] args) {
		
		int a[][]	= {{1,2,3},
				  	   {4,5,6},
				       {7,8,9}};
		int n=3;
		
		diagonal_sum(a,n);
				
	
	}

}
