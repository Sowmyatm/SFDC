package practice_3;

import java.util.Scanner;

public class Alphanumeric_With_Builtin {
	
	static void alphanum_count(String str1)
	{
		int lower_count, upper_count,digi_count,spe_count;
		lower_count=upper_count=digi_count=spe_count=0;
		
		char ch[]=str1.toCharArray();
		for(int i=0;i<str1.length();i++)
		{
			if(Character.isLowerCase(ch[i]))
			{
				lower_count++;
			}
			else if(Character.isUpperCase(ch[i]))
			{
				upper_count++;
			}
			else if(Character.isDigit(ch[i]))
			{
				digi_count++;
			}
			else
				spe_count++;
		}
		System.out.println("Lower case count is: " +lower_count);
		System.out.println("upper case count is: " +upper_count);
		System.out.println("Digits count is: " +digi_count);
		System.out.println("Special character count is: " +spe_count);
		
	}	

	
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter an alphanumeric string: ");
			String str=sc.nextLine();
			
			alphanum_count(str);
			sc.close();

		}
	
		

	

}
