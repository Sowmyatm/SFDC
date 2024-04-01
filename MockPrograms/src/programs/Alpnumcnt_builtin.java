package programs;

import java.util.Scanner;

public class Alpnumcnt_builtin {

	public static void alpnum_builtin(String str)
	{
		int lo_cnt, up_cnt, spec_cnt,dig_cnt;
		 lo_cnt=up_cnt=spec_cnt=dig_cnt=0;
		 
		 for(int i=0; i<str.length();i++)
		 {
			 char ch[]=str.toCharArray();
			 if(Character.isLowerCase(ch[i]))
			 {
				 lo_cnt++;
			 }
			 else if(Character.isUpperCase(ch[i]))
			 {
				up_cnt++; 
			 }
			 else if(Character.isDigit(ch[i]))
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
		System.out.println("Enter the string");
		
		String str = sc.nextLine();
		alpnum_builtin(str);
		
	}

}
