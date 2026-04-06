package Basics;

class Amstrong{
    public static void main(String[] args) {
        int n=158;
        int og=n;
        int sum=0;
        while(n>0){
            int rem=n%10;
            int c=rem*rem*rem;
            sum=sum+c;
            n=n/10;
        }
        if(sum==og){
            System.out.println("amstrong");
        }
        else{
            System.out.print("not");
        }
    }
}