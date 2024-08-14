import java.util.*;
public class sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("The largest number is " +a);
            }
            else{
                System.out.println("The largest number is " +c);
            }
        }
        else{
            if(b>c){
                System.out.println("The largest number is " +b);
            }
            else{
                System.out.println("The largest number is " +c);
            }
        }
    }
}
