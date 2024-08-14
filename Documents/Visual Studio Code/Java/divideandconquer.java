public class divideandconquer {

    /*
    
    
    Merge Sort



    public static void MergeSort(int arr[], int si, int ei){
        //base case
        if(si >= ei){
            return;
        }
        //kaam
        int mid = si + (ei-si)/2;
        MergeSort(arr, si, mid); //Left part array divide
        MergeSort(arr, mid+1, ei); //Right part array divide
        Merge(arr, si, mid, ei);
    }

    public static void Merge(int arr[], int si, int mid, int ei){
        //(0,3) = 4 left  (4,6) = 3 right -> 6-0+1 
        int temp[] = new int[ei-si+1]; //Temporary array
        int i = si;
        int j = mid+1;
        int k = 0;

        //Compare Left array element with right and merge
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        //Left array leftover elements
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //Right array leftover elements
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //Copy temporary array to original array
        for(k=0, i=si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }



    */


    /*
     


    Quick Sort




    public static void QuickSort(int arr[], int si, int ei){
        //base case
        if(si >= ei){
            return;
        }
        //kaam
        int pIdx = Partition(arr, si, ei); // Last element - pivot ki sahi jagah
        QuickSort(arr, si, pIdx-1);
        QuickSort(arr, pIdx+1, ei);
    }

    public static int Partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String args[]){
        //int arr[] = {6,3,9,5,2,8};
        int arr[] = {6,3,9,8,2,5};
        //int arr[] = {2,10,45,-3,-11,29,-2};
        //MergeSort(arr, 0, arr.length-1);
        QuickSort(arr, 0, arr.length-1);
        printArray(arr);
    }

    */


    /*
    
    
    Search in Rotated Sorted Array


    
    public static int searchRotatedSorted(int arr[], int target, int si, int ei){
        //base case
        if(si > ei){
            return -1;
        }

        //kaam
        int mid = si + (ei-si)/2;

        //case Found
        if(target == arr[mid]){
            return mid;
        }

        //mid on L1
        if(arr[si] <= arr[mid]){

            //case 1a: left
            if(arr[si] <= target && target <= arr[mid]){
                return searchRotatedSorted(arr, target, si, mid-1);
            }

            //case 1b: right
            else{
                return searchRotatedSorted(arr, target, mid+1, ei);
            }
        }

        //mid on L2
        else{

            //case 2a: right
            if(arr[mid] <= target && target <= arr[ei]){
                return searchRotatedSorted(arr, target, mid+1, ei);
            }
            
            //case 2b: left
            else{
                return searchRotatedSorted(arr, target, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        int tarIndex = searchRotatedSorted(arr, target, 0, arr.length-1);
        System.out.println(tarIndex);
    }

    */

    /*
    
    
    
    String Merge Sort 

    
    public static String[] stringMergeSort(String[] str, int si, int ei){
        //base case
        if(si == ei){
            String[] A = { str[si] };
            return A;
        } 

        //kaam  
        int mid = si + (ei-si)/2;
        String[] arr1 = stringMergeSort(str, si, mid); //left array
        String[] arr2 = stringMergeSort(str, mid+1, ei); //right array
        String[] arr3 = merge(arr1, arr2);
        return arr3;    
    }
    public static String[] merge(String[] arr1, String[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        String[] arr3 = new String [m+n];
        int idx = 0;
        int i = 0;
        int j = 0;

        while(i < m && j < n){
            if(isAlphabeticallySmaller(arr1[i], arr2[j])){
                arr3[idx] = arr1[i];
                i++;
                idx++;
            }
            else{
                arr3[idx] = arr2[j];
                j++;
                idx++;
            }
        }
        while(i < m){
            arr3[idx] = arr1[i];
            i++;
            idx++;
        }
        while(i < m){
            arr3[idx] = arr2[j];
            j++;
            idx++;
        }
        return arr3;
    }
    public static boolean isAlphabeticallySmaller(String str1, String str2){
        if(str1.compareTo(str2) < 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String[] str = {"sun", "earth", "moon", "mercury"};
        String[] a = stringMergeSort(str, 0, str.length - 1);
        for(int i=0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }

    */

    /*
    
    
    Majority Element Brute Force Approach
    
    
    public static int majorityElement(int[] arr){
        int majority = arr.length/2;
        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[j] == arr[i]){
                    count += 1;
                }
            }
            if(count >= majority){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,2,4,5};
        System.out.println(majorityElement(arr));
    }


    */

    private static int countInRange(int arr[], int num, int si, int ei){
        int count = 0;
        for(int i=si; i<=ei; i++){
            if(arr[i] == num){
                count++;
            }
        }
        return count;
    }

    private static int majorityElemenRec(int arr[], int si, int ei){
        //base case
        if(si == ei){
            return arr[si];
        }

        //kaam
        int mid = si + (ei-si)/2;
        int left = majorityElemenRec(arr, si, mid);
        int right = majorityElemenRec(arr, mid+1, ei);

        //if both half has same majority element
        if(left == right){
            return left;
        }

        //otherwise count each element
        int leftcount = countInRange(arr, left, si, ei);
        int rightcount = countInRange(arr, right, si, ei);

        return leftcount > rightcount ? left : right;
    }

    public static int majorityElement(int arr[]){
        return majorityElemenRec(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2,2};
        System.out.println(majorityElement(arr));
    }
}
