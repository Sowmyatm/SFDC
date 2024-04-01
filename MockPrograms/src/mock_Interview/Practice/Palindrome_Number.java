package mock_Interview.Practice;

import java.util.Scanner;

public class Palindrome_Number {
	static void num_rev(int orig_num) {
		
		int temp=orig_num;
		int num=0;
		int rev=0;
		
		while(temp!=0)
		{
			num=temp%10;
			temp=temp/10;
			rev=rev*10+num;
		}
		if(rev==orig_num) 
		{
			System.out.println(rev + " is palindrome");
		}
		else
			System.out.println(rev + " is not palindrome");
		
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		num_rev(num);
		
		sc.close();
		
	}

}
