import java.util.*;

public class forloop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*
        Number is Prime or not
        
        int count = 0;
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        for (int i=1; i<=num; i++)
        {
            if(num % i == 0)
            {
                count ++;
            }
        }
        if(count == 2)
        {
            System.out.println("Prime number");
        }
        else
        {
            System.out.println("Not a prime number");
        }

        */

        /* 

        Factorial of a number
        
        int fact =1;
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial is : " + fact);

        */

        /*
        
        Table of a number

        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("Table of the number");
        for(int i=1; i<=10; i++)
        {
            System.out.println(num + "*" + i + "=" + num * i) ;
        }


        */

        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        boolean isPrime = true;
        if(number == 2){
            System.out.println("The number is prime ");
        }
        else{
            //for(int i=2;i<=Math.sqrt(number);i++){
            for(int i=2;i<=number-1;i++){
                if(number%i == 0){
                    isPrime = false;
                }
            }
    
            if(isPrime==true){
                System.out.println("The number is prime");
            }
            else{
                System.out.println("The number is not prime");
            }
        }

    }
    
}
