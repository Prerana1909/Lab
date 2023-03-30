package basic;

public class NestedForLoop {

	public static void main(String[] args) {
		// WAP to print pattern using * (half pyramid)
		int i,j;
		for(i=1;i<8;i++)//rows
		{
			for(j=1;j<=i;j++)//columns
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}

	}

}
