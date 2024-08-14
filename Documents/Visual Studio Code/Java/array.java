import java.util.*;

public class array {
    
   /*
   
     LINEAR SEARCH 
   
   
    public static int LinearSearch (int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
     
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[20];
        System.out.print("Enter the number of elements you want to enter : ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers in array");
        for(int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the element you want to find : ");
        int key = sc.nextInt();
        int index = LinearSearch(numbers,key);
        if(index == -1)
        {
            System.out.println("Number not found");
        }
        else 
        {
            System.out.println("The number is found at the index : " +index);
        }
    }

    */

    /*

     LARGEST IN ARRAY


    public static int Largest (int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i])
            {
                largest = numbers[i];
            }
        }
        return largest;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[20];
        System.out.print("Enter the number of elements you want to enter : ");
        int n = sc.nextInt();
        System.out.println("Enter the numbers in array");
        for(int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("The largest number is : " +Largest(numbers));
        
        
    }
    */    
     
    /*
    
    SMALLEST IN ARRAY
    
    
    
    public static int Smallest (int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
          if(smallest > numbers[i])
          {
              smallest = numbers[i];
          }
      }
      return smallest;
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
        System.out.println("The smallest number is : " +Smallest(numbers));
        
    }


    */

    /*
    
    BINARY SEARCH
    
    public static int BinarySearch(int numbers[], int key){
        int start = 0, end = numbers.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;

            if(numbers[mid] == key){
                return mid;
            }

            if(numbers[mid] < key){
                start = mid + 1;
            }

            else {
                end =  mid - 1;
            }
        }
        return -1;
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
        System.out.print("Enter the number you want to find : ");
        int key = sc.nextInt();

        System.out.println("Index for key is : "  +BinarySearch(numbers, key));
    }

    */


    /*
    
    REVERSE OF AN ARRAY

    
    public static void Reversearray(int numbers[]){
        int first = 0, last = numbers.length - 1;

        while(first < last){

            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first ++;
            last --;
        }
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
        System.out.println("The reverse of the given array : ");
        Reversearray(numbers);
        for(int i=0; i<numbers.length; i++){
           System.out.println(numbers[i]);
        }

        System.out.println();
    }

    */

    /*
    
    PAIRS IN AN ARRAY
    
    
    public static void PairsArray(int numbers[]){
        int totalpair = 0;
        for(int i=0; i<numbers.length; i++){
            int current = numbers[i];
            for(int j=i+1; j<numbers.length; j++){
                System.out.print( "(" + current + "," + numbers[j] + ")" );
                totalpair ++;
            }
            System.out.println();
       }
       System.out.print("The total number of pairs : " + totalpair);
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
        System.out.println("The Pairs of the array : ");
        PairsArray(numbers);
    }

    

   
    /*
    
    
    PRINT SUBARRAYS OF AN ARRAY
    
    
    public static void SubArray(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end ; k++){
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
       }
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
        System.out.println("The Subarrays : ");
        SubArray(numbers);
    }


    */



    /*
    
    
    SUM OF SUBARRAYS
    
    public static void SubArray(int numbers[]){
        int sum = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end ; k++){    
                    sum = sum + numbers[k];
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
                System.out.println("The sum of the array is : " + sum);
                sum = 0;
                System.out.println();
            }
            System.out.println();
       }
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
        System.out.println("The Subarrays and it's sum : ");
        SubArray(numbers);
    }


    */

    /*
    
    MAXIMUM SUBARRAY SUM
    
    
    public static void MaxSubArraySum(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currsum = 0;
                for(int k=start; k<=end ; k++){    
                    currsum = currsum + numbers[k];
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
                System.out.println("The sum of the array is : " + currsum);               
                System.out.println();
                if (maxsum < currsum){
                    maxsum = currsum;
                }
            }
            System.out.println();
       }
       System.out.println("The max sum among the subarrays : " + maxsum);
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
        System.out.println("The Subarrays and it's sum : ");
        MaxSubArraySum(numbers);
    }

    */


    /*
    
    PREFIX MAX SUM OF SUBARRAYS
    
    
    public static void PrefixSubArraySum(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length]; 
        prefix[0] = numbers[0];
        
        // Calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1]  + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start; k<=end ; k++){    
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start -1];                
                System.out.println("The sum of the array is : " + currsum);               
                System.out.println();
                if (maxsum < currsum){
                    maxsum = currsum;
                }
            }
            System.out.println();
        }
        System.out.println("The max sum among the subarrays : " + maxsum);
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
        PrefixSubArraySum(numbers);
    }

    */


    /*
    
    
    KADANE'S MAX SUBARRAY SUM


    
    public static void KadaneSubArraySum(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
                currsum = currsum + numbers[i];
                if(currsum < 0){
                    currsum = 0;
                }
            maxsum = Math.max(currsum, maxsum);
        }
        System.out.println("The max sum among the subarrays : " + maxsum);
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
        KadaneSubArraySum(numbers);
    }


    */


    /*
    
    
    KADANE'S SUBARRAY  SUM FOR NEGATIVE NUMBER
    
    
    public static int KadaneNegSubArraySum(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int negative = 1;
        int minum = numbers[0];
        for(int i=0; i<numbers.length; i++){
            if (numbers[i] >= 0){
                // When array contains positive value
                negative = 0;
            }
            currsum = currsum + numbers[i];
            if(currsum < 0){
                currsum = 0;
            }
            maxsum = Math.max(currsum, maxsum);
            if (minum < numbers[i]){
                minum = numbers[i];
            }
            }
            if (negative == 1)
            {
                return minum;
            }
            return maxsum;
        }

    public static int KadaneSubArraySum(int numbers[]){
            int currsum;
            int maxsum;
            currsum = maxsum = numbers[0];
            for(int i=1; i<numbers.length; i++){
                   currsum=Math.max(numbers[i],currsum+numbers[i]);
                   maxsum=Math.max(currsum,maxsum);
            }
        return maxsum;    
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
        System.out.println(KadaneNegSubArraySum(numbers)); 
    }
    

    */
    
    /*
    
    
    CALCULATE THE TOTAL TRAPPED RAIN WATER 
    
    
    public static int trappedRainwater(int height[], int width){

        // Calculate left max boundary
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        //Calculate right max boundary
        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];
        for(int i=height.length-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        //Loop
        int trappedWater = 0;
        for(int i=0; i<height.length; i++){

            // Water level
            int waterLevel = Math.min(leftmax[i], rightmax[i]);

            // Trapped water = (waterlevel - height[i]) * width
            trappedWater = trappedWater + (waterLevel - height[i]) * width;
        }

        return trappedWater;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to enter : ");
        int n = sc.nextInt();
        int height[] = new int[n];
        System.out.println("Enter the heights of the bars");
        for(int i=0; i<n; i++){
            height[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter the width of the bars : ");
        int width = sc.nextInt();
        System.out.println();
        System.out.print("The total amount of water trapped : ");
        System.out.println(trappedRainwater(height, width)); 
    }


    */


    /*
    
    
    BUY AND SELL STOCKS
    
    
    
    public static int BuyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            System.out.println("The price of the stock on the day : " + prices[i]);
            if(buyPrice < prices[i]){
                System.out.println("The minimum buying price to attain max profit is : " + buyPrice);
                int profit = prices[i] - buyPrice ;
                System.out.println( "The profit : " + profit);
                System.out.println();
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to enter : ");
        int n = sc.nextInt();
        int prices[] = new int[n];
        System.out.println("Enter the Prices of the stocks");
        for(int i=0; i<n; i++){
            prices[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("The Maximum Profit : " + BuyAndSellStocks(prices) );
    }


    */



    /*
    
    
    REPEATED NUMBERS IN AN ARRAY
    
    
    public static boolean duplicate(int nums[]){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }                   
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to enter : ");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter the numbers in the array");
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println(duplicate(nums));
    } 

    */


    /*
    
    ROTATED SORTED ARRAY
    

    public static void Rotate(int arr[], int d, int n){
        int temp[] = new int[n];
        int k = 0;
 
        for (int i = d; i < n; i++) {
           temp[k] = arr[i];
           k++;
        }
 
        for (int i = 0; i < d; i++) {
           temp[k] = arr[i];
           k++;
        }
 
        for (int i = 0; i < n; i++) {
           arr[i] = temp[i];
        }
    }
 

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to enter : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers in the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter the pivot index : ");
        int d = sc.nextInt();
        System.out.println();
    
        System.out.println("The rotated array : ");
        Rotate(arr, d, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    */

   /* 
    
    SEARCH THE NUMBER IN ROTATED SORTED ARRAY




    public static int search(int arr[], int targetarr){
        int min = minsearch(arr);
        if(arr[min] <= targetarr && targetarr <= arr[arr.length - 1]){
            return search(arr, min, arr.length-1, targetarr);
        }
        else{
            return search(arr, 0, min, targetarr);
        }
    }

    public static int search(int arr[], int left, int right, int targetarr){
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == targetarr){
                return mid;
            }
            else if(arr[mid] > targetarr){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int minsearch(int arr[]){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(mid>0 && arr[mid-1] > arr[mid]){
                return mid;
            }
            else if(arr[left] <= arr[mid] && arr[mid] > arr[right]){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to enter : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers in the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.print("Enter the element you want to search : ");
        int targetarr = sc.nextInt();
        System.out.println();
        System.out.println("The smallest element index : " + minsearch(arr));
        System.out.println("The array found at index : " + search(arr, targetarr) );
    } 

    */
    
        
}
