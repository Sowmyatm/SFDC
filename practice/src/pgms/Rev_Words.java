package pgms;

public class Rev_Words {
	
	public static String rev_str(String str)
	{
		String or_str=str;
		String rev ="";
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			rev = ch[i]+rev; 
		}
		return rev;
		//System.out.println(rev);
	}

	public static void main(String[] args) {
		
		String str ="Hello java";
		
		Rev_Words wr = new Rev_Words();
		str=wr.rev_str(str);
		
		String strArr[] =str.split("\s");
		
		for(int i=0;i<strArr.length;i++)
		{
			strArr[i]=wr.rev_str(strArr[i]);
		}
		String rev_words=strArr[0];
		
		for(int i=1;i<strArr.length;i++)
		{
			rev_words=rev_words+" "+ strArr[i];
			
		}
		System.out.println(rev_words);
		
		
		 

	}

}
