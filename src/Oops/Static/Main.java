package Oops.Static;


public class Main {
    public static void main(String[] args) {
        Human mani=new Human(21,'M',"Manikandan");
        Human bala=new Human();
        System.out.println(bala.name);
        System.out.println(mani.name);
 //       message();
        System.out.println(Human.present); // static variable
        get();
    }

    //not depends on the object because it is static
    static void get(){
        Main obj=new Main();
        obj.message();
    }
    // non-static method belongs to the object and depends on the object
    void message(){
        System.out.println("Hello");
    }

}
