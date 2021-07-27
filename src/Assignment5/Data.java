package Assignment5;

public class Data {
    private int instanceVariable1;
    private char instanceVariable2;
    void printInstanceVariables(){
        //initialized to default values
        System.out.println(instanceVariable1+ " "+instanceVariable2);
    }
    void printLocalVariables(){
        int localVariable1;
        char localVariable2;
        /* local variables should be initialized before using them else it causes error
        System.out.println(localVariable1+" "+localVariable2);
        */
    }
}
