package Recursion;

public class Fact {
    static void main(String[] args) {
        int n=9;
        System.out.println(factRec(n));
    }
    static int factRec(int n){
        if(n<=0){
            return 1;
        }
        return n*factRec(n-1);
    }
}
