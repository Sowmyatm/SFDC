package pgms;

public class First_Non_Dup {

	public static void first_non_dup(String str)
	{
		char ch[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(i!=j)
				{
					if(ch[i]!=ch[j])
					{
						break;
					}
				}
			}
		}
				
	}
	
	public static void main(String[] args) {
		
		String str = "I like python";
		first_non_dup(str);
	}

}
