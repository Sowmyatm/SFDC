package pgms;

import java.util.Scanner;

public class count_Dig {
	
	public static void dig_cnt(String str)
	{
		
		int count=0;

		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)<97)
			{
				count++;
			}
		}
		System.out.println("dig_cnt is: " +count);
	}
	
	public static void main(String[] args) {
		//123456
		String str="abcks1233498";
		dig_cnt(str);
	}

}
