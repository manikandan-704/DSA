package Oops.Abstract;

public class Son extends Parent {


    public Son(int age) {
        super(age);
    }

    @Override
    void Constructor1() {
        System.out.println("i'm son");
    }

    @Override
    void con2() {
        System.out.println("I'm boy");
    }




}
