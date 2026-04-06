package Basics;
import java.util.Scanner;

class Palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String t=sc.next();
        int l=t.length();
        String rev="";
        for(int i=l-1;i>=0;i--){
            rev+=t.charAt(i);
        }
        if(rev.equals(t)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }

}