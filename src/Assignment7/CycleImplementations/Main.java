package Assignment7.CycleImplementations;

public class Main {
    public static void main(String[] args) {
        CycleFactory factory = new CycleFactory();
        Cycle c;
        c = factory.getCycle("UniCycle");
        c.noOfWheels();
        c.balancePossible();

        c=factory.getCycle("BiCycle");
        c.noOfWheels();
        c.balancePossible();

        c= factory.getCycle("TriCycle");
        c.noOfWheels();
        c.balancePossible();
    }
}
