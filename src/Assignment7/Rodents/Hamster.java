package Assignment7.Rodents;

public class Hamster extends Rodent {
    Hamster(){
        System.out.println("I'm a Hamster.");
    }
    @Override
    void describeMe(){
        System.out.println("I have large ears.");
    }
}
