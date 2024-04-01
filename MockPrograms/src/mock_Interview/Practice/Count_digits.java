package Practice;

public class Count_digits {

	public static void main(String[] args) {
		String str = "abcd1234u7";
		
		int count =0 ;
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++ )
		{
			if(ch[i]>=48&&ch[i]<=57) //ascii from 0 to 9 
			{
				count++;
			}
		}
		System.out.println("no of dig: "  + count);
 
	}

}
