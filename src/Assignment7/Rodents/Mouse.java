package Assignment7.Rodents;

public class Mouse extends Rodent {
    Mouse(){
        System.out.println("I'm a Mouse.");
    }
    @Override
    void describeMe(){
        System.out.println("I have massive ears");
    }
}
