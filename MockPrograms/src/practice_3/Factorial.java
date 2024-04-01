package practice_3;

public class Factorial {
	
	static int fact=1;
	static int factorial(int num)
	{
		for(int i=1;i<=num;i++)
		{
			if(num==0)
			{
				return 1;
			}
			else
				fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		
		
		factorial(4);
		System.out.println(fact);

	}

}
