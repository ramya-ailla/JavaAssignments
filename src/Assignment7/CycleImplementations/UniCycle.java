package Assignment7.CycleImplementations;

public class UniCycle implements Cycle{
    @Override
    public void noOfWheels() {
        System.out.println("Only one Wheel");
    }

    @Override
    public void balancePossible() {
        System.out.println("Rider should balance: Difficult to balance");
    }
}
