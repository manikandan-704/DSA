package Oops.Inheritance;

public class Main {
    public static void main(String[] args) {

        Child newBox=new Child(1,2,3,22);

        System.out.println(newBox.l+" "+newBox.h+" "+newBox.w+" "+newBox.density);

        Base base=new Child(11,22,33,44);
     //   base.density;  unable to access it
        System.out.println(base);

      //  Child refParent=new Base(1,2,3);  error

    }

}
