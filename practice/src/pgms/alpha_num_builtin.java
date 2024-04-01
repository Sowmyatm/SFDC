package pgms;

import java.util.Scanner;

public class alpha_num_builtin {
	
	public static void alpha_builtin(String str)
	{
		
		int low_case=0; int up_case=0; int digits_cnt=0; int spe_char =0;
		
		for (int i=0;i<str.length();i++)
		{
			char ch[] =str.toCharArray();
			if(Character.isLowerCase(ch[i]))
			{
				low_case++;
				
			}
			else if(Character.isUpperCase(ch[i]))
			{
				up_case++;
			}
			else if(Character.isDigit(ch[i]))
			{
				digits_cnt++;
			}
			else
			{
				spe_char++;
			}
		}
		
		System.out.println("upper_case :" + up_case);
		System.out.println("lower_case :" + low_case);
		System.out.println("digits :" + digits_cnt);
		System.out.println("special_case :" + spe_char);
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		alpha_builtin(str);
		
		sc.close();
	}

}
