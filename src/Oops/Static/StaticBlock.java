package Oops.Static;

public class StaticBlock {
    static int a=5;
    static int b;
    static {
        System.out.println("I run only once Because i'm in static block");
        b=a*3;
    }
    public static void main(String[] args) {

        StaticBlock obj1=new StaticBlock();
        System.out.println(a+" "+b);

        StaticBlock.b+=5;
        System.out.println(a+" "+b);

        StaticBlock obj2=new StaticBlock();
        System.out.println(a+" "+b);
    }
}
