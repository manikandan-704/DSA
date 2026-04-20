package Oops.Inheritance;

public class Child extends Base {
    int density;
    public Child(){
        this.density=42;
    }

    public Child(Child old){
        super(old);
        density=old.density;
    }

    public Child(double l, double h, double w, int density) {
        super(l, h, w);  // Call the parent class constructor
        this.density = density;
    }


    public static void main(String[] args) {
        Base base1=new Base();
        Base base2=new Base(4);
        Base base3=new Base(1,2,3.4);
        Base base4=new Base (base2);

        System.out.println(base1.l+" "+base1.h+" "+base1.w);
        System.out.println(base2.l+" "+base2.h+" "+base2.w);
        System.out.println(base3.l+" "+base3.h+" "+base3.w);
        System.out.println(base4.l+" "+base4.h+" "+base4.w);


    }
}
