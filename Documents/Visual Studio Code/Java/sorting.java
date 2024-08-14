import java.util.*;


public class sorting {

    public static void bubblesort(int numbers[]){
        int swap=0;
        for(int turn=0; turn<numbers.length-1; turn ++){
            for(int j=0; j<numbers.length-1-turn; j++){
                if(numbers[j] > numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    swap++;
                }
            }
        }
        System.out.println("Total swaps : " +swap);
        System.out.println();
    }


    public static void selectionsort(int numbers[]){
        for(int i=0; i<numbers.length-1; i ++){
            int minpos = i;
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[minpos] > numbers[j]){
                    minpos = j;
                }
            }
            int temp = numbers[minpos];
            numbers[minpos] = numbers[i];
            numbers[i] = temp;
        }
    }


    public static void insertionsort(int numbers[]){
        for(int i=1; i<numbers.length; i++){
            int curr = numbers[i];
            int prev = i-1;

            while(prev >= 0 && numbers[prev] > curr){
               numbers[prev+1] =  numbers[prev];
               prev--; 
            }
            numbers[prev+1] = curr;
        }
    }

    public static void countingsort(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            largest = Math.max(largest, numbers[i]);
        }

        int count[] = new int [largest+1];
        for(int i=0; i<numbers.length; i++){
            count[numbers[i]]++;
        }

        int j = 0 ;
        for(int i=0;  i<count.length; i++){
            while(count[i] > 0){
                numbers[j] = i;
                j++;
                count[i]--;
            }
        }

    }


    public static void printarray(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println();
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to enter : ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        System.out.println("Enter the numbers in array");
        for(int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println();
        bubblesort(numbers);
        //selectionsort(numbers);
        //insertionsort(numbers);
        //countingsort(numbers);
        System.out.println("The sorted Array");
        printarray(numbers);
    }

    
}
