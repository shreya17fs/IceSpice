import java.util.*;

public class pattern {

   /* 
   Hollow Rectangle
   
   public static void hollowrectangle(int rows, int cols){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                if(i==1 || i==rows || j==1 || j==cols){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = sc.nextInt();
        hollowrectangle(rows, cols);
    }

    */

    /* 
    
    
    public static void invertedpyramid(int rows){
        for(int i=1; i<=rows; i++){
            for(int k=1; k<=rows-i; k++){
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }  
    }   
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        invertedpyramid(rows);
    }

    */
     
    
    /*Inverted half pyramid


    public static void invertedhalfpyramid(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i+1; j++){
                System.out.print(j+"  ");
            }
            System.out.println();
        }  
    }   
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        invertedhalfpyramid(rows);
    }
    
    */
    
    /*
    Floyd"s Triangle


    
    public static void floydstriangle(int rows){
        int count = 1;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
                count ++;
            }
            System.out.println();
        }  
    }   
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        floydstriangle(rows);
    }

    */

    /*
    Zero One Triangle


    
    public static void zeronetriangle(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
               if((i+j) % 2 == 0){
                System.out.print(" 1 ");
               }
               else{
                System.out.print(" 0 ");
               }
            }
            System.out.println();
        }  
    }   
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        zeronetriangle(rows);
    }

    */

    
    /*
    Butterfly

    
    public static void butterfly(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
               }
            for(int k=1; k<=2*(rows-i); k++){
                System.out.print("   ");
               }   
            for(int l=1; l<=i; l++){
                System.out.print(" * ");
               }   
                System.out.println();
        }

        for(int i=rows; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
               }
            for(int k=1; k<=2*(rows-i); k++){
                System.out.print("   ");
               }   
            for(int l=1; l<=i; l++){
                System.out.print(" * ");
               }   
               System.out.println();
        }
    }  
    
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        butterfly(rows);
    }
    */

    /*
    Rhombus

    
    public static void rhombus(int rows){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print("   ");
               }
            for(int k=1; k<=rows; k++){
                System.out.print(" * ");
               }   
            for(int l=1; l<=i-1; l++){
                System.out.print("   ");
               }   
                System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        rhombus(rows);
    }


    */

    /* 

    Parallelogram
    
    public static void parallelogram(int rows, int cols){
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print("   ");
               }
            for(int k=1; k<=cols; k++){
                System.out.print(" * ");
               }   
            for(int l=1; l<=i-1; l++){
                System.out.print("   ");
               }   
                System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int cols = sc.nextInt();
        parallelogram(rows,cols);
    }

   */

    /*
    Hollow Rhombus
    
    
    public static void hollowrhombus(int rows){
    int i;
    int j;
    for(i=1; i<=rows; i++){
        for(j=1; j<=rows-i; j++){
            System.out.print("   ");
           }
           for(j=1; j<=rows; j++){
            if(i==1 || i==rows || j==1 || j==rows){
            System.out.print(" * ");
           }
           else {
            System.out.print("   ");
           }
        }
            System.out.println();
    }
  } 
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows : ");
    int rows = sc.nextInt();
    hollowrhombus(rows);
  }

  */

  /*
  Diamond
  
  
  public static void diamond(int rows){
    for(int i=1; i<=rows; i++){
        for(int j=1; j<=rows-i; j++){
            System.out.print("   ");
           }
        for(int j=1; j<=i; j++){
            System.out.print(" * ");
           }   
     
      for(int j=2; j<=i; j++){
            System.out.print(" * ");
           }   
           System.out.println();
       } 
      
       
       for(int i=rows; i>=1; i--){
        for(int j=1; j<=rows-i; j++){
            System.out.print("   ");
           }
        for(int j=1; j<=i; j++){
            System.out.print(" * ");
           }   
     
      for(int j=2; j<=i; j++){
            System.out.print(" * ");
           }   
           System.out.println();
       } 
    }


public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows : ");
    int rows = sc.nextInt();
    diamond(rows);
}
*/

/*
Number pattern


public static void number_pattern(int rows){
    int count=1;
    for(int i=1; i<=rows; i++){
        for(int j=1; j<=rows-i; j++){
            System.out.print(" ");
           }

           //  for(int j=1; j<=i; j++){
           //  System.out.print(i+ " ");
           //  } 

          
        for(int j=1; j<=i; j++){
            System.out.print(+count+ " ");
              }   
         count++;
           System.out.println();
       } 
    }


public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows : ");
    int rows = sc.nextInt();
    number_pattern(rows);
}

*/

// Palindrome triangle


public static void palindrome_triangle(int rows){
    for(int i=1; i<=rows; i++){
        for(int j=1; j<=rows-i; j++){
            System.out.print("  ");
           }
        for(int j=i; j>=1; j--){
            System.out.print(j+ " ");
           }   
     
      for(int j=2; j<=i; j++){
            System.out.print(j+ " ");
           }   
           System.out.println();
       } 
    } 

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        palindrome_triangle(rows);
    }     
}


