//import java.util.Scanner;

public class recursion {

    /*
    

    Decreasing order


    
    public static void printDec(int n){
        int num = 1; 
        if(n == num){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDec(n+1);
    }

    */

    /*
    
    
    Increasing order


    
    public static void printInc(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }


    */

    /*
      
    
    
    Factorial


    
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n * factorial(n-1);  
    }


    */

    /*
    
    

    Sum of n natural numbers



    public static int printSum(int n){
        if(n==1){
            return 1;
        }
        return n + printSum(n-1);
    }

    */

    /*
    

    
    Calculate nth Fibonacci number


    public static int calcFibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return calcFibonacci(n-1) + calcFibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
        //printDec(number);
        //printInc(number);
        //System.out.println(factorial(number));
        //System.out.println(printSum(number));
        //System.out.println(calcFibonacci(number));
    }
    
 
    */


    /*
    

    
    Check if array is sorted
    


    public static boolean issorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        };
        return issorted(arr, i+1);
    }


    */

    
    /* 
    

    First Occurence

    
    public static int firstOcc(int arr[], int key, int i){
        if(i == arr.length){
            System.out.println("Key not found");
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
        return firstOcc(arr, key, i+1);
    }


    */


    /*
    
    
    
    Last Occurence 
    
    
    public static int lastOcc(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = lastOcc(arr, key, i+1);
        if(isfound != -1){
            return isfound;
        }
        if (arr[i] == key){
            return i;
        }
        return isfound;
    }


    public static void main(String[] args) {
        //int arr[] = {1,2,3,4,5};
        //System.out.println(issorted(arr, 0));
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 3;
        //System.out.println(firstOcc(arr, key, 0));
        System.out.println(lastOcc(arr, key, 0));
    }


    */


    /*
    
    
    
    Print x^n
    
    
    public static int XpowerN(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * XpowerN(x, n-1);
    }

    */

    /*
    
    
    
    Print x^n optimized

    
    public static int XpowerN(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfpower = XpowerN(x, n/2);
        if((n%2) != 0 ){
            //return x * XpowerN(x, n/2) * XpowerN(x, n/2);
            return x * halfpower * halfpower;
        }
        //return XpowerN(x, n/2) * XpowerN(x, n/2);
        return halfpower * halfpower;
    }
    public static void main(String[] args) {
        System.out.println(XpowerN(2, 5));
    }


    */

    /*
    
    

    Tiling Problem
    

    public static int tilingProblem(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //vertical case
        int fnm1 = tilingProblem(n-1);
        //horizontal case
        int fnm2 = tilingProblem(n-2);
        int totalways = fnm1 + fnm2;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(4)+ " ways");
    }

    */


    /*
    
    
    
    
    Remove Duplicates
    
    
    
    public static void removeDuplicates(String str, int ind, StringBuilder newStr, boolean map[]){
        if(ind == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(ind);
        if(map[currChar - 'a'] == true){
            removeDuplicates(str, ind+1, newStr, map);
        }
        else{
            map[currChar - 'a'] = true;
            removeDuplicates(str, ind+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }

    */

    /*
    
    
    
    Friends Pairing(Single or Pair)
    
    
    public static int friendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }


    */

    /*
    
    
    
    Generate all binary strings without consecutive 1’s
    
    
    public static void binaryString(String str, int n, int lastPlace){
        if(n==0){
            System.out.println(str);
            return;
        }
        // if(lastPlace == 0){
        //     binaryString(str+"0", n-1, 0);
        //     binaryString(str+"1", n-1, 1);
        // }
        // else{
        //     binaryString(str+"0", n-1, 0);
        // }

        binaryString(str+"0", n-1, 0);
        if(lastPlace == 0){
            binaryString(str+"1", n-1, 1);
        }
    }




    Generate all binary strings without consecutive 0’s



    public static void binaryStringzero(String str, int n, int lastPlace){
        if(n==0){
            System.out.println(str);
            return;
        }
        binaryStringzero(str+"1", n-1, 1);
        if(lastPlace == 1){
            binaryStringzero(str+"0", n-1, 0);
        }
    }
    public static void main(String[] args) {
        //binaryString(" ", 3, 0);
        binaryStringzero(" ", 3, 1);
    }

    */

    // Assignment

    /*
    
    
    Print index of key where it occur in array
    
    public static int printIndexofKey(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            System.out.print(i + " ");
        }
        return printIndexofKey(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        //int arr[] = {3,2,4,5,6,2,7,2,2,3,6,7,1,5,9,6,4,0};
        printIndexofKey(arr, 2, 0);
    }

    */


    /* 
    


    Convert Digits to Number


    static String number[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static void convertDigitToNumber(int digit){
        if(digit == 0){
            return;
        }
        int lastDigit = digit%10;
        convertDigitToNumber(digit/10);
        System.out.print(number[lastDigit] + " ");
    }
    public static void main(String[] args) {
        //convertDigitToNumber(2019);
        convertDigitToNumber(1947);
    }

   */

    /*
    
    

    Length of String

    
    public static int lengthofString(String str){
        if(str.length() == 0){
            return 0;
        }
        return lengthofString(str.substring(1))+1;
    }
    public static void main(String[] args) {
        String str = "hello world";
        System.out.println(lengthofString(str));
    }

    */

    /*
    
    
    
    Contiguous Substring

    
    public static int contiguousSubstring(String str, int i, int j, int n){
        if(n == 1){
            return 1;
        }
        if(n <= 0){
            return n;
        }
        int res = contiguousSubstring(str, i+1, j, n-1) + 
                  contiguousSubstring(str, i, j-1, n-1) - 
                  contiguousSubstring(str, i+1, j-1, n-2);

        if(str.charAt(i) == str.charAt(j)){
            res++;
        }
        return res;
    }
    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(contiguousSubstring(str, 0, n-1, n));
    }

    */

    public static void towerOfHanoi(int n, String source, String helper, String destination){
        if(n==1){
            System.out.println("Transfer disk " +n+ " from " +source+ " to " +destination);
            return;
        }
        towerOfHanoi(n-1, source, destination, helper);
        System.out.println("Transfer disk " +n+ " from " +source+ " to " +destination);
        towerOfHanoi(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");
    }
} 