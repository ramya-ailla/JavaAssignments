package Assignment5;

public class Singleton {
    String memberVariable;
    public static Singleton setMemberVariable(String s){
        /*
        Non Static memberVariable cannot be instantiated from static Method
        memberVariable = s;

        return this;
        "this" represents the object invoking the method and that static methods are not bound to any object.
        so,we can't use this operator.
         */
        return new Singleton();
    }
    public void print(){
        System.out.println(memberVariable);
    }
}
