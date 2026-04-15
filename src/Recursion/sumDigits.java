package Recursion;

public class sumDigits {
    public static void main(String[] args) {
        int n=123;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n<=0){
            return n;
        }
        return n%10 + sum(n/10);
    }
}
