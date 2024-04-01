package practice_3;

public class Add_Odd_Even 
{
	static int odd_count=0;
	static int even_count=0;
	
	static void add_odd_even(String str)
	{
		String strArray[]=str.split(",");
		for(int i=0;i<strArray.length;i++)
		{
			int temp=Integer.parseInt(strArray[i]);
			
			if(temp%2==0)
			{
				even_count=even_count+temp; //if the o/p is just count the even nos then even_count++;
			}
			if(temp%2!=0)
			{
				odd_count=odd_count+temp; //if the o/p is just count the odd nos then odd_count++;
			}
		}
	}

	public static void main(String[] args) 
	{
		String  str = "1,2,3,4,5,6,7,8,9";
		System.out.println("Enter the string: " + str);
		
		add_odd_even(str);
		
		System.out.println("Even count is: " +  even_count);
		System.out.println("Odd count is: " +  odd_count);
	}
}
