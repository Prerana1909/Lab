package basic;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; int factorial=1;
		for(i=1;i<=10;i++)
		{
			factorial = i*factorial;
			
			System.out.println(i+" " +factorial);
		}
		

	}

}
