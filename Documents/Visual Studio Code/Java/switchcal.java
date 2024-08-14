import java.util.*;

public class switchcal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("What do you want to do");
        char operator = sc.next().charAt(0);

        switch(operator)
        {
            case '+': System.out.println("Sum");
                      System.out.println(a + b);
                      break;
            case '-': System.out.println("Difference");
                      System.out.println(a - b);
                      break;
            case '*': System.out.println("Product");
                      System.out.println(a * b);
                      break;
            case '/': System.out.println("Quotient");
                      System.out.println(a / b);
                      break;
            case '%': System.out.println("Remainder");
                      System.out.println(a % b);
                      break;          
            default : System.out.println("Please check");        
        }

    }
}
