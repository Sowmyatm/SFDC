package Practice;

public class Add_Odds_Evens {
	
	
	static void add_odds_evens(String str)
	{
		int temp;
		int odd_count=0;
		int even_count=0;
		
		String strarr[]=str.split(",");
		
		for(int i = 0; i<strarr.length;i++)
		{
			temp=Integer.parseInt(strarr[i]);
			
			if(temp%2!=0)
			{
				odd_count=odd_count+temp;
			}
				if(temp%2==0)
				{
					even_count=even_count+temp;
				}
				
		}
		System.out.println("odd count " + odd_count);
		System.out.println("even count " + even_count);
		
	}
	
	public static void main(String[] args) {
		
		String str ="1,2,3,4,5,6,7,8,9";
		System.out.println("Enter the string: " + str);
		
		add_odds_evens(str);
		
	}

}
