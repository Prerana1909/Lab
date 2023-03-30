package basic;
//WAP to print strong number from 1 to 100
public class StrongNumbers {  
    public static void main(String[] args) {  
         int  i, j, sum = 0;  
for (i = 1; i <= 100; i++)  
{  
           for (j = 1; j <= i/2; j++)   
           {  
                     if (i % j == 0)  
                     {  
                                sum = sum + j;  
                     }  
           }  
                if (sum > i)  
                        System.out.print( i+" ");  
                sum = 0;  
}  
}     
}  
