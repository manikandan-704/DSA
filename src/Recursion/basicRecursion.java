package Recursion;

public class basicRecursion {
    static void main() {
        print(1);
    }
    static void print(int n){
        if(n>=6){
           return;
        }
        System.out.println("hello");
        print(n+1);
    }
}
