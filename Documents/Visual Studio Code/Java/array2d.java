import java.util.*;

public class array2d {

    /*
    
    SEARCH A KEY, FIND LARGEST NO., FIND SMALLEST NO.
    
    
    public static boolean searchkey(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("The key found at cell (" + i + " , " + j + ")");
                    return  true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static int largest(int matrix[][]){
        int largest =  Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(largest < matrix[i][j]){
                    largest = matrix[i][j];
                }
            }
        }
        return largest;
    }

    public static int smallest(int matrix[][]){
        int smallest =  Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(smallest > matrix[i][j]){
                    smallest = matrix[i][j];
                }
            }
        }
        return smallest;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter the numbers in array");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Enter the number you want to find  : ");
        int key =  sc.nextInt();
        
        searchkey(matrix, key);
        largest(matrix);
        System.out.println("The largest number in the matrix is : " + largest(matrix));
        smallest(matrix);
        System.out.println("The smallest number in the matrix is : " + smallest(matrix));
    }

    */


    /*
    
    SPIRAL MATRIX
    
    
    public static void spiralmatrix(int matrix[][]){
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;

        while(startrow <= endrow && startcol <= endcol){

            //top
            for(int j=startcol; j<=endcol; j++){
                System.out.print(matrix[startrow][j] + " ");
            }

            //right
            for(int i=startrow+1; i<=endrow; i++){
                System.out.print(matrix[i][endcol] + " ");
            }

            //bottom
            for(int j=endcol-1; j>=startcol; j--){
                if(startrow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][j] + " ");
            }

            //left
            for(int i=endrow-1; i>=startrow+1; i--){
                if(startcol == endcol){
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
    } 

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter the numbers in array");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        } 
        System.out.println();
        System.out.println("The spiral matrix"); 
        spiralmatrix(matrix);
    }

    */

    /*
    
    SUM OF DIAGONALS
    
    
    public static int diagonalsum(int matrix[][]){
        int sum = 0;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i==j){
                    sum += matrix[i][j];
                }
                else if(i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter the numbers in array");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        } 
        System.out.println();
        System.out.println("The sum of both diagonals are : " + (diagonalsum(matrix)));
    }

    */

    /*
    
    SEARCH IN SORTED ARRAY
    
    
    
    public static boolean staircaseSearch(int matrix[][], int key){
        int row = 0 , col = matrix[0].length - 1;
        
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("The key found at cell (" + row + "," + col + ")");
                return true;
            }

            else if(key < matrix[row][col]){
                col--;
            }

            else{
                row++;
            }
        }
        System.out.println("The key does not exist");
        return false;
    }

    public static boolean staircaseSearchh(int matrix[][], int key){
        int col = 0 , row = matrix[0].length - 1;
        
        while(col < matrix.length && row >= 0){
            if(matrix[row][col] == key){
                System.out.println("The key found at cell (" + row + "," + col + ")");
                return true;
            }

            else if(key < matrix[row][col]){
                row--;
            }

            else{
                col++;
            }
        }
        System.out.println("The key does not exist");
        return false;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter the numbers in array");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Enter the number you want to find  : ");
        int key =  sc.nextInt();
        staircaseSearch(matrix, key);
    }

    */


    /*
    
    NUMBER OF 7
    
    public static void numberofseven(int matrix[][]){
        int number = 0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == 7){
                    number ++;
                }
            }
        }
        System.out.println("total number of seven : " +number);

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter the numbers in array");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        numberofseven(matrix);
    }


    */


    /*
    
    
    SUM OF SECOND ROW
    
    public static void sumofsecondrow(int matrix[][]){
        int sum = 0;
        for(int j=0;j<matrix[0].length;j++){
                sum = sum + matrix[1][j];
        }
        System.out.print("The sum of second row is : " + sum);
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter the numbers in array");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        sumofsecondrow(matrix);
    }


    */


    public static void transpose(int transpose[][], int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("The transposed matrix : \n");
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(transpose[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter the numbers in array");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int transpose[][] = new int [m][n];
        transpose(transpose, matrix);
        
    }
  
   
}
