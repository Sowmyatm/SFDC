package mock_Interview.practice_1;

import java.util.Scanner;

public class Fact_Recursion {
	
	static int fact_rec(int num)
	{
	 int fact;
	 if(num==0)
	 {
		 return 1;
	 }
	 else
		 fact=num*(fact_rec(num-1));
		 return fact;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num = sc.nextInt();
		System.out.println(fact_rec(num));
		sc.close();
		
	}

}
