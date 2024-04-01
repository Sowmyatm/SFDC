package mock_Interview.Practice;

import java.util.Scanner;

public class Up_Low_Dig_Spec_Without_Builtin {
	
	static void alpha_count(String str)
	{
		int low_count,up_count,dig_count,spe_count;
		low_count=up_count=dig_count=spe_count=0;
		char ch = 0;
		
		for(int i =0;i<str.length();i++)
		{
		ch=str.charAt(i);
		if(ch>='a' && ch<='z')
		{
			low_count++;
		}
		else if(ch>='A'&&ch<='Z')
		{
			up_count++;
		}
		else if(ch>='0'&& ch<='9')
		{
			dig_count++;
		}
		else
			spe_count++;
	}System.out.println("Lower case count: "+  low_count);
	System.out.println("Upper case count: "+  up_count);
	System.out.println("Digits case count: "+  dig_count);
	System.out.println("Special character count: "+  spe_count);
	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphanumeric string: ");
		String str = sc.nextLine();
		
		alpha_count(str);
		sc.close();
		
	}

}
