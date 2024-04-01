package Practice;

public class Mirror_Of_Triangle_Pattern {

	public static void main(String[] args) {
		//triangle pattern mirrored
		
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
		
			System.out.println(" ");
		}
//		
//		
		System.out.println("------------");
		//pyramid pattern 
		
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
		
			System.out.println();
		}
	
		System.out.println("-------------");
		
		//Diamond pattern
		
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
		
			System.out.println();
		}
		
		for(int i=1;i<=3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=3;k>=i;k--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		}
	}



