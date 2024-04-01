package mock_Interview.practice_2;

import java.util.Scanner;

public class Alph_Num_cnt {
	
	public static void alp_num_cnt(String str) {
		
		int lo_cnt, up_cnt, spec_cnt,dig_cnt;
		 lo_cnt=up_cnt=spec_cnt=dig_cnt=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				lo_cnt++;
			}
			else if(Character.isUpperCase(str.charAt(i)))
			{
				up_cnt++;
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				dig_cnt++;
			}
			else
				spec_cnt++;
		}
		System.out.println("no of lower case : "+lo_cnt);
		System.out.println("no of upper case : "+up_cnt);
		System.out.println("no of digits  : "+dig_cnt);
		System.out.println("no of special char : "+spec_cnt);
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an alphanumeric string: ");
		String str = sc.nextLine();
		
		alp_num_cnt(str);
		

	}

}
