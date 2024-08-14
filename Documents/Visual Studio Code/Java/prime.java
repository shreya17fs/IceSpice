import java.util.Scanner;

public class prime {
    /* public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int flag = 0;
        for(int i=2;i<=n/2;i++){
            if((n%i)==0){
                System.out.println("Not prime");
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Prime");
        }    
    }
    */

    public static void Primeinrange(int num){
        for(int i=2;i<=num;i++){
            if(Prime(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean Prime(int num){
        boolean isPrime = true;
        for(int i=2;i<=num/2;i++){
            if((num%i)==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the end : ");
        int end = sc.nextInt();
        Primeinrange(end);
    }
}
