
public class While_for_loops {

	public static void main(String[] args) {
//disadvantage of while loop : it will generate infinte loopif we dont give incremental or decremental part
		int i=1;//initialization
		while(i<=10)//condition
		{
			System.out.println(i);
			i++;
		}
		System.out.println("*******");
		
		//for loop
		for(int j=1;j<=10;j++)//initialization, conditional, incremental
		{
			System.out.println(j);
		}
		System.out.println("*********");
		
		//print 10 to 1
		for(int k=10;k>=1;k--)//initializtion,conditional,decremental
		{
			System.out.println(k);
		}

	}

}
