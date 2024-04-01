package mock_Interview.practice_2;

import java.util.Scanner;

public class Factorial_Recursion {
	
	static int fct_rec(int num)
	{
		int temp;
		
		if(num==0)
		{
			return 1;
		}
		else
			temp = num*fct_rec(num-1);
		
		return temp;
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		int num = sc.nextInt();
		
		
		System.out.println(fct_rec(num));

	}

}
