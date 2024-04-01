package mock_Interview.Practice;

public class Count_Chars {
	
	static void char_count(String str)
	{
		int count = 0;
		//char ch[] = str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}System.out.println(count);
		
}
	
	
	public static void main(String[] args) {
		
		String  str="Sowmya Prasanna";
		System.out.println("enter the string: " + str);
		char_count(str);
	}

}
