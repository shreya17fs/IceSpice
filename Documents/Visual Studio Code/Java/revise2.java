import java.util.*;
public class revise2 {
    public static String reversestring(String str){
        String reversestr = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            reversestr = ch+reversestr;
        }
        return reversestr;
    }
    public static void main(String args[]){
        System.out.println(reversestring("Hello"));
    }
}