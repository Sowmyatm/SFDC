package practice_3;

import java.util.Scanner;

public class Num_Rev_Palin {
	
	static void num_rev_pali(int num)
	{
		int org_num=num;
		int temp=org_num;
		int rev=0;
		
		while(temp!=0)
		{
			num=temp%10;
			temp=temp/10;
			rev=rev*10+num;
		}
		System.out.println(rev);
		
		if(org_num==rev)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not palin");
			
		
	}
	
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the numbers: ");
		int num=sc.nextInt();
		
		num_rev_pali(num);
		sc.close();

	}

}
