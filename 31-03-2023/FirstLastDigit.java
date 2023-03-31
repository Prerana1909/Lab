package basic;

import java.util.Scanner;

public class FirstLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find first digit and last digit
		int no, firstdigit=0, lastdigit=0,temp;
		Scanner sc = new Scanner(System.in);
		//int no, firstdigit=0, lastdigit=0;
		
		System.out.println("Enter the number:");
		no= sc.nextInt(); //Scanning the number and assigning it to num
		temp = no;
		lastdigit = no%10; //finding the modulus
		System.out.println("The last digit of the number "+temp+" is: "+lastdigit);
		while(no>=10) //checking whether the num>= 10
		{
	    no= no/10; // dividing the number by 10
		firstdigit=no; //assigning the value of num in first digit
		}
		System.out.println("The first digit of the number "+temp+" is: "+firstdigit);
		

	}

