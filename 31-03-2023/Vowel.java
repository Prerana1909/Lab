package basic;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c;
		System.out.println("Enter character:");
		c = sc.next().charAt(0);
		//checking if alphabet or not
		if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u' )
		{
			System.out.println(c+" It is a vowel");
		}
		//checking if digit or not
		else 
		{
			System.out.println(c+" It is a consonant");
		}

	}

}
