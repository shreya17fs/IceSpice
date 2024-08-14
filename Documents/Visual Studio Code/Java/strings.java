import java.util.*;

public class strings {

    /*
    
    CHECK IF STRING IS A PALINDROME OR NOT
    
    
    public static boolean palindrome(String str){
        for(int i=0;i<=str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                System.out.println("The string " + str + " is not a palindrome ");
                return false;
            }
        }
        System.out.println("The string " + str + " is a palindrome ");
        return true;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter the string : ");
        str = sc.nextLine();
        System.out.println(palindrome(str));
    }

    */


    /*
    
    SHORTEST PATH
    
    
    public static float getshortestpath(String path){
        int x = 0, y = 0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'N'){
                y++;
            }
            else if(dir == 'S'){
                y--;
            }
            else if(dir == 'E'){
                x++;
            }
            else{
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(getshortestpath(path));
    }

    */


    /*


    SUBSTRING


    public static String substring(String str, int si, int ei){
        String substring = new String();
        for(int i=si;i<ei;i++){
            substring += str.charAt(i);
        }
        return substring;
    }
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter the string : ");
        str = sc.nextLine();
        System.out.print("Enter the starting index : ");
        int si = sc.nextInt();
        System.out.print("Enter the ending index : ");
        int ei = sc.nextInt();
        //System.out.print("The final string is : " +(substring(str, si, ei)));
        System.out.println("The final string is : " + str.substring(si,ei));
    }

    */


    /*


    LARGEST STRING
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings you want : ");
        String fruits[] = new String[sc.nextInt()];
        sc.nextLine();
        System.out.println("Enter the strings : ");
        for(int i=0;i<fruits.length;i++){ 
            fruits[i] = sc.nextLine();
        }
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println("The Largest string is : " +largest);       
    }

    */

    /*
    
    
    APPEND STRING USING STRING BUILDER
    
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch ='a'; ch<='z';ch++){
            System.out.println(sb.append(ch));
        }
        System.out.println("The final string is : ");
        System.out.println(sb);
        System.out.println("The length of the string is : ");
        System.out.println(sb.length());
    }

    */

    /*
    
    
    LOWER CASE TO UPPER CASE 

    public static String touppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<=str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter the strings : "); 
        str = sc.nextLine();
        System.out.println("The updated string is : ");
        System.out.println(touppercase(str));
    }

    */

    /*
    
    
    COMPRESS THE STRING
    
    public static String compressusingstr(String str){
        String newstr = "";
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count > 1){
                newstr += count.toString();
            }
        }
        return newstr;
    }

    public static String compress(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter the strings : "); 
        str = sc.nextLine();
        System.out.println("The compressed  string is : ");
        //System.out.println(compress(str));
        System.out.println(compressusingstr(str));
    }


    */

    /* 


    NUMBER OF VOWELS IN A STRING


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter the strings : "); 
        str = sc.nextLine();
        
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count ++;
            }
        }
        System.out.println("The number of vowels are : " + count);

    }

    */
    public static void anagram(String str1, String str2){

        //Convert Strings to lowercase. Why? so thatwe don't have to checkseparately for lower & uppercase.
        
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        // First check - if the lengths are the same

        if(str1.length() ==str2.length())  {

            // convert strings into char array

            char str1Arr[]=str1.toCharArray();
            char str2Arr[]=str2.toCharArray(); 

            // sort the char array 

            Arrays.sort(str1Arr);
            Arrays.sort(str2Arr);

            // if the sorted char arrays are same or identical then the strings are anagram 

            if(Arrays.equals(str1Arr,str2Arr)){
                System.out.println(str1+ " and " +str2+ " are anagrams of each other ");
            }
            else{
                System.out.println(str1+" and "+str2+" are not anagrams ofeach other.");
            }
        }
        else{  

            // case when lengths are not equal

            System.out.println(str1+" and "+str2+" are not anagrams of eachother.");
        }          
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string 1 : ");
        String str1 = sc.nextLine();
        System.out.print("Enter string 2 : ");
        String str2 = sc.nextLine();
        anagram(str1, str2);   
    }   

}
