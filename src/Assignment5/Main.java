package Assignment5;

public class Main {
    public static void main(String[] args) {
        Data dObj = new Data();
        dObj.printInstanceVariables();
        dObj.printLocalVariables();

        Singleton sObj = Singleton.setMemberVariable("Hello");
        sObj.print();
    }
}
