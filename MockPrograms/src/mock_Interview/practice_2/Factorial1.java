package mock_Interview.practice_2;

import java.util.Scanner;

public class Factorial1 {
	
	public static int fact(int n)
	{
		int fact =1;
		for(int i=1;i<=n;i++)
		{
			if(n==0)
			{
				return 1;
			}
			else
				fact=fact*i;
		}
		
		System.out.println("Factorial of " + n + " is " + fact);
		return fact;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		fact(n);
		
	}

}
