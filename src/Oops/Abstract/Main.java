package Oops.Abstract;

public class Main {

    public static void main(String[] args) {

        Son son=new Son(2);
        son.Constructor1();

        Daughter daughter=new Daughter(6);
        daughter.con2();

        Parent.hello();
    }

}
