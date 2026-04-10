package Basics;

public class revNegative {
    public static void main(String[] args) {
        int n=-1534236469;
        System.out.println(revNeg(n));
    }
    static int revNeg(int x){
        int rev=0;
        while(x!=0){
            int r=x%10;
            x=x/10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                return 0;
            }
            rev=rev*10+r;
        }
        return rev;
    }
}
