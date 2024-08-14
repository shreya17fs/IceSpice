import java.util.*;

public class function {

   /*Factorial
   
   
   public static int factorial(int num){
        int fact = 1;
        for(int i=1; i<=num; i++)
        {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        //int factnumber = factorial(n);
        //System.out.println("Factorial is " + factnumber );
        System.out.println("Factorial is " + (factorial(n)));
        
    }
    */

    /*
    
    Binomial
    
    public static int binomial(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int bino = fact_n/(fact_r * fact_nmr);
        return bino;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of r : ");
        int r = sc.nextInt();
        System.out.println("The binomial is : ");
        System.out.println(binomial(n, r));
    }

    */


    /*
    Prime or not
    
    
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for (int i=2; i<=n-1; i++){
            if (n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int n = sc.nextInt();
        System.out.println(isPrime(20));
    }  
    */  
   
    
    /*
    
    Range of prime number

    public static boolean isPrime(int n) {
    int count = 0;
    for (int i =1; i<=n; i++){
        if (n % i == 0){
            count ++;
        }
    }
        if (count == 2){
            return true;
        }
        return false;
    }

   public static void primerange(int n){
    for(int i=1; i<=n; i++){
        if(isPrime(i)){
            System.out.print(i+ " ");
        }
    }
  }

   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the range : ");
    int n = sc.nextInt();
    System.out.print("The prime numbers are : ");
    primerange(n);
  }  

  */


  // Palindrome or not

  public static boolean palindrome(int number) {
    int n = number;
    int reverse = 0;
    while(n>0){
        int remainder = n % 10;
        reverse = (reverse * 10) + remainder;
        n = n / 10 ;
    }

   
        if (number == reverse){
            return true;
        }
        return false;
    }


  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int number = sc.nextInt();
    if(palindrome(number)){
        System.out.println("Number " + number + " is palindrome");
    }
    else{
        System.out.println("Number " + number + " is not palindrome");
    }
   
  }  

 
  
  
}

