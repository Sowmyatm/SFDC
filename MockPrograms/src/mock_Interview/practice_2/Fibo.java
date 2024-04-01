package mock_Interview.practice_2;

public class Fibo {
	
	public static void fib(int n1, int n2, int sum) 
	{
		System.out.print(n1 + " " + n2);
		for(int i=2;i<=10;i++)
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(" " + sum);
		}
	}
	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		int sum =0;
		
		fib(n1,n2,sum);
	}
}
