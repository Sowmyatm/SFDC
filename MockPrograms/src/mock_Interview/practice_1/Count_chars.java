package mock_Interview.practice_1;

public class Count_chars 
{
	
	static void count_chars(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("Number of characters are: " +count);
	}

	public static void main(String[] args) 
	{
		String str ="Amogh Manu";
		System.out.println("Enter the string :" + str);
		count_chars(str);
		
	}

}
