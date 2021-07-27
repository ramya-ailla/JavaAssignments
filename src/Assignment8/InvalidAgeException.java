package Assignment8;

public class InvalidAgeException extends Exception {
    private int age;
    InvalidAgeException(int age){
        this.age = age;
    }
    @Override
    public String toString(){
        return "age :"+age+" is not valid number";
    }
}
