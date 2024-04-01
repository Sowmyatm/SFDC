package pgms;

import java.util.Scanner;

public class Alphanum_count {
	
	public static void Alpha_count(String str)
	{
		char ch[] =str.toCharArray();
		
		//int count=0;
		int lo_cnt=0,  up_cnt=0, spe_cnt=0, dig_cnt=0;
		
		for(int i=0; i<str.length();i++)
		{
			
			//char ch=str.charAt(i);
			
			if(ch[i]>='A'&& ch[i]<='Z')
			{
				up_cnt++;
			}
			else if(ch[i]>='a' && ch[i]<='z')
			{
				lo_cnt++;
			}
			else if(ch[i]>='0' && ch[i]<='9')
			{
				dig_cnt++;
			}
			else
				spe_cnt++;
		}
		System.out.println("upper_case :" + up_cnt);
		System.out.println("lower_case :" + lo_cnt);
		System.out.println("digits :" + dig_cnt);
		System.out.println("special_case :" + spe_cnt);
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		Alpha_count( str);
		sc.close();
		
		
	}

}
