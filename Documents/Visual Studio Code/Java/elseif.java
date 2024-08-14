import java.util.*;

public class elseif{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       /* 
       Income tax calculator
       

        int income = sc.nextInt();
        int tax;
        if (income < 500000)
        {
            System.out.println("No tax");
            tax = 0;
        }
        else if (income >= 500000 && income < 1000000)
        {
            System.out.println("20% tax");
            tax = (int) (income * 0.20);
        }
        else
        {
            System.out.println("30% tax");
            tax = (int) (income * 0.30);
        }
        System.out.println("Your tax is:" + tax);

       */

       // Largest of three numbers

       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       int num3 = sc.nextInt();
       if((num1 > num2) && (num1 > num3))
       {
            System.out.println(num1 + ": Number 1 is the greatest ");
       }
       else if(num2 >= num3)
       {
            System.out.println(num2 + ": Number 2 is the greatest ");
       }
       else
       {
            System.out.println(num3 + ": Number 3 is the greatest ");
       }
    }
}