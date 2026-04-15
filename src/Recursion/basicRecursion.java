package Recursion;

public class basicRecursion {
    static void main() {
        print(1);
        print2(10);
    }
    static void print(int n){
        if(n>=6){
           return;
        }
        System.out.println("hello");
        print(n+1);
    }
    static void print2(int n){
        if(n<=0){
            return;
        }
        print2(n-1);
        System.out.println(n);
    }
}
