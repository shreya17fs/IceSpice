import java.util.*;

public class bindeci{

    /* Binary to Decimal

    public static void bintodec(int n){
        int number = n;
        int pow = 0;
        int decimal = 0;
        while(n>0){
            int lastdigit = n % 10;
            decimal = decimal + (lastdigit * (int) Math.pow(2, pow));
            pow ++;
            n = n / 10;
        }
        System.out.println("Decimal of " + number + " = " + decimal); 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        bintodec(n);
    }

    */

    // Decimal to Binary

    public static void dectobin(int n){
        int number = n;
        int pow = 0;
        int binary = 0;
        while(n>0){
            int remainder = n % 2;
            binary = binary + (remainder * (int) Math.pow(10, pow));
            pow ++;
            n = n / 2;
        }
        System.out.println("Binary of " + number + " = " + binary); 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = sc.nextInt();
        dectobin(n);
    }
}
