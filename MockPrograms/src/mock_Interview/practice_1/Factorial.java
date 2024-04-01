package mock_Interview.practice_1;

import java.util.Scanner;

public class Factorial {
	
	static int fact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
		
			if (num==0)
				return 1;
			
			fact=fact*i;
		}
		System.out.println(fact);
		return fact;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num = sc.nextInt();
		fact(num);
		
		sc.close();
	}

}
