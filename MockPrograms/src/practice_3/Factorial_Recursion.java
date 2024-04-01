package practice_3;

import java.util.Scanner;

public class Factorial_Recursion {
	
	 static int temp;
	
	static int fact_recur(int num)
	{
		
		if(num==0)
		{
			return 1;
		}
		else
		{
     		temp=num*fact_recur(num-1);
	    	return temp;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer");
		int num = sc.nextInt();
		
		fact_recur(num);
		
		System.out.println("Factorial is: "+temp);
		
		sc.close();

	}

}
