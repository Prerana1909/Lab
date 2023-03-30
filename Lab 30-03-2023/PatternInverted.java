package basic;

public class PatternInverted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		for(i=9;i>0;--i)//rows
		{
			for(j=1;j<i;j++)//columns
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}

	}

}
