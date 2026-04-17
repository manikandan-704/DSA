package Oops.IntroBasics;


public class Wrapper {
    public static void main(String[] args) {
        int a =10;
        int b =20;
        Integer num = 30; // Object
        swap(a,b);  // Not swap
        System.out.println(a + " "+ b);

        // final cannot be modified
        final int bones=55;  // primitive is final cannot be reAssigned
        // bones=89;

        final A mani=new A("Madesh");
        mani.name="Manikandan"; // can be reassigned value
        System.out.println(mani.name);
      //  mani=new A("varun");   non primitive is final cannot be reAssigned the new object
    }

    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }

    static class A{
        String name;

        A(String name){
            this.name=name;
        }

    }
}
