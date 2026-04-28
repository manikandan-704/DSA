package Oops.Interfaces.NestedInterface;

public class A {
    public interface NestedInterface{
        boolean isOdd(int n);
    }
}
class B implements A.NestedInterface{

    @Override
    public boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
