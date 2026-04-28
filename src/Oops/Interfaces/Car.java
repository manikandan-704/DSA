package Oops.Interfaces;

public class Car implements Engine, Brake{
    @Override
    public void Start() {
        System.out.println("Pickup speed");
    }

    @Override
    public void Speed() {
        System.out.println("Top speed");
    }

    @Override
    public void Slow() {
        System.out.println("slowdown accuracy");
    }

    @Override
    public void Stop() {
        System.out.println("Brake the speed");
    }
}
