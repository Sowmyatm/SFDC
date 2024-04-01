 package Practice;

public class Remove_Dups_Str {
	
	static void dups_str(String str) {
		
	
		
		String[] words = str.split("\\s+");
		for(int i=0; i<words.length;i++)
		{
			for(int j=0;j<words.length;j++)
			{
				if(words[i].equals(words[j])&&(i!=j))
					
				{
						System.out.println("dup found " + words[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		String str1="Hello Hello this is java java";
		dups_str(str1);
	}
}
