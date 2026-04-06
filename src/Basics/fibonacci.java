package Basics;
import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=1;
        while(a<n){
            System.out.print(a +" " );
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
}