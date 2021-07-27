package Assignment7.Cycles;

public class CyclesMain {
    public static void main(String[] args) {
        Cycle [] cycles =new Cycle[3];
        //upcasting
        cycles[0]=new Unicycle();
        cycles[1]= new Bicycle();
        cycles[2]=new TriCycle();
        /*Cycle class does not have balance method
        for(int i=0;i<3;i++){
            cycles[i].balance();
        }
        */
        //DownCasting
        Unicycle unicycle= (Unicycle) cycles[0];
        Bicycle bicycle = (Bicycle) cycles[1];
        TriCycle triCycle = (TriCycle) cycles[2];

        unicycle.balance();
        bicycle.balance();
        //triCycle.balance();  error since tricycle doesn't have balance method
    }
}
