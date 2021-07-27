package Assignment7.InnerClasses;

public class OuterClass1 {
    public OuterClass1(){
        System.out.println("Outer Class Constructor");
    }
    public class InnerClass1{
        public InnerClass1(String msg){
            System.out.println(msg);
            System.out.println("Inner Class Constructor");
        }
    }
}
