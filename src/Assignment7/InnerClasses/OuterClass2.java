package Assignment7.InnerClasses;

public class OuterClass2 extends OuterClass1{
    public OuterClass2(){
        System.out.println("Outer Class 2 Constructor");
    }
    public class InnerClass2 extends OuterClass1.InnerClass1{
        public InnerClass2(String msg){
            super(msg);
            System.out.println("Inner Class 2 constructor");
        }
    }
}
