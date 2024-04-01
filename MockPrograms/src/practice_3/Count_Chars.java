package practice_3;

public class Count_Chars {
	
	static void count_chars(String str)
	{
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			 if(str.charAt(i)!=' ')
				 count++;
		}
		System.out.println(count);
		
	}
	
	public static void main(String[] args) {
		
		String str="Amogh Manasvi";
		count_chars(str);
		
	}

}
