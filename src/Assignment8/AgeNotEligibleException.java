package Assignment8;

public class AgeNotEligibleException extends Exception{
    private int age;
    public AgeNotEligibleException(int age){
        this.age = age;
    }
    public String toString(){
        return "age is "+age+" should be between 21 and 35";
    }

}
