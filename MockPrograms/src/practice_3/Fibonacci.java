package practice_3;

public class Fibonacci {
	
	static void fib(int num)
	{
		int n1=0;
		int n2=1;
		int sum=0;
		
		System.out.print(n1+" "+n2);                                                                                            
		
		for(int i=3;i<=num;i++)
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(" "+ sum);
		}
	}

	public static void main(String[] args)
	{
		fib(10);
	}

}
