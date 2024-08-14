import java.util.*;

public class dowhileloop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int choice;
        int evensum = 0;
        int oddsum = 0;
        do {
            System.out.println("Enter the number");
            int number =sc.nextInt();
            if (number % 2 ==0)
            {
                evensum = evensum + number;
            }
            else
            {
                oddsum = oddsum + number;
            }
            System.out.println("Do you want to continue? Press 1 for yes or 0 for no");
            choice = sc.nextInt();
        }while(choice == 1);
        System.out.println("Sum of even number : " + evensum);
        System.out.println("Sum of odd number : " + oddsum);
    }
    
}
