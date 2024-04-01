package mock_Interview.Practice;

public class Triangle_Pattern {

	public static void main(String[] args) {
		//triangle pattern
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		//reverse triangle pattern
		
		for(int i=0;i<=4;i++) 
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	
		System.out.println("---------------");
		//triangle and reverse combined
		
		for(int i=0;i<=4;i++) 
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		for(int i=0;i<=4;i++)
		{
			for(int j=4;j>i;j--) 
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	
	}
	

}
