import java.util.*;

public class ifelse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        //int num2 = sc.nextInt();

        /* 
        Largest of 2 numbers


        if (num1 > num2)
        {
            System.out.println(num1 + " is greater");
        }
        else
        {
            System.out.println(num2 + " is greater"); 
        }

        */

       
       // Number is even or odd
       

        if(num1 % 2 == 0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");       
        }
    }
}
