package String;

import java.util.Arrays;

public class ReverseString {
    static void main(String[] args) {
        String s="manikandan";
        System.out.println(reverse(s));
        System.out.println(revString(s));
        System.out.println(revStringBuilder(s));
    }

    // using toCharArray() Methode
    public static String reverse(String s){
        s=s.trim();
        char[] arr=s.toCharArray();
        int start=0;
        int end=s.length()-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        return new String(arr);
    }
    static void swap(char[] s,int a, int b){
        char temp=s[a];
        s[a]=s[b];
        s[b]=temp;
    }

    // Normal loop and concat
    public static String revString(String s){
        String rev="";
        for (int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return rev;
    }

    //Using StringBuilder append Method
    public static String revStringBuilder(String s){
        StringBuilder rev= new StringBuilder();
        for (int i=s.length()-1;i>=0;i--){
            rev.append(s.charAt(i));
        }
        return rev.toString();
    }
}
