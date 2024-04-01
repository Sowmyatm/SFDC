package mock_Interview.practice_1;

public class Count_odds_evens 
{
	static void add_odds_evens(String str)
	{
		String strArray[]=str.split(str);
		int even_count=0, odd_count=0;
		
		for(int i=0;i<strArray.length;i++)
		{
			int temp;
			temp= Integer.parseInt(strArray[i]);
			if(temp%2==0)
			{
				even_count=even_count+temp;
			}
			if(temp%2!=0)
			{
				odd_count=odd_count+temp;
			}
		}
		System.out.println("Even count is : "+ even_count);
		System.out.println("Odd count is : "+ odd_count);
	}
	
	public static void main(String[] args) {
		
		String str ="1,2,3,4,5,6,7,8,9";
		add_odds_evens(str);
			
	}

}
