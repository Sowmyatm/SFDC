package mock_Interview.practice_1;

import java.util.Scanner;

public class Alphanumeric_count_builtin {

	static void alpha_count(String str)
	{
		
		int low_count,up_count,digi_count,spe_count;
		low_count=up_count=digi_count=spe_count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				low_count++;
			}
			else if(Character.isUpperCase(str.charAt(i)))
			{
				up_count++;
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				digi_count++;
			}
			else
				spe_count++;
		}
		System.out.println("Lower case count is " + low_count);
		System.out.println("Upper case count is " + up_count);
		System.out.println("Digit  count is " + digi_count);
		System.out.println("Special character count is " + spe_count);
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an alphanumeric string: ");
		String str = sc.nextLine();
		
		alpha_count(str);
		
		
		
		
		
	}

}
