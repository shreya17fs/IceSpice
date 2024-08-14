import java.util.*;
public class bitmanipulation {
    public static void oddeven(int n){
        int bitMask = 1;
        if((n & bitMask)==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
    public static int getithbit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setithbit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int clearithbit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateithbit(int n, int i, int newBit){
        /*
        if(newBit==0){
            return clearithbit(n, i);
        }
        else{
            return setithbit(n, i);
        }
        */
        n = clearithbit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }
    public static int clearlastibits(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static int clearrangeofbits(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static boolean isPowerofTwo(int n){
        return (n&(n-1))==0;
    }
    public static int setBits(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static int fastExponentiation(int a, int n){
        int ans = 1;
        while(n > 0){
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static int modularexponentiation(int a, int n, int x){
        int ans = 1;
        while(n > 0){
           if((n & 1) != 0){
            ans = ans * a;
           }
           a = a*a;
           n = n>>1;
        }
        return ans % x;
    }
    public static void swapBits(int x, int y){
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.print("The value after swapping : x = " +x+ " and y = " +y);
    }
    public static void addone(int x){
        System.out.println(x+ " + " +1+ " is : " + -~x);
    }
    public static void uppertolower(){
        for(char ch='A';ch<='Z';ch++){
            System.out.println((char)(ch|' '));
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        //System.out.print("Enter the ith position : ");
        //int i = sc.nextInt();
        //System.out.print("Enter the new bit/updated bit : ");
        //int newBit = sc.nextInt();
        //System.out.print("Enter the jth position : ");
        //int j = sc.nextInt();
        //System.out.print("Enter the number : ");
        //int a = sc.nextInt();
        //System.out.print("Enter the power : ");
        //int n = sc.nextInt();
        //System.out.print("Enter the modular number : ");
        //int x = sc.nextInt();
        //System.out.print("Enter the value of x and y :");
        //int x = sc.nextInt();
        //int y = sc.nextInt();
        //System.out.print("The value before swapping : x = " +x+ " and y = " +y);
        //System.out.println();
        //System.out.println("Upper case to lower case : ");
        //uppertolower();
        oddeven(n);
    }
}
