package basic;

import java.util.Scanner;

class Operator{
	public int addition(int a,int b)
	{
		return a+b;
	}
	public int substraction(int a,int b)
	{
		return a-b;
	}
	public int multiplication(int a, int b)
	{
		return a*b;
	}
	public double division(int a, double b)
	{
		return a/b;
	}
}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch case
		Operator op = new Operator();
		System.out.println("Your calculation Buddy!!!");
		Scanner sc = new Scanner(System.in);
		int x,y;
		do {
			System.out.println("Which operation you want to perform:");
			System.out.println("1)Addition\n2)Substraction\n3)Multiplication\n4)Division\n5)Exit");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter first digit:");
				x = sc.nextInt();
				System.out.println("Enter second digit:");
				y = sc.nextInt();
				System.out.println("Sum:"+op.addition(x, y));
				break;
				
			case 2:	
				System.out.println("Enter first digit:");
				x = sc.nextInt();
				System.out.println("Enter second digit:");
				y = sc.nextInt();
				System.out.println("Substraction is:"+op.substraction(x, y));
				break;
				
			case 3:
				System.out.println("Enter first digit:");
				x = sc.nextInt();
				System.out.println("Enter second digit:");
				y = sc.nextInt();
				System.out.println("Multiply is:"+op.multiplication(x, y));
				break;
				
			case 4:
				System.out.println("Enter first digit:");
				x = sc.nextInt();
				System.out.println("Enter second digit:");
				y = sc.nextInt();
				System.out.println("Division:"+op.division(x, y));
				break;
				
			case 5:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid input!!");
			}
		}
		while(true);
		}
		
		

	}


