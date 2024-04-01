package mock_Interview.Practice;

public class Fibonacci {
	
	static void fibonacci(int n1, int n2, int sum) {
		
		System.out.print(n1 + " " + n2);
		for(int i=3;i<=10;i++)
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			
			System.out.print(" " + sum);
		}
	}

	public static void main(String[] args) {
		
		int n1 = 0,n2 = 1,sum=0;
		fibonacci(n1,n2,sum);
	}
}
