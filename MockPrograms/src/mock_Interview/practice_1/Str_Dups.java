package mock_Interview.practice_1;

public class Str_Dups {
	
	static String remove_dups(String str)
	{
		String new_str="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(new_str.indexOf(ch)==-1)
			{
				new_str=new_str+ch;
			}
		}
		return new_str;
	}
	
	public static void main(String[] args) {
		
		String str = "abcabcabc";
		
		String old_str = str;
		System.out.println("Old string is: "+old_str);
		System.out.println("new string is :" + remove_dups(str));
	

	}
}
