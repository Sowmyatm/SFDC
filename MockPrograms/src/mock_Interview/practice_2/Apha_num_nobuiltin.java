package mock_Interview.practice_2;

import java.util.Scanner;

public class Apha_num_nobuiltin {
	
	static void alph_num_nobuiltin(String str) {
		
		int lo_ct,up_ct,dig_ct,spe_ct;
		lo_ct=up_ct=dig_ct=spe_ct=0;
		char ch =0;
		
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				lo_ct++;
			}
			else if(ch>='A'&&ch<='Z')
			{
				up_ct++;
			}
			else if(ch>='0'&&ch<='9')
			{
				dig_ct++;
			}
			else 
			spe_ct++;
		}
		System.out.println("Lower case :" +lo_ct);
		System.out.println("Upper case :" +up_ct);
		System.out.println("Digit count :" +dig_ct);
		System.out.println("Special char :" +spe_ct);
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an alphanumeric str: ");
		String str=sc.nextLine();
		alph_num_nobuiltin(str);
	}

}
