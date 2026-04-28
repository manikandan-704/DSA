package Oops.Abstract;

public abstract class Parent {

    int age;

    public Parent(int age){
        this.age=age;
    }

    static void hello(){
        System.out.println("hey");     //static method can be created in abstract class
        // we cannot create constructor for the abstract class as well as the object in the main class
    }

    abstract void Constructor1();
    abstract void con2();

}
