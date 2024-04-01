package pgms;

public class Char_Count {
	
	public static void ch_cnt(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch!=' ')
			{
				count++;
			}
		}
		System.out.println("no of chars: " +count);
	}
	

	public static void main(String[] args) {
		
		String str = "Sowmyatm";
		ch_cnt(str);
		
	}

}
