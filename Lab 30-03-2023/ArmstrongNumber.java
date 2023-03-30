package basic;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//WAP to print armstrong number from 1 to 100

		
		for (int i = 1; i<100; i++){
			int check, rem, sum = 0;
	         check = i;
	         while(check != 0) {
	            rem = check % 10;
	            sum = sum + (rem * rem * rem);
	            check = check / 10;
	         }
	         if(sum == i){
	            System.out.println(i+" is an Armstrong number.");
	         }
	         /*else
	         {
	        	 System.out.println(i+" is not an Armstrong number");
	         }*/
	}
	}
}
