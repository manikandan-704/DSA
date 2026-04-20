package Oops.Inheritance;

public class Base {
    double l;
    double h;
    double w;

  public Base(){
     this.l=1;
     this.h=1;
     this.w=1;
  }

   public Base(double val){
     this.l=val;
     this.h=val;
     this.w=val;
   }

    public Base(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Base(Base old){
      this.l=old.l;
      this.h=old.h;
      this.w=old.w;
    }

    public static void main(String[] args) {
        Child child1=new Child();
        System.out.println(child1.density);
    }


}
