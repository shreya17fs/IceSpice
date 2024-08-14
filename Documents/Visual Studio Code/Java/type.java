//import java.util.*;

public class type {
    public static void main(String args[]){
       //Scanner sc = new Scanner(System.in);
       // Type Conversion
       /*  
       int a = 25;
       long b =a;
       System.out.println(b);

       next code error
       long a = 25;
       int b =a;
       System.out.println(b);
       */

       /* 
       int number = sc.nextFloat(); 
       System.out.println(number);
       output -> error

       float number = sc.nextInt(); 
       System.out.println(number);
       output -> 16 to 16.0 */

       // Type Casting 
       /*
       error
       float a = 25.12f;
       int b = a;
       System.out.println(b);

       float a = 25.12f;
       int b = (int) a;
       System.out.println(b);

       char ch = 'a';
       int number = ch;
       System.out.println(number);
       output -> 97
       */

       // Type Promotion
       /* 
       char a = 'a';
       char b = 'b';

       char c = a - b;
       error 

       System.out.println(a);
       System.out.println(b-a);
      
       int a = 10;
       float b = 20.12f;
       long c = 25;
       double d = 30;
       double ans = a + b + c + d;
       System.out.println(ans);
       
       byte b = 5;
       byte a = b * 2;
       System.out.println(a);
       output -> error
       */
       byte b = 5;
       byte a = (byte) (b * 2);
       System.out.println(a);
    }
}
