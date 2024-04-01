package mock_Interview.Practice;

import java.util.Scanner;

public class Num_Reverse {

	public static void num_rev(int org_num) {
		
		int temp= org_num;
		int rev=0;
		int num;
		
		while(temp!=0)
		{
			num =temp%10;
			temp=temp/10;
			rev=rev*10 + num;
			
		}
		System.out.println(rev);
//		if(rev==org_num)
//		{
//			System.out.println(rev + " is palindrome ");
//		}
//		else
//			System.out.println(rev + " is not palindrome ");
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the digits: ");
		int num = sc.nextInt();
		num_rev(num);
		
		sc.close();
		
	}

	}	
		
		
	
