package mock_Interview.practice_1;

import java.util.Scanner;

public class Num_rev {
	
	static void num_rev(int org_num)
	{
		int temp=org_num;
		int rev=0;
		int num;
		
		while(temp!=0)
		{
			num=temp%10;
			temp=temp/10;
			rev=rev*10+num;
		}
		System.out.println(rev);
		
		if(rev==org_num)
		{
			System.out.println("The given digits are palindrome");
			
		}
		else
			System.out.println("The given digits are not palindrome");
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the digits");
		
		int org_num = sc.nextInt();
		num_rev(org_num);
		
		sc.close();
	}

}

