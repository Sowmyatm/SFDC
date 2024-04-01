package mock_Interview.Practice;

import java.util.Scanner;

public class Up_Low_Digits_Specialchar_Count_Using_Builtin {
	
	static void count_char(String str) {
		
		int up_count,low_count,digi_count,spe_count;
		up_count=low_count=digi_count=spe_count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i))==true)
			{
				low_count++;
			}
		else if(Character.isUpperCase(str.charAt(i))==true)
		{
			up_count++;
		}	
		else if(Character.isDigit(str.charAt(i))==true)
		{
			digi_count++;
		}	
		else 
			spe_count++;
		
		}
		System.out.println("Lower case count: "+  low_count);
		System.out.println("Upper case count: "+  up_count);
		System.out.println("Digits case count: "+  digi_count);
		System.out.println("Special character count: "+  spe_count);
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphanumeric string: ");
		
		String str = sc.nextLine();
		
		
		
		count_char(str);
		
		
		sc.close();
		
		
	}

}
