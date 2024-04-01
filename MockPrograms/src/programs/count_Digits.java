package programs;

public class count_Digits {
	
	public static void no_of_digs(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)<97)
			{
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		String str="a96b32cd78hg10";
		
		no_of_digs(str);

	}

}
