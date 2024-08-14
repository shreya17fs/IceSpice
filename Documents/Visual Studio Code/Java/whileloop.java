import java.util.*;

public class whileloop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
       
        /* 
        Print number from 1 to n


        System.out.println("Enter the range");
        int range = sc.nextInt();
        int start = 1;
        System.out.println("Printed numbers : ");
        while (start <= range)
        {
            System.out.print(start + " ");
            start ++; 
        }
        System.out.println();


       */

      /* 
      Sum of n numbers

      
      System.out.println("Enter the number till which you have to find the sum");
      int range = sc.nextInt();
      int i = 1;
      int sum = 0;
      while (i <= range)
        {
            sum = sum + i;
            i ++; 
        }
        System.out.println("The sum is : " + sum);


       */ 


    // Reverse of a number



      int number = sc.nextInt();
      int reverse = 0;
      while (number > 0)
        {
            int lastdigit = number % 10;
            reverse = (reverse * 10) + lastdigit;
            number = number / 10;
        }
        System.out.println("The reverse is : " + reverse); 
    }
    
}
