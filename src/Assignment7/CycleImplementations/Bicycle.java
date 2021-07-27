package Assignment7.CycleImplementations;

public class Bicycle implements Cycle{

    @Override
    public void noOfWheels() {
        System.out.println("2 wheels");
    }

    @Override
    public void balancePossible() {
        System.out.println("Rider should balance; Moderate balance");
    }
}
