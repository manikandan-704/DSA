package Oops.Abstract;

public class Daughter extends Parent {
    public Daughter(int age) {
        super(age);
    }

    @Override
    void Constructor1() {
        System.out.println("I'm Daughter");
    }

    @Override
    void con2() {
        System.out.println("I'm a girl");
    }
}
