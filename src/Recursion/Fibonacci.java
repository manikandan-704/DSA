package Recursion;

public class Fibonacci {
    static void main() {
        int n=7;                              //1=>0+1=1, 2=>0+1=1, 3=>1+1=2, 4=>1+2=3, 5=>2+3=5, 6=>3+5=8
        int ans=fib(n);
        System.out.println(ans);
    }
    static int fib(int n){
            if(n<2){
                return n;
            }
        return fib(n-1)+fib(n-2);

        }
}
