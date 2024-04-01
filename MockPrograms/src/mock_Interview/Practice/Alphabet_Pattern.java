package Practice;

public class Alphabet_Pattern {
	
	//A
	//A B
	//A B C
	//A B C D
	//A B C D E
	//A B C D E F

	public static void main(String[] args) {
		
		int alpha=65; //A=65, B=66, C=67, D=68, E=69, F=70
		for(int i=0; i<=5;i++)
		{
			for(int j=0; j<=i;j++)
			{
				System.out.print((char)(alpha+j)+ " "); //(char)(65+0) = typecast to char,convert from int to char
			}
			System.out.println();
		}

	}

}
