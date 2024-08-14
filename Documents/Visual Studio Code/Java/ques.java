import java.util.*;

public class ques {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        /*
        Average of 3 nos
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = (a + b + c)/3;
        System.out.println(" average is : " + avg);
        */
        
        /*
        Area of square
        
        float side = sc.nextFloat();
        float area = side * side;
        System.out.println(" area is : " + area);
        */

        // Total Bill

        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("bill is : " + total);

        // GST

        float newtotal = total + (0.18f * total);
        System.out.println("bill after gst : " + newtotal);


        /*
       Positive and Negative


       int x = sc.nextInt();
       if (x > 0)
       {
           System.out.println("Positive");
       }
       else 
       {
           System.out.println("Negative"); 
       }

       */


      /*
      Switch week 
      
      
      System.out.println("Enter the number to print the day");
      int num = sc.nextInt();
      
      switch(num)
      {
          case 1:  System.out.println("Monday");
                   break;
          case 2:  System.out.println("Tuesday");
                   break; 
          case 3:  System.out.println("Wednesday");
                   break;  
          case 4:  System.out.println("Thursday");
                   break;       
          case 5:  System.out.println("Friday");
                   break;     
          case 6:  System.out.println("Saturday");
                   break; 
          case 7:  System.out.println("Sunday");
                   break;      
          default: System.out.println("error");                                     
      }

      */



    }
    
}
