package pgms;

public class Matrix_dia_sum {

	
	
	public static void main(String[] args) {
		
		int m[][] = {{1, 2, 3},
					 {4, 5, 6},
					 {7, 8, 9}};
		int n=3;
		
		int dia = 0;
		int bel_sum = 0;
		int total =0;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i==j)
				{
					dia=dia+m[i][j];
				}
				if(i>j)
				{
					bel_sum = bel_sum + m[i][j];
				}
				total = dia + bel_sum;
			}
		}
		System.out.println("bel_sum " + bel_sum);
		System.out.println("total " + total);
		System.out.println("dia " +dia);
		
 }
}
