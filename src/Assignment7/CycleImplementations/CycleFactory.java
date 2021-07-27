package Assignment7.CycleImplementations;

public class CycleFactory {
    public Cycle getCycle(String type){
        if(type.equals("UniCycle")){
            return new UniCycle();
        }
        else if(type.equals("BiCycle")){
            return new Bicycle();
        }
        else
            return new TriCycle();
    }
}
