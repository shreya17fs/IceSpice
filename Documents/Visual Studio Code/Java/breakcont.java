import java.util.*;

public class breakcont {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

       /* 
       Break Statement


       do
        {
            System.out.println("Enter your number");
            int num = sc.nextInt();
            if (num % 10 == 0)
            {
                break;
            }
            System.out.println(num); 
        }while(true);
        System.out.println("Number divisible by 10");


        */

        // Continue Statement

        do
        {
            System.out.println("Enter your number");
            int num = sc.nextInt();
            if (num % 10 == 0)
            {
                continue;
            }
            System.out.println("Number was : " +num); 
        }while(true);
    }
    
}
