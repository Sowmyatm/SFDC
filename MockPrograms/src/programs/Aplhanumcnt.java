package programs;

import java.util.Scanner;

public class Aplhanumcnt {
	
	public static void alphanumcnt(String str)
	{
		int lo_cnt, up_cnt, digi_cnt, spe_cnt;
		lo_cnt=up_cnt=digi_cnt=spe_cnt=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				lo_cnt++;
			}
			else if(ch>='A'&&ch<='Z')
			{
				up_cnt++;
			}
			else if(ch>='0'&&ch<='9')
			{
				digi_cnt++;
			}
			else
				spe_cnt++;
			
		}
		System.out.println("number of lower case: " + lo_cnt);
		System.out.println("number of upper case: " + up_cnt);
		System.out.println("number of digits: " + digi_cnt);
		System.out.println("number of special case: " + spe_cnt);
		
	}
	
	//ASNabcd!@334

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		alphanumcnt(str);
		
	}

}
