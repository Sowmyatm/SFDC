package mock_Interview.Practice;

public class Non_Dup_Char_In_String {
//pgm to print first non duplicate char in a string
public static void find_first_non_duplicate_char(String str)
{
	char ch[]=str.toCharArray();
	for(int i=0;i<str.length();i++)
	{
		for(int j=0;j<str.length();j++)
		{ 
				if(i!=j)
				{
					if(ch[i]==ch[j])
					{
						break;
					}
				}
			
			if(j==str.length()-1)
			{
				System.out.printf("First Non duplicate character is  %c",ch[i]);
				return; 
			}
				
		}
	}
}
	public static void main(String[] args) {
		String str ="SSoowmya";

		find_first_non_duplicate_char(str);
		
		
	}

}
