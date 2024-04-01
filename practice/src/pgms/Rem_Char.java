package pgms;

import java.util.Scanner;

public class Rem_Char {
	
	public static void rem_ch(String str, int i) {
		
		
		String str1=str.substring(0, i);
		String str2=str.substring(i+1, str.length());
		
		
		System.out.println(str1+str2);
	}

	public static void main(String[] args) {
	//sowmya
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str=sc.nextLine();
		
		System.out.println("Enter the index: ");
		int i = sc.nextInt();
		
		rem_ch(str,i);
		sc.close();
	}

}
