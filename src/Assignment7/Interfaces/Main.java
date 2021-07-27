package Assignment7.Interfaces;

public class Main extends ConcreteClass implements CombinedInterface{
    @Override
    public void combinedInterfaceMethod() {
            System.out.println("Combined Interface Method");
    }

    @Override
    public void interface1Method1() {
        System.out.println("Interface1  Method1");
    }

    @Override
    public void interface1Method2() {
        System.out.println("Interface1  Method2");
    }

    @Override
    public void interface2Method1() {
        System.out.println("Interface2  Method1");
    }

    @Override
    public void interface2Method2() {
        System.out.println("Interface2  Method2");
    }

    @Override
    public void interface3Method1() {
        System.out.println("Interface3 Method1");
    }

    @Override
    public void interface3Method2() {
        System.out.println("Interface3  Method2");
    }
    public void method1Interface1(Interface1 reference){
        reference.interface1Method1();
        reference.interface1Method2();
    }

    public void method2Interface2(Interface2 reference){
        reference.interface2Method1();
        reference.interface2Method2();
    }

    public void method3Interface3(Interface3 reference){
        reference.interface3Method1();
        reference.interface3Method2();
    }

    public void method4CombinedInterface(CombinedInterface reference){
        reference.combinedInterfaceMethod();
    }
    public static void main(String[] args) {
        Main ob = new Main();
        ob.method1Interface1(ob);
        ob.method2Interface2(ob);
        ob.method3Interface3(ob);
        ob.method4CombinedInterface(ob);
    }
}
