package Recursion;

public class PrintTillN {
    static void main(String[] args) {
        int n=5;
        PrintTillN(n);
    }
    static void PrintTillN(int n){
        if(n==0){
            return;
        }
        PrintTillN(n-1);
        System.out.print(n+" ");
    }
}
